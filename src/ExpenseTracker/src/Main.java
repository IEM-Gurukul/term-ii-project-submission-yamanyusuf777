import java.util.Scanner;
import java.util.InputMismatchException;

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
            System.out.println("6. Search by Category");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            String choiceStr = scanner.nextLine().trim();

            switch (choiceStr) {
                case "1":
                    try {
                        System.out.print("Enter amount: ");
                        double expAmount = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline left-over
                        
                        if (expAmount <= 0) {
                            System.out.println("❌ Invalid input! Amount must be a positive number.");
                            break;
                        }

                        System.out.print("Enter category: ");
                        String expCategory = scanner.nextLine();
                        if (expCategory.trim().isEmpty()) {
                            System.out.println("❌ Category cannot be empty.");
                            break;
                        }

                        System.out.print("Enter date: ");
                        String expDate = scanner.nextLine();
                        
                        manager.addTransaction(new Expense(expAmount, expCategory, expDate));
                        System.out.println("✅ Expense added successfully!");
                    } catch (InputMismatchException e) {
                        System.out.println("❌ Please enter a valid number.");
                        scanner.nextLine(); // clear invalid input
                    }
                    break;
                case "2":
                    try {
                        System.out.print("Enter amount: ");
                        double incAmount = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline left-over
                        
                        if (incAmount <= 0) {
                            System.out.println("❌ Invalid input! Amount must be a positive number.");
                            break;
                        }

                        System.out.print("Enter category: ");
                        String incCategory = scanner.nextLine();
                        if (incCategory.trim().isEmpty()) {
                            System.out.println("❌ Category cannot be empty.");
                            break;
                        }

                        System.out.print("Enter date: ");
                        String incDate = scanner.nextLine();
                        
                        manager.addTransaction(new Income(incAmount, incCategory, incDate));
                        System.out.println("✅ Income added successfully!");
                    } catch (InputMismatchException e) {
                        System.out.println("❌ Please enter a valid number.");
                        scanner.nextLine(); // clear invalid input
                    }
                    break;
                case "3":
                    manager.displayAll();
                    break;
                case "4":
                    manager.showSummary();
                    break;
                case "6":
                    System.out.print("Enter category to search: ");
                    String searchCat = scanner.nextLine();
                    manager.searchByCategory(searchCat);
                    break;
                case "7":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
        scanner.close();
    }
}
