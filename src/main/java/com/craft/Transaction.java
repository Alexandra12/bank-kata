package com.craft;

import java.util.Date;

/**
 * @author adumitrica
 * @since 4/13/2016
 */
public class Transaction {

    private int amount;
    private Date date;

    public Transaction(int amount, Date date) {
        this.amount = amount;
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
