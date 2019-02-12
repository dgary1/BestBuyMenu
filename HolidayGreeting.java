// predecorator type for the Receipt

public class HolidayGreeting implements AddOn, Greeting{
    public boolean applies(PurchasedItems items) {
        return false;
    }

    public String getLine() {
        return "Happy Holiday's from Best Buy!";
    }
}
