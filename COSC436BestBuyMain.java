// **********************************
// David Gary
// COSC 436 - OOP Design
// Assignment 5 - Decorator Pattern
// Dr. Dierbach
// Client/Driver
// **********************************

import java.util.*;

public class COSC436BestBuyMain {
    public static void main(String [] args) {
        int month, day, year, option = 0;
        String g = "";

        // getting receipt date and creating receipt date
        System.out.println("Welcome! Please enter the date (Months/Day/Year) ");
        System.out.print("Month: ");
        month = getInt(g);
        while (month <= 0 || month > 12) {
            System.out.print("Whoops! That's not a month. Try again. Re-enter: ");
            month = getInt(g);
        }
        System.out.print("Day: ");
        day = getInt(g);
        while (day <= 0 || day > 31) {
            System.out.print("Whoops! That's not a day. Try again. Re-enter: ");
            day = getInt(g);
        }
        System.out.print("Year: ");
        year = getInt(g);
        while (year <= 1965 || year > 2016) {
            System.out.print("Whoops! That's not the correct year. Try again. Re-enter: ");
            year = getInt(g);
        }
        Date date = new Date(month, day, year);

        // creates a Purchased items arraylist to make it easy to traverse to find total costs
        PurchasedItems items = new PurchasedItems();
        ReceiptFactory factory = new ReceiptFactory();

        // initial menu to get PurchasedItems arrayList started
        menu();

        // getInt is a method designed to verify its taking in the correct
        // data type for the variable. Sometimes, a user enters a char or
        // string and it helps to not HALT the entire program.
        System.out.print("Choice: ");
        option = getInt(g);
        // input validation used to verify a user is choosing an option that
        // is a valid option (a.k.a. one of the actual options).

        while (option <= 0 || option > 8) {
            System.out.println("Whoops! That's not an option. Try again: ");
            option = getInt(g);
        }

        // As long as the option isn't 8 (which is to quit), the program will keep asking to add items to the
        // purchased items arraylist
        while (option != 8) {
            switch (option) {
                case 1: items.addItems(new StoreItem("2030", "Apple MacBook 13.3\" Pro", "1299"));
                    break;
                case 2: items.addItems(new StoreItem("2130", "Samsung Gear 2", "299"));
                    break;
                case 3: items.addItems(new StoreItem("2342", "Surface Studio", "2999"));
                    break;
                case 4: items.addItems(new StoreItem("5347", "AAAA Batteries", "25"));
                    break;
                case 5: items.addItems(new StoreItem("4354", "Google Chromecast", "69"));
                    break;
                case 6: items.addItems(new StoreItem("9876", "Printer paper ", "1.99"));
                    break;
                case 7: items.addItems(new StoreItem("7777", "Mechanical Pencils", "9.99"));
                    break;
            }
            menu();
            System.out.println("Would you like to add something else today?\nIf so, choose another option. If you would \nlike to exit and see your total, select option 8.");
            System.out.print("Choice: ");
            option = getInt(g);
            while (option <= 0 || option > 8) {
                System.out.println("Whoops! That's not an option. Try again: ");
                option = getInt(g);
            }
        }
        // Returns decorated BasicReceipt object as type Receipt.
        Receipt receipt = factory.getReceipt(items, date);
        receipt.prtReceipt();
    }
    // method used to verify the user is putting in an integer and no other data type
    public static int getInt(String g) {
        Scanner input = new Scanner(System.in);
        while(!input.hasNextInt()) {
            System.out.print("Error! Wrong input type. Try again. Enter a key for split: ");
            input.next();
        }
        return input.nextInt();
    }
    // display menu
    public static void menu() {
        System.out.println("\nMenu");
        System.out.println("----------------------------");
        System.out.println("1 <- Apple MacBook 13.3\" Pro    $1299");
        System.out.println("2 <- Samsung Gear 2              $299");
        System.out.println("3 <- Surface Studio             $2999");
        System.out.println("4 <- AAAA Batteries               $25");
        System.out.println("5 <- Google Chromecast            $69");
        System.out.println("6 <- Printer paper              $1.99");
        System.out.println("7 <- Mechanical Pencils         $9.99");
        System.out.println("8 <- Exit and get total\n");
    }
}