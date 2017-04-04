package com.AE;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Account timAccount = new Account("Tim");
        timAccount.deposit(1000);
        timAccount.withDrawel(500);
        timAccount.withDrawel(-200);
        timAccount.deposit(-20);
        timAccount.calculateBalance();
        //timAccount.balance = 5000;


        System.out.println("Balance on account is " + timAccount.getBalance());
        //timAccount.transactions.add(4500);
        timAccount.calculateBalance();

        TestClass testClass = new TestClass("Angel", 10);

        testClass.hello();
        System.out.println("Result= " + testClass.result(100));
    }
}
