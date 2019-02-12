// Coupon200Get25Perecent class

public class Coupon200Get25Percent implements AddOn, Coupon {
    public boolean applies(PurchasedItems items) {
        if (items.getTotalCost() >= 200)
            return true;
        else
            return false;
    }

    public String getLine() {
        return "Get 25% off your next purchase.";
    }
}
