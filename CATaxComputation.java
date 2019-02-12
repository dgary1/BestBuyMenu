// TaxComputation class for CA

public class CATaxComputation extends TaxComputation{
    public double computeTax(PurchasedItems items, Date date) {
        double tax = 0.0;
        if (taxHoliday(date) == true) {
             tax = 0.0;
        } else {
             tax = items.getTotalCost() * 0.075;
        }
        return tax;
    }
    public boolean taxHoliday(Date date) {
        return false;
    }
}
