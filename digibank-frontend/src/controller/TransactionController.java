package controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import model.Transaction;
import service.TransactionEJB;

@ManagedBean(name = "transactioncontroller")
@SessionScoped
public class TransactionController {

	@EJB
	TransactionEJB transactionEJB;
	
	@ManagedProperty(value = "#{transaction}")
	public Transaction transaction;
	
	public void addNewTransaction() {
		System.out.println("working fine");
		transactionEJB.newTransaction(transaction.getTransaction());
	}

	
	//getter and setter
	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	
	
}
