package fundamentals;

import java.util.Stack;

//Dijkstra two stack algorithm
public class Evaluate {

	public static void main(String[] args){
		
		Stack<String> ops = new Stack<String>();
		Stack<Double> vals = new Stack<Double>();
		
		//read from the input
		//String s = input;
		String s = null;
		if(s.equals("("))	;
		else if(s.equalsIgnoreCase("+"))	ops.push(s);
		else if(s.equals("*"))	ops.push(s);
		else if(s.equals(")"))
		{
			String op = ops.pop();
			if(op.equals("+")) vals.push(vals.pop() + vals.pop());
			else if(op.equals("*")) vals.push(vals.pop() + vals.pop());
		}
		else vals.push(Double.parseDouble(s));
	}
	//print out (vals.pop())
}


