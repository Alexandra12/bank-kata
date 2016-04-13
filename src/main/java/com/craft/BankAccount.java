package com.craft;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankAccount implements Account {

    private List<Transaction> transactions;
    private Console console;

    public BankAccount() {
        transactions = new ArrayList<>();
        console = new Console();
    }

    public BankAccount(Console console) {
        this.transactions = new ArrayList<>();
        this.console = console;
    }

    public void deposit(int amount) {
        transactions.add(new Transaction(amount, new Date()));
    }

    public void withdraw(int amount) {
        transactions.add(new Transaction(-amount, new Date()));
    }

    public void printStatement() {
        console.printLine("DATE | AMOUNT | BALANCE");

        for(Transaction transaction: transactions) {

        }
    }
}
