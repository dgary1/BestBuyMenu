
public class StoreItem {
    private String itemCode;
    private String itemDescription;
    private String itemPrice;

    public StoreItem(String code, String descrip, String p) {
        itemCode = code;
        itemDescription = descrip;
        itemPrice = p;
    }
    public void setCode(String c) {
        itemCode = c;
    }
    public void setDescript(String d) {
        itemDescription = d;
    }
    public void setPrice(String price) {
        itemPrice = price;
    }
    public String getCode() {
        return itemCode;
    }
    public String getDescription() {
        return itemDescription;
    }
    public String getPrice() {
        return itemPrice;
    }
}
