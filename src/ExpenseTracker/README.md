# Smart Expense Tracker System

## Description
The Smart Expense Tracker System is a Java-based console application designed to help users efficiently manage their personal finances. It allows users to record daily income and expenses, automatically calculate total balances, and quickly search through transactions by category to monitor exactly where their money is going.

## How to Compile
```bash
javac src/*.java
```

## How to Run
```bash
java -cp src Main
```

## Features List
- **Add Expense**: Record a new expense by entering an amount, category, and date. Includes exception handling to enforce positive numbers and non-empty categories.
- **Add Income**: Record a new source of income by entering an amount, category, and date. Validated precisely like expenses.
- **View All Transactions**: Display a cleanly formatted list of all historical records, labeled clearly as either `[INCOME]` or `[EXPENSE]`.
- **View Summary**: Automatically calculate and present an overall total of income, total expenses, and the resulting net balance.
- **Search by Category**: Filter previous transactions by their specific category tag (e.g., "Food", "Salary").

## OOP Concepts Used
- **Encapsulation**: Used private fields for transaction properties (`amount`, `category`, `date`) safely accessed via public getters to protect the internal object state.
- **Abstraction**: Defined an abstract `Transaction` base class containing a generic blueprint and an abstract `display()` method to enforce a reliable structure across all transaction types.
- **Inheritance**: The `Income` and `Expense` classes directly inherit properties and common constructor logic from the shared `Transaction` base class.
- **Polymorphism**: The `display()` method is dynamically overridden by both `Income` and `Expense` subclasses to print their uniquely formatted attributes automatically.

## Technologies
- Java
- ArrayList
- Git
