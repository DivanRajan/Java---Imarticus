package Data_Structure;

public class DoublyLinkedList {
	class Node{
		int data;
		public Node next;
		public Node prev;
		public Node(int data) {
			this.data=data;
			next=null;
			prev=null;
		}
	}
	
	Node head=null;
	Node tail=null;
	int flag=0;
	public void addNodeFront(int data) {
		Node temp=new Node(data);
		if(head!=null)
		{
			head.prev=temp;
			temp.next=head;
		}
		head=temp;
		if(tail==null)
		{
			tail=temp;
		}
		System.out.println("New node added:"+data);
	}
	public void addNode(int data) {
		Node temp=new Node(data);
		if(tail!=null) {
			tail.next=temp;
			temp.prev=tail;
		}
		tail=temp;
		if(head==null) {
			head=temp;
		}
		System.out.println("New node added : "+data);
	}
	public int removeNodeFront() {
		Node temp=head;
		head=head.next;
		head.prev=null;
		System.out.println("deleted:"+temp.data);
		return temp.data;
	}
	public int removeNodeBack() {
		Node temp=tail;
		tail=tail.prev;
		tail.next=null;
		System.out.println("deleted:"+temp.data);
		return temp.data;
	}
	public void removeElement(int data) {
		Node temp=head;
		if(head.data==data) {
			head=head.next;
			head.next.prev=null;
		}
		while(temp!=null) {
			if(temp.data==data) {
				temp.next.prev=temp.prev;
				temp.prev.next=temp.next;
				flag=1;
			}
			else if(temp.data==data) {
				temp.prev.next=null;
				tail=temp.prev;
				flag=1;
				
			}
			temp=temp.next;
		}
		if(flag==0)
			System.out.println("element is not present");
	}
	
	public void iterateForward() {
		Node temp=head;
		System.out.println("Iterating forward");
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	public void iterateBackward() {
		Node temp=tail;
		System.out.println("Iterating backward");
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.prev;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {

		DoublyLinkedList dl=new DoublyLinkedList();
		
		dl.addNode(2);
		dl.addNode(4);
		dl.addNode(6);
		dl.addNode(8);
		dl.addNodeFront(100);
		dl.addNode(10);
		dl.removeElement(0);
		dl.removeNodeFront();
		System.out.println("Forward Direction");
		dl.iterateForward();
		System.out.println("Backward Direction");
		dl.iterateBackward();
		
	}

}