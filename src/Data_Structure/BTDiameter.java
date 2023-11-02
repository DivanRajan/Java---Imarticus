package Data_Structure;
import java.util.concurrent.atomic.AtomicInteger;
class Node4{
	int data;
	Node4 left =null,right=null;
		Node4(int data){
			this.data=data;
		}
}
public class BTDiameter {
	public static int getDiameter(Node4 root,AtomicInteger diameter) {
		if (root==null) {
			return 0;
		}
		int left_height=getDiameter(root.left,diameter);
		int right_height=getDiameter(root.right,diameter);
		int max_diameter=left_height+right_height+1;
		diameter.set(Math.max(diameter.get(),max_diameter));
		return Math.max(left_height,right_height)+1;
	}
public static int getDiameter(Node4 root) {
	AtomicInteger diameter=new AtomicInteger(0);
	getDiameter(root,diameter);
	return diameter.get();	
}
	public static void main(String[] args) {
		Node4 root=new Node4(1);
		root. left=new Node4(2);
		root. right=new Node4(3);
		root. left.right=new Node4(4);
		root. right.left=new Node4(5);
		root. right.right=new Node4(6);
		root. right.left.left=new Node4(7);
		root.right.left.right=new Node4(8);
		System.out.print("The  Diameter of the tree is "+getDiameter(root));
	}
}
