package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import tree.Tree.BinaryTree;
import tree.Tree.Node;
import tree.Tree.BinaryTree;;

public class Traversals {

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
	         bt2.root.left.left.left =new Node(201);
	         bt2.root.left.right.left =new Node(102);
	         bt2.root.right.left.left = new Node(31);
	         bt2.root.right.right.left = new Node(51);
	         bt2.root.left.left.right =new Node(21);
	         bt2.root.left.right.right =new Node(12);
	         bt2.root.right.left.right = new Node(13);
	         bt2.root.right.right.right = new Node(15);
	         
	       //  level(bt2.root);
	        // difflinelevel(bt2.root);
	         //levelqueue(bt2.root);
	        // diflinelevelqueue(bt2.root);
	         diflineleveltwoqueue(bt2.root);
	       //  speciallevel(bt2.root);
	         zigzag(bt2.root);
	}

	public static void level(Node bt)
	{
		int h = BinaryTree.ht(bt,0);
		for(int i=1;i<=h;i++)
			printleveltree(bt,i);
	}
	public static void printleveltree(Node bt,int i)
	{
		if(bt==null)
			return ;
		if(i==1)
		System.out.print("Node->"+bt.data);
		if(i>1)
		{
			printleveltree(bt.left, i-1);
			printleveltree(bt.right, i-1);
		}
	}

	public static void levelqueue(Node bt)
	{
		if(bt==null)
			return ;
		Queue<Node> q = new LinkedList<Node>();
		q.add(bt);
		while(!q.isEmpty())
		{
			Node temp = q.poll();
			System.out.println("Node->"+temp.data);
			if(temp.left!=null)
				q.add(temp.left);
			if(temp.right!=null)
				q.add(temp.right);
		}
		
	}

	public static void difflinelevel(Node bt)
	{
		int h = BinaryTree.ht(bt,0);
		for(int i=1;i<=h;i++){
			printleveltree(bt,i);
		System.out.println("\n");}
	}
	public static void diflineprintleveltree(Node bt,int i)
	{
		if(bt==null)
			return ;
		if(i==1)
		System.out.print("Node->"+bt.data);
		if(i>1)
		{
			diflineprintleveltree(bt.left, i-1);
			diflineprintleveltree(bt.right, i-1);
		}
	}

	public static void diflinelevelqueue(Node bt)
	{
		 if(bt==null)
			 return ;
		 Queue<Node> q = new LinkedList<Node>();
		 int nc=0;
		 q.add(bt);
		 while(true)
		 {
			 nc = q.size();
			 if(nc==0)
				 break;
			 while(nc>0)
			 {
				 Node temp = q.poll();
				 System.out.print("Node->"+temp.data);
				 if(temp.left!=null)
					 q.add(temp.left);
				 if(temp.right!=null)
					 q.add(temp.right);
				 nc--;
			 }
			 System.out.println("\n");
		 }
	}

	public static void diflineleveltwoqueue(Node bt)
	{
		if(bt==null)
			return ;
		Queue<Node> q1 = new LinkedList<Node>();
		Queue<Node> q2 = new LinkedList<Node>();
		q1.add(bt);
		while(true)
		{
			int nc1 = q1.size();
			int nc2 = q2.size();
			if(nc1==0)
				break;
			while(nc1>0)
			{
				Node temp = q1.poll();
				q2.add(temp);
				System.out.print("node->"+temp.data);
				if(temp.left!=null)
					q1.add(temp.left);
				if(temp.right!=null)
					q1.add(temp.right);
				nc1--;
			}
			System.out.println("\n");
		}
	}

	public static void speciallevel(Node bt)
	{
		if(bt==null)
			return;
		Queue<Node> q = new LinkedList<Node>();
		q.add(bt);
		Node temp = q.poll();
		System.out.println(temp.data);
		q.add(bt.left);
		q.add(bt.right);
		System.out.print(bt.left.data+" ");
		System.out.println(bt.right.data);

		while(!q.isEmpty())
		{
			Node first = q.poll();
			Node sec = q.poll();
			System.out.print(" "+first.left.data+" "+sec.right.data+" ");
			System.out.print(" "+first.right.data+" "+sec.left.data+" ");
			if(first.left.left!=null){
				q.add(first.left);
			q.add(sec.right);
			q.add(first.right);
			q.add(sec.left);
			}
			System.out.print("\n");
		}
	}

	public static boolean zigzag( ArrayList<Node> al,boolean b)
	{
	//	System.out.println("In->"+al.size());
		if(b)
		{
			//System.out.println("true");
			for(int i=0;i<al.size();i++)
				System.out.print("Node->"+al.get(i).data);
			System.out.println("\n");
			return false;
		}
		else
		{
			//System.out.println("false");
			for(int i=al.size()-1;i>=0;i--)
				System.out.print("Node->"+al.get(i).data);
			System.out.println("\n");
			return true;
		}
	}
	public static void zigzag(Node bt)
	{
		if(bt==null)
			return ;
		ArrayList<Node> al =  new ArrayList<Node>(); 
    Queue<Node> q = new LinkedList<Node>(); 
	q.add(bt);
	al.add(bt);
	boolean b=true;
	b = zigzag(al,b);
	//System.out.println("b->"+b+" && size->"+q.size());
	while(!q.isEmpty())
	{
		al.clear();
		int n=q.size();
		while(n>0)
		{
		Node temp = q.poll();
		if(temp.left!=null){
			al.add(temp.left);
			q.add(temp.left);
			}
		if(temp.right!=null){
			al.add(temp.right);
			q.add(temp.right);
			}
		n--;
	    }
		//System.out.println("Out");
		b=zigzag(al,b);
	}
	}
}
