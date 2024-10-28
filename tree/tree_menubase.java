import java.util.*;
//define Node
class Node {
	int data;
	Node right;
	Node left;

	public Node(int data) {
		this.data=data;
		left=right=null;
	}
}
public class BinarySearchTree {
	Node node;
	Node root = null;

	public void insert(int data) {
		Node temp=root;
		Node curr=temp;
		node = new Node(data);
		//to check if a tree exist?
		if(root==null) {
			//make this new node as root
			root = node;
		} else {
			//find the nodo to which the new node can be attached
			while(temp!=null) {
				curr=temp;//when temp becomes null,curr will maintain the previous node
				if(data<temp.data) {
					temp=temp.left;//if the data to be inserted is less than root move to left
				} else {
					temp=temp.right;//else move to right
				}
			}
			//curr is the current node to which the new node can be attached
			if(data<curr.data) {
				curr.left=node;//if the data to be inserted is less than this curr nodes data, assign the new nodes addresss to the left of curr
			} else {
				curr.right=node;//else,assign the new nodes address to the right of curr node
			}
		}
	}
	public void in() {
		System.out.println("INORDER....");
		inorder(root);
	}
	public void pre() {
		System.out.println("PREORDER....");
		preorder(root);
	}
	public void post() {
		System.out.println("POSTORDER....");
		postorder(root);
	}

	public void inorder(Node root) {
		if(root!=null) {
			inorder(root.left);
			System.out.println(root.data +" ");
			inorder(root.right);
		}
	}
	public void preorder(Node root) {
		if(root!=null) {
			System.out.println(root.data +" ");
			preorder(root.left);
			preorder(root.right);
		}
	}
	public void postorder(Node root) {
		if(root!=null) {
			postorder(root.left);
			postorder(root.right);
			System.out.println(root.data +" ");

		}
	}
	public static void main(String[]args) {
		BinarySearchTree bst=new BinarySearchTree();
		bst.insert(5);
		bst.insert(3);
		bst.insert(7);
		bst.insert(2);
		bst.insert(4);
		bst.insert(6);
		bst.insert(8);
		System.out.println("Inorder Traversal:");
		bst.inorder(bst.root);

		System.out.println("\nPreorder Traversal:");
		bst.preorder(bst.root);

		System.out.println("\nPostorder Traversal:");
		bst.postorder(bst.root);
	}
}
