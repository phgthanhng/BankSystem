package banksystem;

import java.util.Date;

/**
 * A class for a ATM operation record
 * @author npt
 */
public class Record {
    private String operation;
    private double amount;
    private Date date;
    private String atmId;

    public Record() {
        this.operation = null;
        this.amount = 0;
        this.date = null;
        this.atmId = null;
    }
    
    public Record(String operation, double amount, String atmId) {
        this.operation = operation;
        this.amount = amount;
        this.date = new Date();         // an object of current time;
        this.atmId = atmId;
    }
    
    public Record(Record record) {
        this.operation = record.operation;
        this.amount = record.amount;
        this.date = record.date;
        this.atmId = record.atmId;
    }
    
    public boolean equals(Record record) {
        return this.operation.equals(record.operation) &&
                this.amount == record.amount &&
                this.date.equals(record.date) &&
                this.atmId.equals(record.atmId);
    }

    @Override
    public String toString() {
        String str = "";
        
        str += String.format("%-10s: %s\n", "Operation", operation);
        str += String.format("%-10s: $%.2f\n", "Amount", amount);
        str += String.format("%-10s: %s\n", "Date", date);
        str += String.format("%-10s: %s\n", "ATM ID", atmId);
        
        return str;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAtmId() {
        return atmId;
    }

    public void setAtmId(String atmId) {
        this.atmId = atmId;
    }
}
