package Data_Structure;

public class SinglyLinkedList {
class Node{
	int data;//class variable
	Node next;
	public Node(int data) {//Parameter
		this.data=data;
		this.next=null;
	}
}
public Node head=null;
public Node tail=null;

public void addNode(int data) {
	Node newNode=new Node(data);
	if(head==null) {
		head=newNode;
		tail=newNode;
	}
	else {
		tail.next=newNode;
		tail=newNode;
	}
}
public void insertAtBegining(int data) {
	// insert the data
	Node new_node=new Node(data);
	new_node.next=head;
	head=new_node;
}
public void insertAtEnd(int data) {
	Node new_node=new Node(data);
	if(head==null) {
		head=new_node;
		tail=new_node;
		return;
	}
	tail.next=new_node;
	tail=new_node;
}
public void display() {
	Node current=head;
	if(head==null) {
		System.out.println("List is empty");
		return;
	}
	else {
		
		System.out.println("Nodes of singly LinkedList: ");
		while(current!=null) {
			System.out.println(current.data);
			current=current.next;
		}
		System.out.println("Node Completed");
	}
	
}
	public static void main(String[] args) {
		SinglyLinkedList sl=new SinglyLinkedList();
		sl.addNode(1);
		sl.addNode(2);
		sl.addNode(3);
		sl.addNode(4);
		sl.insertAtBegining(10);
		sl.insertAtEnd(200);
		sl.display();
	}
}
