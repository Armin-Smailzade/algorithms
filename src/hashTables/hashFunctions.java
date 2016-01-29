package hashTables;

public class hashFunctions {

/**
	
	Integers: 
	
	private final int value=0; 
	public int hashCode(){
		return value;
	}
	
	---------------
	
	Booleans:
	
	private final boolean value;
	public int hashCode(){
	
		if(value) return 1231;
		else 	  return 1237;
	}
	
	---------------
	
	Doubles:
	
	private final double value;
	public int hashCode(){
		
		long bits = doubleToLongBits(value);
		return (int) (bits ^ (bits >>> 32))
	}
	
	---------------
	
	Strings :
	
	private int hash = 0;
	private final char[] s;
	
	public int hashCode(){
		
		//cache of hash code for later use
		int h = hash;
		if(h != 0) return h;
		for(int i = 0; i < length() ; i++)
			h = s[i] + (31 * hash);
		hash = h; // store cache of hash code
		return h;
	}
	
	
	**/
}
