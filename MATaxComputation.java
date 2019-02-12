// ComputationTax object for Massachusetts

public class MATaxComputation extends TaxComputation {
    public double computeTax(PurchasedItems items, Date date) {
        double tax;
        if (taxHoliday(date) == true) {
            return tax = 0.0;
        } else {
            return tax = items.getTotalCost() * .0625;
        }
    }
    public boolean taxHoliday(Date date) {
        boolean holiday;
        if (date.getMonth() == 8 && (date.getDay() == 13 || date.getDay() == 14) && (date.getYear() == 2016)) {
            holiday = true;
        } else {
            holiday = false;
        }
        return holiday;
    }
}
