package com.greatmancode.craftconomy3.database.tables;

import com.alta189.simplesave.Field;
import com.alta189.simplesave.Id;
import com.alta189.simplesave.Table;

@Table("acl")
public class AccessTable {

	@Id
	public int id;
	@Field
	public int account_id;
	
	@Field
	public String playerName;
	
}
