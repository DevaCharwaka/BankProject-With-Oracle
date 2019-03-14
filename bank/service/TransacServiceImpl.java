package com.bank.service;

import com.bank.beans.MoneyTransfer;
import com.bank.dao.ITransactionDAO;
import com.bank.dao.TransacImplDAO;

public class TransacServiceImpl implements ITransacService {

	ITransactionDAO obj = new TransacImplDAO();
	
	public int withdraw(int amt, int bal) {
		
		return obj.withdraw(amt, bal);
	}

	public int deposit(int amt, int bal) {
		// TODO Auto-generated method stub
		return obj.deposit(amt, bal);
	}

	public MoneyTransfer fundTransfer(int toAccNo, int fromAccNo, int amt, int bal) {
		// TODO Auto-generated method stub
		return obj.fundTransfer(toAccNo, fromAccNo, amt, bal);
	}

	public int balance(int bal) {
		// TODO Auto-generated method stub
		return obj.balance(bal);
	}
	

}
