//wap to create private variables and access them using getter and setter methods
/*public class Encapsulation {
    //make varibles data private
    private int accountNumber;
    private double balance;
    //getter method for accountNumber
    public int getAccountNumber() {
        return accountNumber;       
}
    //setter method for accountNumber
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    //getter method for balance
    public double getBalance() {
        return balance;
    }
    //setter method for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public static void main(String[] args) {
        Encapsulation account = new Encapsulation();
        //setting values using setter methods
        account.setAccountNumber(123456);
        account.setBalance(100000.50);
        //getting values using getter methods and displaying them
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: ₹" + account.getBalance());
    }
}*/


import java.util.Scanner;
public class Encapsulation {
    //make varibles data private
    private int accountNumber;
    private double balance;
    //getter method for accountNumber
    public int getAccountNumber() {
        return accountNumber;       
}
    //setter method for accountNumber
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    //getter method for balance
    public double getBalance() {
        return balance;
    }
    //setter method for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Encapsulation account = new Encapsulation();
        //setting values using setter methods
        System.out.print("Enter Account Number: ");
        int accNum = sc.nextInt();
        account.setAccountNumber(accNum);
        System.out.print("Enter Balance: ₹");
        double bal = sc.nextDouble();
        account.setBalance(bal);
        //getting values using getter methods and displaying them
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: ₹" + account.getBalance());
        sc.close();
    }
}