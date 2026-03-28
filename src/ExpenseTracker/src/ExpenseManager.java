import java.util.ArrayList;

/**
 * Manages the collection of financial transactions.
 * Provides methods to add, display, and calculate totals.
 */
public class ExpenseManager {
    // List to store both Income and Expense transactions
    private ArrayList<Transaction> transactions;

    /**
     * Constructor initializes the transactions list.
     */
    public ExpenseManager() {
        this.transactions = new ArrayList<>();
    }

    /**
     * Adds a given transaction to the list.
     * @param t the transaction to add
     */
    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    /**
     * Loops through the list and calls display() on each transaction.
     */
    public void displayAll() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions found.");
            return;
        }
        for (Transaction t : transactions) {
            t.display();
        }
    }

    /**
     * Returns the sum of all Income amounts.
     * @return total income
     */
    public double getTotalIncome() {
        double total = 0;
        for (Transaction t : transactions) {
            if (t instanceof Income) {
                total += t.getAmount();
            }
        }
        return total;
    }

    /**
     * Returns the sum of all Expense amounts.
     * @return total expenses
     */
    public double getTotalExpense() {
        double total = 0;
        for (Transaction t : transactions) {
            if (t instanceof Expense) {
                total += t.getAmount();
            }
        }
        return total;
    }

    /**
     * Returns the balance calculated as (Total Income - Total Expense).
     * @return balance
     */
    public double getBalance() {
        return getTotalIncome() - getTotalExpense();
    }

    /**
     * Prints a summary of total income, total expenses, and balance.
     */
    public void showSummary() {
        System.out.println("--- Summary ---");
        System.out.println("Total Income:  " + getTotalIncome());
        System.out.println("Total Expense: " + getTotalExpense());
        System.out.println("Balance:       " + getBalance());
        System.out.println("---------------");
    }

    /**
     * Loops through transactions and calls display() on matching categories.
     * @param category category to search
     */
    public void searchByCategory(String category) {
        boolean match = false;
        for (Transaction t : transactions) {
            if (t.getCategory().equalsIgnoreCase(category)) {
                t.display();
                match = true;
            }
        }
        if (!match) {
            System.out.println("No transactions found for category: " + category);
        }
    }
}
