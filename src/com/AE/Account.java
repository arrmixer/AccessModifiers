package com.AE;

import java.util.ArrayList;

/**
 * Created by Angel on 1/13/17.
 */
public class Account {
    private String accountName;
    private int balance = 0;
    private ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<Integer>();
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount){
        if(amount > 0){
            transactions.add(amount);
            this.balance += amount;
            System.out.println(amount + " deposited. Balance is now " + this.balance);

        }else{
            System.out.println("Cannot deposit negative amount");
        }
    }

    public void withDrawel(int amount){
        int withdrawel = -amount;
        if(withdrawel < 0){
            this.transactions.add(withdrawel);
            this.balance += withdrawel;
            System.out.println(amount + " withdrawn. Balance is now " + this.balance);
        }else{
            System.out.println("Cannot withdraw a negative number");
        }
    }

    public void calculateBalance(){
        this.balance = 0;
        for(int i : this.transactions){
            this.balance += i;
        }
        System.out.println("Calculated balance is " + this.balance);
    }


}
