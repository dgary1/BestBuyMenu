
public class Rebate1406 implements AddOn, Rebate {
    public boolean applies(PurchasedItems items) {
        return items.containsItem("1406");
    }

    public String getLine() {
        return "Mail-in Rebate for Item #";
    }
}
