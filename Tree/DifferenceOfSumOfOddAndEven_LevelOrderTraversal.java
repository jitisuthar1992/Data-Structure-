package com.tree;

import java.util.LinkedList;
import java.util.Queue;

class Node 
{
     int data;
    Node left, right;
  
    Node(int data) 
    {
        this.data = data;
        left = right;
    }
}
public class DifferenceOfSumOfOddAndEven_LevelOrderTraversal {
	
	
	
	Node root=null;

    	public int difference(Node root) {
          int eSum = 0;
           int oSum = 0;
          int height = 0;
           int count = 0;
         Queue<Node> queue = new LinkedList<Node>();
          if (root == null)
            return 0;
          queue.add(root);
            while (!queue.isEmpty()) {
              height++;
             count = queue.size();
              while (count > 0) {
                root = queue.poll();
                int x = root.data;
                if (height % 2 == 0) {
                	eSum += x;
                } else {
                	oSum += x;
                }
                if(root.left!=null) 
                	queue.add(root.left);
                if(root.right!=null) 
                	queue.add(root.right);
                count--;
            }

        }
        return oSum - eSum;
    }
	  public static void main(String args[]) 
	    {
		  DifferenceOfSumOfOddAndEven_LevelOrderTraversal tree = new DifferenceOfSumOfOddAndEven_LevelOrderTraversal();
	    	tree.root = new Node(1);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(5);
	        tree.root.right.left = new Node(6);
	        tree.root.right.right = new Node(7);
	        tree.root.right.left.right = new Node(8);
	        tree.root.right.right.right = new Node(9);
	        System.out.println(tree.difference(tree.root));
	  
	    }


}
