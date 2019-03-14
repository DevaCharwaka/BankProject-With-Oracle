package com.bank.dao;

import com.bank.beans.*;

public interface ISigningDAO {

public Signing registration(Signing reg) throws Exception;
	
	public Signing login (Signing log);
	
	
}
