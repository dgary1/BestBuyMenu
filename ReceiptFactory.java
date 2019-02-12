// **********************************
// David Gary
// COSC 436 - OOP Design
// Assignment 5 - Decorator Pattern
// Dr. Dierbach
// ReceiptFactory class
// **********************************


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReceiptFactory {
    protected String header;
    protected String state_code;
    private TaxComputation[] taxComputationsObjs;
    private TaxComputation taxState;
    private AddOn[] addOns;

    public ReceiptFactory() {
        // AddOn arrayList composed of all different types of addOns
        addOns = new AddOn[5];
        addOns[0] = new HolidayGreeting();
        addOns[1] = new Rebate1406();
        addOns[2] = new Rebate3610();
        addOns[3] = new Coupon100Get10Percent();
        addOns[4] = new Coupon200Get25Percent();
        // Reads config file to assign store_num, street_addr, etc.
        try {
            Scanner input = new Scanner(new File("BestBuyAddress.txt"));
            header = input.nextLine();
            state_code = input.nextLine();
            // Based on the state code (e.g., “MD”, from the config file) stores appropriate
            // StateComputation object to be used on all receipts.
            switch (state_code) {
                case "CA": taxState = new CATaxComputation();
                    break;
                case "DE": taxState = new DETaxComputation();
                    break;
                case "MA": taxState = new MATaxComputation();
                    break;
                case "MD": taxState = new MDTaxComputation();
                    break;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Oops, File Not Found!");
        }
    }
    public Receipt getReceipt(PurchasedItems items, Date d) {
        // 1.	Sets the current date of the BasicReceipt.
        // 2.	Attaches the StateComputation object to the BasicReceipt (by call to the setComputation
        // method of BasicReceipt).
        Receipt receipt = new BasicReceipt(items, d, header, state_code);
        ((BasicReceipt)receipt).setTaxComputation(taxState);
        // 3.	Traverses over all AddOn objects, calling the applies method of each. If an AddOn object
        // applies, then determines if the AddOn is of type SecondaryHeader, Rebate, or Coupon.
        // If of type SecondaryHeader, then creates a PreDecorator for othe AddOn. If of type Rebate or
        // Coupon, then creates a PostDecorator.
        for (AddOn a: addOns) {
            if (a instanceof AddOn) {
                if ((a).applies(items)) {
                    receipt = (a instanceof Rebate || a instanceof Coupon)?new PostDecorator(a, receipt):new PreDecorator(a, receipt);
                }
            }
        }
        return receipt;
    }
}
