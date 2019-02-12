// can not instantiate any object of type Decorator

public abstract class Decorator implements Receipt {
    private Receipt trailer;

    public Decorator(Receipt r) {
        trailer = r;
    }
    public void callTrailer() {
        trailer.prtReceipt();
    }

    public abstract void prtReceipt();
}
