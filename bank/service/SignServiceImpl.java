package com.bank.service;
import com.bank.beans.*;
import com.bank.dao.*;


public class SignServiceImpl implements ISignService {

	ISigningDAO obj = new SignImplDAO();
	
	public Signing registration(Signing reg) {
		
		return obj.registration(reg);
	}

	public Signing login(Signing log) {

		
		return obj.login(log);
	}

	
}
