package EncPractice;

public class BankAccount {
    //The fields
    private String accountNumber;
    private long balance;
    private String name;

    //Default constructor
    public BankAccount() {
        this.accountNumber = "unknown";
        this.name = "unknown";
        this.balance = 0;
    }

    //Parameterized constructor
    public BankAccount(String accountNumber, String name, long initialBalance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = initialBalance;
    }

    //Getter and setter for Account Number
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    //Getter and setter for Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Getter and setter for Balance
    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative");
        }
    }

    //Method for displaying person's info
    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Owner's Name: " + name);
        System.out.println("Account Balance: " + balance);
    }

    //for depositing
    public void deposit(long amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount + " Rp");
        } else {
            System.out.println("Invalid Amount");
        }
    }

    //for withdrawing
    public void withdraw(long amount) {
        if (amount > 0 && amount <= balance){
        System.out.println("Successfully withdrawn: " + amount + " Rp");
    } else {
        System.out.println("Invalid Amount");
    } 

    }
}
