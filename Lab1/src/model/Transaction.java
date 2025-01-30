package model;

import java.util.Date;

public class Transaction {
    private String account_number;
    private double transaction_amount;
    private Date transaction_date;

    public Transaction(String account_number, Date transaction_date, double transaction_amount) {
        this.account_number = account_number;
        this.transaction_date = transaction_date;
        this.transaction_amount = transaction_amount;
    }

    public String getAccountNum (){
        return account_number;
    };

    public double getTransactionAmount() {
        return transaction_amount;
    }

    public Date getTransactionDate() {
        return transaction_date;
    }

    public void setAccountNum(String account_number){
        this.account_number = account_number;
    }

    public void setTransactionAmount (double transaction_amount)
    {
        this.transaction_amount = transaction_amount;
    }

    public void setTransactionDate (Date transaction_date){
        this.transaction_date = transaction_date;
    }
}
