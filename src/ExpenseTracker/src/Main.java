import java.util.Scanner;

/**
 * Main application class providing a console-based menu UI.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExpenseManager manager = new ExpenseManager();
        boolean running = true;

        while (running) {
            System.out.println("===== Smart Expense Tracker =====");
            System.out.println("1. Add Expense");
            System.out.println("2. Add Income");
            System.out.println("3. View All Transactions");
            System.out.println("4. View Summary");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            String choiceStr = scanner.nextLine().trim();

            switch (choiceStr) {
                case "1":
                    System.out.print("Enter amount: ");
                    double expAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline left-over
                    System.out.print("Enter category: ");
                    String expCategory = scanner.nextLine();
                    System.out.print("Enter date: ");
                    String expDate = scanner.nextLine();
                    
                    manager.addTransaction(new Expense(expAmount, expCategory, expDate));
                    System.out.println("✅ Expense added successfully!");
                    break;
                case "2":
                    System.out.print("Enter amount: ");
                    double incAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline left-over
                    System.out.print("Enter category: ");
                    String incCategory = scanner.nextLine();
                    System.out.print("Enter date: ");
                    String incDate = scanner.nextLine();
                    
                    manager.addTransaction(new Income(incAmount, incCategory, incDate));
                    System.out.println("✅ Income added successfully!");
                    break;
                case "3":
                    manager.displayAll();
                    break;
                case "4":
                    manager.showSummary();
                    break;
                case "5":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
        scanner.close();
    }
}
