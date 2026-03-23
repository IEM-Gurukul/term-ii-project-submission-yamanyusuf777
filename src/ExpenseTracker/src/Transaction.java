/**
 * Abstract class representing a generic financial transaction.
 * Serves as the base class for Income and Expense.
 */
public abstract class Transaction {
    // Encapsulated private fields
    private double amount;
    private String category;
    private String date;

    /**
     * Constructor to initialize the transaction details.
     * 
     * @param amount   the total transaction amount
     * @param category the category of the transaction
     * @param date     the date of the transaction as a String (e.g., "2025-07-10")
     */
    public Transaction(double amount, String category, String date) {
        this.amount = amount;
        this.category = category;
        this.date = date;
    }

    /**
     * Gets the transaction amount.
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Gets the transaction category.
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * Gets the transaction date.
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * Abstract method to be overridden by subclasses to display transaction details.
     */
    public abstract void display();
}
