package com.atm.operation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.atm.log.OperationLOG;

public class OperationAccount {

    private UserAccount account;
    private Double operationValue;
    private List<OperationLOG> logs = new ArrayList<>();

    protected UserAccount getAccount() {
        return account;
    }

    public void setAccount(UserAccount account) {
        this.account = account;
    }

    public Double getOperationValue() {
        return operationValue;
    }

    public void setOperationValue(Double operationValue) {
        this.operationValue = operationValue;
    }

    protected void decrease(Operation op) {
    	account.moneySnapshot();
    	account.setMoney(account.getMoney() - operationValue);
        log(op);
    }

    protected void sum(Operation op) {
    	account.moneySnapshot();
    	account.setMoney(account.getMoney() + operationValue);
        log(op);
    }
    
    protected void accountValue() {
    	System.out.println("Saldo  =>  $" + account.getMoney());
    }

    protected void printLastLog() {
    	OperationLOG log = logs.get(logs.size() - 1);
    	printLog(log);
    }
    
    protected void printAllLogs() {
    	for (OperationLOG log : logs) {
    		System.out.println("-------------------------------------------------------------------");
    		printLog(log);
    		System.out.println("-------------------------------------------------------------------");
    	}
    }
    
    private void printLog(OperationLOG log) {
    	System.out.println("Operação                   => " + log.getOperationType());
    	System.out.println("Identificador da operação  => " + log.getOperationIdentifier());
    	System.out.println("Identificador da conta     => " + log.getAccountIdentifier());
    	System.out.println("Nome da conta              => " + log.getAccountName());
    	System.out.println("Valor movimentado          => $" + log.getAccountMove());
    	System.out.println("Saldo inicial              => $" + log.getAccountStart());
    	System.out.println("Saldo final                => $" + log.getAccountFinal());
    }
    
    private void log(Operation op) {
        final OperationLOG log = new OperationLOG();
        log.setOperationType(op.name());
        log.setOperationIdentifier(op.name()+"$COD"+randomNum());
        log.setAccountIdentifier(account.getAccountIdentifier());
        log.setAccountName(account.getAccountName());
        log.setAccountMove(operationValue);
        log.setAccountStart(account.getSnap());
        log.setAccountFinal(account.getMoney());
        logs.add(log);
    }
    
    private Integer randomNum() {
    	return new Random().nextInt(1000);
    }

}
