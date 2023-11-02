package Collections;
import java.util.ArrayDeque;
import java.util.Deque;
public class ArrayDeque1 {

	public static void main(String[] args) {
		Deque<String>dq=new ArrayDeque<String>();
		dq.add("Glenn");
		dq.add("Negan");
		dq.add("Maggie");
		dq.add("Rick");
		dq.add("Daryl");
		System.out.println("Elements in Deque:"+dq);
		System.out.println("Removed Elements:"+dq.removeLast());
		System.out.println("Elements in Deque:"+dq);
		System.out.println("Removed Elements:"+dq.removeFirst());
		System.out.println("Elements in Deque:"+dq);
		dq.addFirst("Charles");
		System.out.println("Elements in Deque:"+dq);
		System.out.println("Head:"+dq.element());
		System.out.println("poll:"+dq.pollLast());
		System.out.println("peek:"+dq.peek());
		System.out.println("Elements in Deque:"+dq);
		System.out.println("Elements in empty:"+dq.isEmpty());
	}

}
