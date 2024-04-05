import java.util.*;

public class Queue
{
	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("V");
		queue.add("A");
		queue.add("R");
		queue.add("U");
		
		System.out.println(Queue.poll());
		System.out.println(Queue.peek());
		System.out.println(Queue);

		
		
		ArrayDeque<String> ar = new ArrayDeque<String>();
		ar.add("Z");
		ar.add("C");
		ar.add("M");
		ar.add("P");
		ar.offer("L");

		System.out.println(ar);
		System.out.println(ar.poll());
		System.out.println(ar.peek());
		System.out.println(ar.pollfirst());
		System.out.println(ar.polllast());
		
		Stack<Character> st = new Stack<Character>();
		st.push("V");
		st.push("A");
		st.push("R");
		
		System.out.println(st);
	}
}


