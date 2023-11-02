package Assessment_4;
import Data_Structure.SinglyLinkedList;
public class SinglyLinkedList_Q5 {
	class Node{
		int data;
		Node next;
		public Node(int data) {
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
			System.out.print("Add Node : ");
		}
	}
	public void insertAtBegining(int data) {
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
			
			sl.addNode(10);
			sl.addNode(20);
			sl.insertAtEnd(100);
			sl.addNode(30);
			sl.addNode(40);
			sl.insertAtBegining(1000);
			sl.insertAtBegining(2000);
			sl.display();
		}
	}
