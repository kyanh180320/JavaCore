package com.example.Banking;

public abstract class Account {
    private String accountNumber;
    private double balance;
    private String ownerName;

    public Account(String accountNumber, Double balance, String ownerName){
        this.accountNumber = accountNumber;
        this.balance = balance > 0 ? balance : 0;
        this.ownerName = ownerName;

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }


}
