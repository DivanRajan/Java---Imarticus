package Collections;
import java.util.*;
public class QueueExample1 {

	public static void main(String[] args) {
	Queue<String> q= new LinkedList<String>();
	//adding element to the queue
	q.add("Rick");
	q.add("Maggie");
	q.add("Glenn");
	q.add("negan");
	q.add("daryl");
	System.out.println("element in queue: "+q);
	System.out.println("Removed element:"+q.remove());
	System.out.println("Heads:"+q.element());
	System.out.println("poll:"+q.poll());
	System.out.println("peek:"+q.peek());
	System.out.println("Elements in queue:"+q);
	}

}