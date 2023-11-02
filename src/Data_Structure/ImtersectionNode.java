package Data_Structure;

public class ImtersectionNode {
	//A linked List Node
	static class Node
	{
		int data;
		Node next;
		
	}
	//utility function to create a new node with the given dxata and
	//pushes it onto the list front
	public static Node push(Node head,int data)//addfront
	{
		//create a new linked list node from the heap
		Node node=new Node();
		node.data=data;
		node.next=head;
		return node;
	}
//fucntionto find the intersection of two linked lists
	private static Node intersectionPoint(Node list1,Node list2) {
			Node firstTemp=list1;
			while (firstTemp !=null) {
				Node temp=list2;
				while (temp!=null) {
					//if both linked lists points to the same node
					if(firstTemp == temp) {
						return firstTemp;
					}
					temp=temp.next;
				}
				firstTemp=firstTemp.next;
			}
			//if there is o intwersecnting node
			return null;
	}
	public static void main(String[] args) {
		//contsruct the first linked liast(1 ->2 ->3 ->4 ->5 ->null)
		Node first=null;
		for(int i=7;i>0;i--) {
			first=push(first,i);
			}
		//construuct the second linked list(1 ->2 ->3 ->null)
		Node second =null;
		for(int i=3;i>0;i--) {
			second=push(second,i);
		}
		//link tail of the second list to the fourth node of the first list
		second.next.next.next=first.next.next.next;
		Node addr=intersectionPoint(first,second);
		if(addr!=null) {
			System.out.println("The intersection point is "+addr.data);
			
		}
		else {
			System.out.println("the list do not interact");
		}
				}

}
