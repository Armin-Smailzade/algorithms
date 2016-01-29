package stackAndQueue;

public class QueueLinkedList<Key> {

	private Node first, last;
	
	private class Node{
		Key item;
		Node next;
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public void enqueue(Key item){
		
		Node oldlast = last;
		last = new Node();
		last.item = item;
		last.next = null;
		if(isEmpty())
			first = last;
		else
			oldlast.next = last;
	}
	
	public Key dequeue(){
		
		Key item = first.item;
		first = first.next;
		if(isEmpty())
			last = null;
		return item;
	}
}
