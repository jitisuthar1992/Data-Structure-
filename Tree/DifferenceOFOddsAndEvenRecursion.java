package com.tree;


class TreeNode 
{
    int data;
    TreeNode left, right;
  
    TreeNode(int data) 
    {
        this.data = data;
        left = right;
    }
}
public class DifferenceOFOddsAndEvenRecursion {
	
	TreeNode root;
	  
	    int getLevelDiff(TreeNode node) 
	    {
	       
	        if (node == null)
	        return 0;
	        
	        
	        int result=node.data - getLevelDiff(node.left) - getLevelDiff(node.right);
	        return result;
	    }
	  
	    // Driver program to test above functions
	    public static void main(String args[]) 
	    {
	    	DifferenceOFOddsAndEvenRecursion tree = new DifferenceOFOddsAndEvenRecursion();
	    	tree.root = new TreeNode(1);
	        tree.root.left = new TreeNode(2);
	        tree.root.right = new TreeNode(3);
	        tree.root.left.left = new TreeNode(4);
	        tree.root.left.right = new TreeNode(5);
	        tree.root.right.left = new TreeNode(6);
	        tree.root.right.right = new TreeNode(7);
	        tree.root.right.left.right = new TreeNode(8);
	        tree.root.right.right.right = new TreeNode(9);
	        System.out.println(tree.getLevelDiff(tree.root));
	  
	    }

}
