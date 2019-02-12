// AddOn Interface

public interface AddOn {
    public boolean applies(PurchasedItems items);
    public String getLine();
}
