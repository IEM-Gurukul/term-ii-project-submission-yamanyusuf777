# Term II Project Report: Smart Expense Tracker System

## 1. Project Overview
The Smart Expense Tracker System is a robust console-based Java application designed to record, track, and summarize an individual's personal financial transactions. The primary goal of the application is to offer users a frictionless workflow where they can dynamically input their daily expenses and incomes, categorize them, and automatically aggregate comprehensive financial summaries to track their net balance actively.

## 2. Implemented Features
The system supports a full set of financial tracking utilities directly from the command line interface:
- **Income & Expense Entry:** Inserts newly created data objects containing numerical transaction amounts, named categories, and chronologic dates. 
- **Historical Activity Logging:** Outputs a comprehensive list of all prior transactions, gracefully labeling them as either `[INCOME]` natively with positive strings or `[EXPENSE]` dynamically utilizing negative string formats to differentiate logs clearly.
- **Dynamic Summarization:** Iterates through the extensive multi-category transactional memory logic on demand, returning real-time aggregated calculations indicating the summation of total inflows, total outflows, and the resulting exact net personal balance safely.
- **Selective Category Searching:** Empowers users to execute local queries efficiently filtering through memory for transactions exclusively matching a targeted category keyword natively (for example, seamlessly pulling all specific historical costs related universally to "Rent").

## 3. Core Object-Oriented Programming (OOP) Concepts
The underlying architecture of the code strictly followed robust core Object-Oriented development paradigms throughout construction:
- **Abstraction:** Engineered the primary foundation using an abstract `Transaction.java` model completely encapsulating details (`amount`, `category`, `date`) and enforcing an abstract template mandate of the `display()` functionality.
- **Inheritance:** Implemented `Income.java` and `Expense.java` identically extending `Transaction.java` to seamlessly reuse the super constructor framework guaranteeing DRY (Don't Repeat Yourself) syntax principles.
- **Polymorphism:** The overarching application universally calls the generic polymorphic `display()` command uniformly across iterating arrays, automatically and gracefully printing correctly formatted custom visual elements distinct specifically to whether the subclass context is instantiated as Income or Expense.
- **Encapsulation:** Protected internal variables securely utilizing native `private` modifiers throughout while strictly offering precise outward access through secure internal getter parameters guaranteeing data immutability.

## 4. Error Handling & Application Robustness
To prevent standard runtime failure commonly caused arbitrarily by flawed human text input entries on the console terminal, standard `try-catch` structures were successfully implemented targeting explicit `InputMismatchException` crashes proactively. Additionally, concrete conditional numerical parameter validations efficiently protect the program from actively appending impossible data vectors (blocking users from processing entries where `amount <= 0` natively, nor permitting any empty/null categorical strings).

## 5. Technical Stack
- **Language**: Java 
- **Data Structures**: `java.util.ArrayList`, heavily utilized optimally inside the localized `ExpenseManager.java` for its scalable dynamic size manipulation.
- **Input Controllers**: `java.util.Scanner`

## 6. Conclusion
The resulting Smart Expense Tracker project brilliantly structures its foundation mirroring common enterprise paradigms. It expertly organizes its core database layer elements (`Transactions`), the central operational service layer architecture (`ExpenseManager`), and cleanly decouples its presentation Terminal Logic seamlessly (`Main`). The lightweight framework cleanly tracks financial flows safely, elegantly, and without any arbitrary runtime crashes.
