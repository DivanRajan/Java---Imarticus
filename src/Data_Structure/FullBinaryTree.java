package Data_Structure;
class Node1{
	int data;
	Node1 leftChild,rightChild;
	Node1(int item){
		data=item;
		leftChild=rightChild=null;
	}
}
class FullBinaryTree{
	Node1 root;
	//check for Full Binary Tree
	boolean isFullBinaryTree(Node1 node) {
		//checiing tree emptiness
		if(node==null)
			return true;
		//checking the children
		if(node.leftChild==null && node.rightChild==null)
			return true;
		if((node.leftChild==null && node.rightChild==null))
			return(isFullBinaryTree(node.leftChild)&&isFullBinaryTree(node.rightChild));
		return false;
		
	}

	public static void main(String[] args) {
		FullBinaryTree tree=new FullBinaryTree();
		tree.root=new Node1(1);
		tree.root.leftChild=new Node1(2);
		tree.root.leftChild.leftChild=new Node1(4);
		tree.root.leftChild.leftChild.leftChild=new Node1(6);
		tree.root.leftChild.leftChild.rightChild=new Node1(7);
		tree.root.leftChild.rightChild=new Node1(5);
		tree.root.leftChild.rightChild.leftChild=new Node1(8);
		tree.root.leftChild.rightChild.rightChild=new Node1(9);
		tree.root.rightChild=new Node1(3);
		tree.root.rightChild.leftChild=new Node1(10);
		tree.root.rightChild.rightChild=new Node1(11);
		tree.root.rightChild.rightChild.rightChild=new Node1(12);
		
		if(tree.isFullBinaryTree(tree.root))
			System.out.print("The tree is a full binary tree");
		else
			System.out.print("The tree is not a full binary tree");
	}

}
