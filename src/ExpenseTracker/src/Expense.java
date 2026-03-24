/**
 * Class representing an expense transaction.
 * Inherits from the abstract Transaction class.
 */
public class Expense extends Transaction {

    /**
     * Constructor to initialize an Expense.
     * calls the superclass constructor to set fields.
     * 
     * @param amount   the positive expense amount
     * @param category the category of the expense
     * @param date     the date of the expense
     */
    public Expense(double amount, String category, String date) {
        super(amount, category, date);
    }

    /**
     * Overrides the display method to format and print the expense details.
     * Note: Prints amount with a negative sign as per formatting requirements.
     */
    @Override
    public void display() {
        System.out.println("[EXPENSE] Category: " + getCategory() + " | Amount: -" + getAmount() + " | Date: " + getDate());
    }
}
