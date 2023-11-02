package Data_Structure;
import java.util.Scanner;
public class BSTree {

	class Node{
		int key;
		Node left,right;
		
		public Node(int item) {
			key=item;
			left=right=null;
		}
	}
	
	static Node root;
	
	BSTree(){
		root=null;
	}
	
	void insert(int key) {
		root=insertKey(root,key);
	}
	
	Node insertKey(Node root,int key) {
		if(root==null) {
			root=new Node(key);
			return root;
		}
		
		if(key<root.key)
			root.left=insertKey(root.left,key);
		else
			root.right=insertKey(root.right,key);
		
		return root;
		
	}
	
	void postOrder() {
		postOrderRec(root);
	}
	
	void postOrderRec(Node root) {
		if(root!=null) {
			postOrderRec(root.left);
			postOrderRec(root.right);
			System.out.print(root.key+" ");
		}
	}
	
	void preOrder() {
		preOrderRec(root);
	}
	
	void preOrderRec(Node root) {
		if(root!=null) {
			System.out.print(root.key+" ");
			preOrderRec(root.left);
			preOrderRec(root.right);
		}
	}
	
	void inOrder() {
		inOrderRec(root);
	}
	
	void inOrderRec(Node root) {
		if(root!=null) {
			inOrderRec(root.left);
			System.out.print(root.key+" ");
			inOrderRec(root.right);
		}
	}

	static void minValue(Node root) {
		int minV=root.key;
		while(root.left!=null) {
			minV=root.left.key;
			root=root.left;
		}
		System.out.println("Minimum value of the Binary Search Tree is : "+minV);
	}
	
	public static void main(String[] args) {

		BSTree tree=new BSTree();
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Minimum Value of Binary Search Tree Test");
		
		int count=1;
		Functions:
			for(int i=0;i<count;i++) {
				System.out.println("Enter integer element to insert:");
				tree.insert(scn.nextInt());
				
				System.out.print("Post Order:");
				tree.postOrder();
				System.out.println();
				
				System.out.print("Pre Order:");
				tree.preOrder();
				System.out.println();
				
				System.out.print("In Order:");
				tree.inOrder();
				System.out.println();
				
				System.out.println("Do you want to continue (Type y or n)?");
				char c=scn.next().charAt(0);
				if(c=='y') {
					count++;
					continue Functions;
				}
				else if(c=='n')
					minValue(root);
			}
		
		scn.close();
		}
	}

