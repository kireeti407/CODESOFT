import java.util.Scanner;
class BankAccount {
    private double balance;
    public BankAccount(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + ". New balance: $" + balance);
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }
    public void checkBalance() {
        System.out.println("Current balance: $" + balance);
    }
}
class ATM {
    private BankAccount userAccount;

    public ATM(BankAccount userAccount) {
        this.userAccount = userAccount;
    }
    public void displayMenu() {
        System.out.print("____________________________________________________________________________________");
        System.out.println("\n        1. Deposit\n        2. Withdraw\n        3. Check Balance\n        4. Exit");
    }
    public void per_Tran(int choice) {
        Scanner prom = new Scanner(System.in);
        switch (choice) {
            case 1:
                System.out.print("Enter deposit amount: $");
                double depositAmount = prom.nextDouble();
                userAccount.deposit(depositAmount);
                break;
            case 2:
                System.out.print("Enter withdrawal amount: $");
                double withdrawalAmount = prom.nextDouble();
                userAccount.withdraw(withdrawalAmount);
                break;
            case 3:
                userAccount.checkBalance();
                break;
            case 4:
                System.out.println("Exiting. Thank you!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please choose a valid option.");
        }
    }
    public void run() {
        Scanner inp = new Scanner(System.in);
        while (true) {
            displayMenu();
            try {
                System.out.print("Enter your choice (1-4): ");
                int choice = inp.nextInt();
                per_Tran(choice);
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                inp.nextLine();
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000);
        ATM atm = new ATM(userAccount);
        atm.run();
    }
}
