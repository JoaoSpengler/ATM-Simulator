package com.atm.operation;

public class UserAccount {

    private String accountIdentifier;
    private String accountName;
    private Double money;
    private double moneySnap;

    public String getAccountIdentifier() {
        return accountIdentifier;
    }

    public void setAccountIdentifier(String accountIdentifier) {
        this.accountIdentifier = accountIdentifier;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
    
    public void moneySnapshot() {
    	this.moneySnap = this.getMoney().doubleValue();
    }
    
    public double getSnap() {
    	return this.moneySnap;
    }

}
