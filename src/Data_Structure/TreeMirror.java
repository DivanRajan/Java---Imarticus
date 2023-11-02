package Data_Structure;
class Node3{
	int data;
	Node3 left =null,right =null;
	Node3(int data){
		this.data =data;
	}
}
public class TreeMirror {
	//function to perform perform preorder treaversal on a given binary tree
	public static void preorder(Node3 root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	//utility functiiion to swap left subtree with right subtree
	public static void swap(Node3 root) {
		if(root==null) {
			return;
		}
		Node3 temp =root.left;
		root.left=root.right;
		root.right=temp;
	}
	//function to convert a given binary tree into ot
	public static void convertToMirror(Node3 root) {
		if(root==null) {
			return;
		}
		convertToMirror(root.left);
		convertToMirror(root.right);
		swap(root);
	}
	public static void main(String[] args) {
		Node3 root=new Node3(1);
		root.left=new Node3(2);
		root.right=new Node3(3);
		root.left.left=new Node3(4);
		root.left.right=new Node3(5);
		root.right.left=new Node3(6);
		root.right.right=new Node3(7);
		convertToMirror(root);
		preorder(root);
	}
}
