
public class Rebate3610 implements AddOn, Rebate {
    public boolean applies(PurchasedItems items) {
        return items.containsItem("3610");
    }
    public String getLine() {
        return "Mail-in Rebate for Item #";
    }
}
