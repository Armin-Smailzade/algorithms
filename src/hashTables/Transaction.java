package hashTables;

import java.sql.Date;

public class Transaction implements Comparable<Transaction>{

	private final String who; 
	private final Date when;
	private final double amount;
	
	Transaction(String who, Date when, double amount){
		this.who = who;
		this.when = when;
		this.amount = amount;
	}
	
	
	public int hashCode(){
		
		//non zero constant
		int hash = 17;
		//for reference types, use hashCode()
		//31 is a small prime
		hash = 31 * hash + who.hashCode();
		hash = 31 * hash + when.hashCode();
		//for primitive types, use hashCode() of wrapper type
		hash = 31 * hash + ((Double) amount).hashCode();
		return hash;
		
		//if array apply hash code for each entry
		// or use Arrays.deepHashCode()
	}
	
	
	//////////////////////
	
	@Override
	public int compareTo(Transaction y){
		return 1;
	}
	
	public boolean equals(Object y){
		return true;
	}
}
