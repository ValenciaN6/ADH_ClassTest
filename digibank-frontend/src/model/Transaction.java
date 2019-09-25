package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.TransactionEntity;

@ManagedBean(name = "transaction")
@SessionScoped
public class Transaction {

	private String name;
	private String sourcePassport;
	private String destinationPassport;
	private String destinationCountry;
	private int accountNumber;
	private double amount;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSourcePassport() {
		return sourcePassport;
	}
	public void setSourcePassport(String sourcePassport) {
		this.sourcePassport = sourcePassport;
	}
	public String getDestinationPassport() {
		return destinationPassport;
	}
	public void setDestinationPassport(String destinationPassport) {
		this.destinationPassport = destinationPassport;
	}
	public String getDestinationCountry() {
		return destinationCountry;
	}
	public void setDestinationCountry(String destinationCountry) {
		this.destinationCountry = destinationCountry;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public TransactionEntity getTransaction() {
		TransactionEntity trans = new TransactionEntity();
		trans.setName(name);
		trans.setSourcePassport(sourcePassport);
		trans.setDestinationPassport(destinationPassport);
		trans.setDestinationCountry(destinationCountry);
		trans.setAccountNumber(accountNumber);
		trans.setAmount(amount);
		
		return trans;
	}
}
