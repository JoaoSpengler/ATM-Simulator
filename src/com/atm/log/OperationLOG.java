package com.atm.log;
public class OperationLOG {

	private String operationType;
	private String operationIdentifier;
	private String accountIdentifier;
	private String accountName;
	private Double accountMove;
	private Double accountStart;
	private Double accountFinal;

	public String getOperationType() {
		return operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getOperationIdentifier() {
		return operationIdentifier;
	}

	public void setOperationIdentifier(String operationIdentifier) {
		this.operationIdentifier = operationIdentifier;
	}

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

	public Double getAccountMove() {
		return accountMove;
	}

	public void setAccountMove(Double accountMove) {
		this.accountMove = accountMove;
	}

	public Double getAccountStart() {
		return accountStart;
	}

	public void setAccountStart(Double accountStart) {
		this.accountStart = accountStart;
	}

	public Double getAccountFinal() {
		return accountFinal;
	}

	public void setAccountFinal(Double accountFinal) {
		this.accountFinal = accountFinal;
	}

}
