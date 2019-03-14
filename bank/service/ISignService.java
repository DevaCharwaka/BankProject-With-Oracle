package com.bank.service;

import com.bank.beans.Signing;

public interface ISignService {
	
	public Signing registration(Signing reg);
	
	public Signing login (Signing log);
	
}
