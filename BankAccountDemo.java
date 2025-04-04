package EncPractice;

public class BankAccountDemo {
    public static void main(String[] args) {
        //new bank account
        BankAccount ken = new BankAccount();
        //update attributes using setter methods
        ken.setAccountNumber("69420");
        ken.setName("Ken");
        ken.setBalance(10000);

        //display user's info
        System.out.println("Your Account's Info");
        ken.displayInfo();
        System.out.println();
        
        //Example usage of Withdrawing and Depositing
        ken.deposit(3000);
        ken.withdraw(5000);
        ken.withdraw(15000); //Should show "Insufficient balance."

        System.out.println("Account Info after withdraw and deposit");
        ken.displayInfo();
    }
}
