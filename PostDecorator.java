// Decorator class for classes that happen after the main receipt part

public class PostDecorator extends Decorator {
    private AddOn a;

    public PostDecorator(AddOn a, Receipt r) {
        super(r);
        this.a = a;
    }
    public void prtReceipt() {
        callTrailer();
        System.out.println(a.getLine());
    }
}
