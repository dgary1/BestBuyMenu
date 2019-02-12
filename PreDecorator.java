// predecorator class for greetings, and store info and the like

public class PreDecorator extends Decorator {
    private AddOn a;

    public PreDecorator(AddOn a, Receipt r) {
        super(r);
        this.a = a;
    }
    public void prtReceipt() {
        System.out.println(a.getLine());
        callTrailer();
    }
}
