
public abstract class TaxComputation {
    public abstract double computeTax(PurchasedItems items, Date date);
    protected abstract boolean taxHoliday(Date d);
}
