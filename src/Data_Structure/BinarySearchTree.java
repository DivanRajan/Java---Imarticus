package Data_Structure;

import Data_Structure.PerfectBinaryTree.Node;

public class BinarySearchTree {
class Node5{
	int key;
	Node5 left,right;
	public Node5(int item){
		key=item;
		left=right=null;
	}
}
boolean search(int key) {
	return searchNode(root,key);
}
boolean searchNode(Node5 root,int search) {
	if(root==null)
		return false;
	else {
		if(root.key==search)	
			return true;
	else if(search<root.key)
		return searchNode(root.left,search);
	else if(search>root.key)
		return searchNode(root.right,search);
	return false;	
}
}
Node5 root;
BinarySearchTree(){
root=null;
}
void insert(int key) {
	root=insertKey(root,key);
}
Node5 insertKey(Node5 root,int key) {
	if(root==null) {
		root=new Node5(key);
		return root;
	}
	if(key<root.key)
		root.left=insertKey(root.left,key);
	else if(key>root.key)
		root.right=insertKey(root.right,key);
	return root;
}
void inorder() {
	inorderRec(root);
	
}
void inorderRec(Node5 root) {
	if(root!=null) {
		inorderRec(root.left);
		System.out.print(root.key+"->");
		inorderRec(root.right);
	}
}
void deleteKey(int key) {
	root=deleteRec(root,key);
}
Node5 deleteRec(Node5 root,int key) {
	if(root==null)
		return root;
	if(key<root.key)
		root.left=deleteRec(root.left,key);
	else if(key>root.key)
		root.right=deleteRec(root.right,key);
	else {
		if(root.left==null)
			return root.right;
		else if(root.right==null)
			return root.left;
		root.key=minValue(root.right);
		root.right=deleteRec(root.right,root.key);
	}
	return root;
}
int minValue(Node5 root) {
	int minv=root.key;
	while(root.left!=null) {
		minv=root.left.key;
		root=root.left;
		}
	return minv;
}
	public static void main(String[] args) {
		BinarySearchTree tree=new BinarySearchTree();
		tree.insert(8);
		tree.insert(3);
		tree.insert(1);
		tree.insert(6);
		tree.insert(7);
		tree.insert(10);
		tree.insert(14);
		tree.insert(4);
		System.out.print("inorder traversal:");
		tree.inorder();
		System.out.println("\n\nAfter deleting 10 ");
		tree.deleteKey(10);
		System.out.print("inorder traversal:");
		tree.inorder();
	}
}
