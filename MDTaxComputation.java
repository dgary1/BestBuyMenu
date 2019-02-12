// ComputationTax class for Maryland

public class MDTaxComputation extends TaxComputation {
    public double computeTax(PurchasedItems items, Date date) {
        double tax;
        if (taxHoliday(date) == true) {
            return tax = 0.0;
        } else {
            return tax = items.getTotalCost() * .06;
        }
    }
    public boolean taxHoliday(Date date) {
        return false;
    }
}
