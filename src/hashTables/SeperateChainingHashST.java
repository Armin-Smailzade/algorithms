package hashTables;

public class SeperateChainingHashST<Key, Value> {

	//number of chains
	private int M = 97;
	//array of chains
	private Node[] st = new Node[M];
	
	private static class Node{
		
		//no generic array creation
		//so we have to declare key and value as Object
		private Object key;
		private Object val;
		private Node next;
		
		Node(Object key, Object val, Node next){
			this.key = key;
			this.val = val;
			this.next = next;
		}
		//....
	}
	
	private int hash(Key key){
		//0x7fffffff is for making the number positive
		//then mode it over M so it will be between 0 and M-1
		return (key.hashCode() & 0x7fffffff) % M;
	}
	
	//this should return Value
	public Value get(Key key){
		
		int i = hash(key);
		for(Node x = st[i] ; x != null ; x = x.next)
			if(key.equals(x.key)) return (Value) x.val;
		return (Value) null;
	}
	
	public void put(Key key, Value val){
		
		int i = hash(key);
		for(Node x = st[i]; x != null ; x = x.next)
			if(key.equals(x.key)){ x.val = val; return;}
		st[i] = new Node(key, val, st[i]);
	}
}
