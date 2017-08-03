package tree;

import java.util.ArrayList;

import tree.Tree.Node;

public class Tree {
public static int count1=0;
static class Node{
		int data;
		Node left;
		Node right;
		Node(int d){
			data=d;
			right=null;
			left=null;
		}
	}
	static class BinaryTree{
		Node root ;
		public BinaryTree(int key)
		{
			root = new Node(key);
		}

		 public BinaryTree(){
				root=null;
			}
	

	public static void main(String[] args) {
         BinaryTree bt = new BinaryTree();
         bt.root = new Node(1);
         bt.root.left = new Node(2);
         bt.root.right = new Node(3);
         bt.root.left.left =new Node(4);
         bt.root.left.left.left = new Node(8);
         bt.root.left.left.left.right= new Node(11);
         bt.root.left.left.left.right.left = new Node(12);
         bt.root.left.left.left.right.left.left = new Node(13);
         bt.root.left.left.left.left = new Node(10);
         bt.root.left.left.right = new Node(9);
        bt.root.left.right = new Node(5);
         bt.root.right.left = new Node(6);
         bt.root.right.right = new Node(7);
    
         
         
         //NEW TREE bt1
         
         BinaryTree bt1 = new BinaryTree();
         bt1.root = new Node(1);
         bt1.root.left = new Node(2);
         bt1.root.right = new Node(3);
         bt1.root.left.left =new Node(4);
         bt1.root.left.left.left = new Node(8);
         bt1.root.left.left.left.left = new Node(10);
         bt1.root.left.left.right = new Node(9);
        bt1.root.left.right = new Node(5);
         bt1.root.right.left = new Node(6);
         bt1.root.right.right = new Node(7);
    
         //NEW TREE bt2
         BinaryTree bt2 = new BinaryTree();
         bt2.root = new Node(10);
         bt2.root.left = new Node(2);
         bt2.root.right = new Node(8);
         bt2.root.left.left =new Node(2);
         bt2.root.right.left = new Node(3);
         bt2.root.right.right = new Node(5);
         
          //NEW TREE bt3
         
         BinaryTree bt3 = new BinaryTree();
         bt3.root = new Node(10);
         bt3.root.left = new Node(9);
         bt3.root.right = new Node(8);
         bt3.root.right.left =new Node(41);
         bt3.root.left.left = new Node(1);
         
         
         //NEW TREE bt4
         
         BinaryTree bt4 = new BinaryTree();
         bt4.root = new Node(1);
         bt4.root.left = new Node(2);
         bt4.root.right = new Node(3);
         //bt3.root.left.left =new Node(4);
         bt4.root.left.left = new Node(5);
         
         
         
     //    print(bt.root);
     //    System.out.println(ht(bt.root,0));
	  //     System.out.println(leaf(bt.root,0));
	  //      System.out.println(size(bt.root,0));
//         ArrayList<Integer> al = new ArrayList<Integer>();
//         ArrayList<Integer> al1 = new ArrayList<Integer>();
//         al1 = pathtoleaf(bt.root,al,0);
//         System.out.println(al1);
//	       boolean b = identicaltrees(bt.root,bt1.root,true);
//	       System.out.println(b);
 //        System.out.println(diameter(bt.root,0));
//         boolean b1= childsum(bt2.root,true);  
//         System.out.println(b1);
//         Node l = lca(bt.root,bt.root.left.left.left,bt.root.left.right);
//         System.out.println(l.data);
    //     Node l1 = ;
       //  System.out.println(lca(bt.root,10,9));
       //  int count=0;
//	boolean b3 = present(bt.root,8,true);
//System.out.println(count1);
	//	System.out.println(b3);
         
 //        printAtK(bt.root,3);
  //System.out.println(mindepth(bt3.root,0));
   //      System.out.println(disttoroot(bt.root,10)-1);
//         System.out.println(praclca(bt.root,10,9));
	       //           System.out.println(distBwnodes(bt.root, bt.root.left.left, bt.root.right, 0));	
  //      System.out.println("sum->"+sum(bt2.root,0)); 
//         print(bt4.root.left);
//         mirror(bt4.root);
//         print(bt4.root.right);
  //       System.out.println(level(bt.root,0,13));
//         print(bt.root);  
//         Node result = doubletree(bt.root);
//         System.out.println("double");
//           print(result);
//           
//           System.out.println("secodn method->");
//           print(bt.root);  
//           Node result1 = doubleTree(bt.root);
//           System.out.println("double");
//             print(result1);  
         
//       boolean b= balanced(bt4.root);
//       System.out.println(b);
//         print(bt4.root);
//         Node result1 = invert(bt4.root);
//         System.out.println("herer");
//         print(result1);
//         boolean bool = complete(bt3.root);
//         print(bt3.root);
//         System.out.println(bool);
         boolean bbool1 = binaryisheap(bt3.root);
         System.out.println(bbool1);
	}
	
	// level order traversal
	public static void print(Node bt)
	{
		if(bt==null)
			return;
		System.out.println("data->"+bt.data);
		print(bt.left);
		print(bt.right);
		return;
		//return print(bt.root);
	}
	
	//
	
	public static int ht(Node bt,int h)
	{
		if(bt.left==null && bt.right==null)
		{
			h++;
			return h;
		}
		if(bt.left==null)
		{
			h++;
			return ht(bt.right,h);
		}
        if(bt.right==null)
        {
        	h++;
			return ht(bt.left,h);
        }
        h++;
		//System.out.println("h->"+h);
		return (int)Math.max((double)ht(bt.left,h),(double)ht(bt.right,h));
	}
	
	public static int leaf(Node bt,int l)
	{
		if(bt.left==null && bt.right==null)
		{
			l++;
			return l;
		}
		if(bt.left==null)
		{
			return leaf(bt.right,l);
		}
        if(bt.right==null)
        {
			return leaf(bt.left,l);
        }
		return leaf(bt.left,l)+leaf(bt.right,l);
	}

	public static int size(Node bt,int s)
	{
		if(bt==null)
			return s;
		//s++;
		return size(bt.right,s)+size(bt.left,s)+1;
	}

	public static ArrayList<Integer> pathtoleaf(Node bt,ArrayList<Integer> al,int d)
	{
		if(bt.left==null && bt.right==null)
		{
			al.add(d);
			return al;
		}
		d=d + bt.data;
		pathtoleaf(bt.left,al,d) ;
		pathtoleaf(bt.right,al,d);
	     return al;
	}

	public static boolean identicaltrees(Node bt1,Node bt2,boolean b)
	{
		if((bt1==null && bt2!=null)||(bt1!=null && bt2==null))
		{
			b=false;
			return b;
		}
		if(bt1==null && bt2==null)
			return b;
		if(bt1.data!=bt2.data)
			return false;
		else
			return identicaltrees(bt1.left, bt2.left, b) && identicaltrees(bt1.right, bt2.right, b);
		
	}

	public static int diameter(Node bt,int d)
	{
		if(bt==null)
			return d;
		return ht(bt.left,d)+ht(bt.right,d)+1;
	}

	public static boolean childsum(Node bt,boolean b)
	{
		if(bt.left==null && bt.right==null)
		return b;
		if(bt.left==null)
		{
			if(bt.data!=bt.right.data)
				return false;
			else
				return childsum(bt.right,b);
		}
		if(bt.right==null)
		{
			if(bt.data!=bt.left.data)
				return false;
			else
				return childsum(bt.left,b);
		}
		if(bt.data!=(bt.left.data+bt.right.data))
			return false;
		else
			return childsum(bt.left,b) && childsum(bt.right,b);
	}
	
    public static Node lca(Node bt,Node x,Node y)
    {
    	if(bt==null)
    		return null;
    	if(bt==x || bt==y)
    		return bt;
    	Node left = new Node(800);
    	Node right = new Node(100);
    	

    	left = lca(bt.left,x,y);
    	right = lca(bt.right,x,y);
    	if(left==null && right==null)
    		return null;
    	if(left!=null && right==null)
    	{
    		return left;
    	}
    	if(left==null && right!=null)
    	{
    		return right;
    	}
    	if(left!=null || right!=null)
    	{
    		return bt;
    	}

    	return bt;
    }
   
    public static int lca(Node bt,int x,int y)
    {
    	if(bt==null)
    		return -1;
    	if(bt.data==x || bt.data==y)
    		return bt.data;
    	Node left = new Node(800);
    	Node right = new Node(100);
    	

    	left.data = lca(bt.left,x,y);
    	right.data = lca(bt.right,x,y);
    	if(left.data==-1 && right.data==-1)
    		return -1;
    	if(left.data!=-1 && right.data==-1)
    	{
    		return left.data;
    	}
    	if(left.data==-1 && right.data!=-1)
    	{
    		return right.data;
    	}
    	if(left.data!=-1 || right.data!=-1)
    	{
    		return bt.data;
    	}

    	return bt.data;
    }

    public static boolean present(Node bt,int x,boolean b)
    {
    	if(bt==null)
    		return false;
    	if(bt.data==x)
    		return b;
    	else
    	{
    	//	count1++;
    		return present(bt.right,x,b) || present(bt.left,x,b);
    	}
    }

    public static void printAtK(Node bt,int k)
    {
    	if(bt==null)
    		return;
    	if(k==0)
    	{
    		System.out.println(bt.data);
    		return;
        }
    	 printAtK(bt.left,k-1);
    	 printAtK(bt.right,k-1);
	}

    public static int mindepth(Node bt,int m)
    {
//    	if(bt.left==null && bt.right==null)
//    	{
//    		m++;
//    		return m;
//    	}
//    	if(bt.left==null)
//    		return mindepth(bt.right,m);
//    	if(bt.right==null)
//    		return mindepth(bt.left, m);
    	
    	if(bt==null)
    		return m;
    	m++;
    	//System.out.println("bt.dat->"+bt.data+" && m->"+m);
    	return Math.min(mindepth(bt.left,m),mindepth(bt.right,m));
    }

    public static int disttoroot(Node bt,int x)
    {
    	if(bt==null)
    		return 0;

    	int d=0;
    		//System.out.println("hey");
    	  if(bt.data==x || (d=disttoroot(bt.left,x)) >0 || (d=disttoroot(bt.right,x))>0)
    	  {
//    		  System.out.println("in->"+d);
    		  return d+1;
    	  }
    	  
    	return 0;
    }
    
    public static int distBwnodes(Node bt,Node x,Node y,int d)
    {
    	Node l = lca(bt,x,y);
     	int dx = disttoroot(bt, x.data);
     	int dy = disttoroot(bt, y.data);
    	int dl=0;
    	if(l!=bt)
    	 dl = disttoroot(bt, l.data)-1;
    	return dx+dy-(2*dl)-1;
    }
    
    public static int praclca(Node bt,int x,int y)
    {
    	if(bt==null)
    	return -1;
    	if(bt.data==x|| bt.data==y)
    		return bt.data;
    	Node left=new Node(100);
    	Node right=new Node(100);
    	left.data=praclca(bt.left,x,y);
    	right.data=praclca(bt.right,x,y);
    	if(left.data==-1 && right.data==-1)
    		return -1;
    	if(left.data==-1 && right.data!=-1)
    		return right.data;
    	if(right.data==-1 && left.data!=-1)
    		return left.data;
    	if(right.data!=-1 && left.data!=-1)
    		return bt.data;
    	return bt.data;
    }
	//not working
    public static int sum(Node bt,int s){
    	if(bt==null)
    		{
    		s=0;
    		System.out.println("s->"+s);
    		return s;}
    	s=s+bt.data;
    	System.out.println("bt->"+bt.data);
    	return sum(bt.left,s)+sum(bt.right,s);
    }
	
	public static boolean sym(Node bt,Node bt1)
	{
		if((bt==null && bt1!=null)||(bt!=null && bt1==null))
	       return false;
		if(bt==null && bt1==null)
			return true;
		if(bt.data!=bt1.data)
			return false;
		else
			return sym(bt.right,bt1.left) && sym(bt.left,bt.right);
		
	}

	public static boolean foldable(Node bt)
	{
		if(bt==null)
			return true;
		mirror(bt.left);
		boolean b =  isStructsame(bt.left,bt.right);
		if(b)
			return true;
		else 
			return false;
	}
	public static boolean isStructsame(Node bt1,Node bt2)
	{
		if(bt1==null && bt2==null)
			return true;
		else if(bt1==null || bt2==null)
			return false;
		return isStructsame(bt1.right,bt2.right) && isStructsame(bt1.left,bt2.left);
	}
	public static void mirror(Node bt)
	{
		if(bt==null)
			return ;
		Node temp = bt.left;
		bt.left = bt.right;
		bt.right = temp;
		
		mirror(bt.right);
		mirror(bt.left);
		return ;
	}
	
	public static int level(Node bt,int l,int x)
	{
		if(bt==null)
			return -1;
		if(bt.data==x)
			return l+1;
		return Math.max(level(bt.right,l+1,x), level(bt.left,l+1,x));
	}

	public static Node doubletree(Node bt)
	{
		if(bt==null)
			return bt;
		if(bt.left==null && bt.right==null)
		{
			Node temp = new Node(bt.data);
			bt.left = temp;
			return bt;
		}
		if(bt.left==null)
		{
			Node temp = new Node(bt.data);
			bt.left = temp;
			return doubletree(bt.right);
		}
		if(bt.right==null){
			Node temp = new Node(bt.data);
			Node temp1 = bt.left;
			bt.left = temp;
			temp.left = temp1;
			return doubletree(temp1);
			}
		
		Node temp = new Node(bt.data);
		Node temp1 = bt.left;
		bt.left = temp;
		temp.left=temp1;
		
		doubletree(temp1);
		doubletree(bt.right);
		return bt;
		
	}
	 public static Node doubleTree(Node node) 
	    {
	        Node oldleft;
	  
	        if (node == null)
	            return node;
	  
	        /* do the subtrees */
	        doubleTree(node.left);
	        doubleTree(node.right);
	  
	        /* duplicate this node to its left */
	        oldleft = node.left;
	        node.left = new Node(node.data);
	        node.left.left = oldleft;
	        return node;
	    }

	 public static boolean balanced(Node bt)
	 {
		 if(bt.left==null && bt.right==null)
			 return true;
		 if(bt.right==null)
		 {
			 int r=0;
			 int l = ht(bt.left, 0);
			 int res = r-l;
			 if(Math.abs(res)>1)
			    {
				 //System.out.println("hey->"+bt.left.data);
				 return false;}
			 else
				 return true;
		 }
		 if(bt.left==null)
		 {
			 int l=0;
			 int r = ht(bt.right, 0);
			 int res = r-l;
			 if(Math.abs(res)>1)
			 {
				// System.out.println("12hey->"+bt.right.data);
				 return false;}
			 else
				 return true;
		 }
		 int l=ht(bt.left, 0);
		 int r=ht(bt.right,0);
		 int res = r-l;
		 if(Math.abs(res)>1)
		 {
			 //System.out.println("ophey->"+bt.data);
			 return false;}
		 else
			 return balanced(bt.left) && balanced(bt.right);
		 
	 }
	
	 public static Node invert(Node bt)
	 {
		 if(bt==null)
			 return bt;
		 if(bt.left==null && bt.right==null)
			 return bt;
		 if(bt.left==null)
		 {
			 bt.left=bt.right;
			 bt.right=null;
			 return invert(bt.left);
		 }
		 if(bt.right==null)
		 {
			 bt.right=bt.left;
			 bt.left=null;
			 return invert(bt.right);
		 }
		 Node tem = bt.left;
		 bt.left = bt.right;
		 bt.right = tem;
		 
		 invert(bt.left);
		 invert(bt.right);
		 return bt;
	 }

	 public static boolean complete(Node bt)
	 {
		 if(bt==null)
			 return true;
		 if(bt.left==null && bt.right!=null)
			 {
			 //System.out.println("hey");
			 return false;}
		 if(bt.left==null && bt.right!=null && bt.left.left!=null)
			 return false;
		 int l=0,r=0;
		 if(bt.left!=null)
		  l = ht(bt.left, 0);
		 if(bt.right!=null)
		  r = ht(bt.right,0);
		 if(l<r)
			 {
			 //System.out.println("oop");
			 return false;}
		 else
			 return complete(bt.right) && complete(bt.left);
	 }

	 public static boolean binaryisheap(Node bt)
	 {
		 if(complete(bt))
		 {
			 boolean b = binaryisheaphelp(bt);
			 if(b)
				 return true;
		 }
			 return false;
	 }
	 public static boolean binaryisheaphelp(Node bt)
	 {
		 if(bt==null)
			 return true;
		 
		 if(bt.left!=null && bt.right==null)
		 if( bt.left.data<bt.data)
		 {
			 System.out.println("2->"+bt.left.data+" && "+bt.data);
			 return binaryisheaphelp(bt.left);
	     }
		 else return false;
		 
		 if(bt.left==null && bt.right!=null)
		 if(bt.data>bt.right.data )
		 {
			 System.out.println("3");
			 return binaryisheaphelp(bt.right);
		 }
		 else return false;
		 
		 if(bt.left==null && bt.right==null)
			 return true;
		 
		  if(bt.data>bt.right.data && bt.left.data<bt.data)
			 {
				 System.out.println("1");
				 return binaryisheaphelp(bt.left) && binaryisheaphelp(bt.right);
		     }
			 else return false;
			 
		 
		 //return false;
	 }
	}
	
}