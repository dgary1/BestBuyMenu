// Coupon100Get10Percent class

public class Coupon100Get10Percent implements AddOn, Coupon {
    public boolean applies(PurchasedItems p) {
        if (p.getTotalCost() >= 100)
            return true;
        else
            return false;
    }
    public String getLine() {
        return "Get 10% off your next purchase.";
    }
}
