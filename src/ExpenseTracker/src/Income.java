/**
 * Class representing an income transaction.
 * Inherits from the abstract Transaction class.
 */
public class Income extends Transaction {

    /**
     * Constructor to initialize an Income transaction.
     * Calls the superclass constructor to set the transaction details.
     * 
     * @param amount   the positive income amount
     * @param category the category of the income (e.g., Salary)
     * @param date     the date of the income
     */
    public Income(double amount, String category, String date) {
        super(amount, category, date);
    }

    /**
     * Overrides the display method to format and print the income details.
     * Includes a "+" sign for the amount.
     */
    @Override
    public void display() {
        System.out.println("[INCOME]  Category: " + getCategory() + " | Amount: +" + getAmount() + " | Date: " + getDate());
    }
}
