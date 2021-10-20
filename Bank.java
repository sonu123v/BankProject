package com.Bridgelabz;
public class Bank {
    static String bankName="SBI";
    int account_Number=4555555;
    String customerName="Jhon";
    int customerAge=20;
    public static void main(String[] args) {
        display();
    }
    private static void display() {
        Bank  b=new Bank();
        System.out.println("BankName=" + Bank.bankName );
        System.out.println("AccountNumber=" + b.account_Number);
        System.out.println("CustomerName=" + b.customerName);
        System.out.println("CustomerName=" + b.customerAge);

    }
}
