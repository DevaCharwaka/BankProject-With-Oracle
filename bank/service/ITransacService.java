package com.bank.service;

import com.bank.beans.MoneyTransfer;

public interface ITransacService {
	
	public int withdraw (int amt, int bal);
	public int deposit (int amt, int bal);
	public MoneyTransfer fundTransfer(int toAccNo, int fromAccNo, int amt, int bal);
	public int balance (int bal);

}
