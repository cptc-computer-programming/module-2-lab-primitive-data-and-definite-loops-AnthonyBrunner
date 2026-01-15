package day2.part01_receipt_totals;

public class ReceiptTotals {

    public static void main(String[] args) {
        printReceiptSummary();
        printClosingCountdown();
    }

    // Scenario:
    
    
    // Every 3rd item starting at 100 is on sale for $3 instead.
    public static void printReceiptSummary() {
        int totalcost = 0;

        // A store sold items numbered 100 through 105.
        for (int item = 100; item <= 105; item ++) {

            if ((item - 100) % 3 == 0){
                totalcost += 3;
            } else {
                // take a running total
                // Each item costs $5.
                totalcost += 5;  
            }
        }

        System.out.println("Total Cost: $" + totalcost);

    }

    // Print a countdown from 5 down to 0 on one line.
    public static void printClosingCountdown() {

        for (int i = 5; i >= 0; i --) {

            System.out.print(i + "  ");
        }
    
    }
    
}
