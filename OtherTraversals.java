package tree;

import java.util.Stack;

import tree.Tree.BinaryTree;
import tree.Tree.Node;

public class OtherTraversals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  BinaryTree bt2 = new BinaryTree();
	         bt2.root = new Node(10);
	         bt2.root.left = new Node(2);
	         bt2.root.right = new Node(8);
	         bt2.root.left.left =new Node(3);
	         bt2.root.left.right =new Node(4);
	         bt2.root.right.left = new Node(3);
	         bt2.root.right.right = new Node(5);
//	         bt2.root.left.left.left =new Node(201);
//	         bt2.root.left.right.left =new Node(102);
//	         bt2.root.right.left.left = new Node(31);
//	         bt2.root.right.right.left = new Node(51);
//	         bt2.root.left.left.right =new Node(21);
//	         bt2.root.left.right.right =new Node(12);
//	         bt2.root.right.left.right = new Node(13);
//	         bt2.root.right.right.right = new Node(15);
	 
	     //    level(bt2.root);
	         inorder(bt2.root);
	         Stackinorder(bt2.root);
	}
	
	public static void level(Node bt)
	{
		if(bt==null)
			return;
	int h = BinaryTree.ht(bt, 0);
		for(int i=1;i<=h;i++)
		{	levelhelp(bt,i);
		System.out.println();
		}
	}
	public static void levelhelp(Node bt,int i)
	{
		if(i==1)
		{
			System.out.print(bt.data+" ");
	return ;
		}
		if(i>1)
		{
			levelhelp(bt.left,i-1);
			levelhelp(bt.right,i-1);
		}
	}
	public static void inorder(Node bt)
	{
		if(bt==null)
			return ;
		inorder(bt.left);
		System.out.println(bt.data);
		inorder(bt.right);
	}
    public static void Stackinorder(Node bt)
    {
    	if(bt==null)
    		return ;
    	Stack<Node> s = new Stack<Node>();
    	Node temp = bt;
    	while(temp!=null)
    	{
    		s.push(temp);
    		temp=temp.left;
    	}
    	while(!s.isEmpty())
    	{
    		 temp = s.pop();
    		System.out.print(temp.data+" ");
    		if(temp.right!=null)
    		{
    			temp = temp.right;
    		}
    		while(temp!=null)
    		{
    			s.push(temp);
    			temp=temp.left;
    		}
    	}
    }
	
}
