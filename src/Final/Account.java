package Final;

import java.util.*;

public class Account{
    private String customerCode;
    private String customerName;
    private int accountNumber;
    private long amount;

    public Account(String customerCode, String customerName, int accountNumber, long amount) {
        this.customerCode = customerCode;
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "customerCode='" + customerCode + '\'' +
                ", customerName='" + customerName + '\'' +
                ", accountNumber=" + accountNumber +
                ", amount=" + amount +
                '}';
    }




}
