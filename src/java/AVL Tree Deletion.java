
//User function Template for Java

/*
class Node
{
	int data, height;
	Node left, right;
	Node(int x)
	{
		data = x;
		height = 1;
		left = right = NULL;
	}
}
AVL Tree Deletion
HardAccuracy: 47.98%Submissions: 22K+Points: 8
Win from a prize pool of INR 15K and get exciting merch! Register your team for Hack-A-Thon today!

Given an AVL tree and N values to be deleted from the tree. Write a function to delete a given value from the tree. All the N values which needs to be deleted are passed one by one as input data by driver code itself, you are asked to return the root of modified tree after deleting the value.

Example 1:

Tree = 
        4
      /   \
     2     6
    / \   / \  
   1   3 5   7

N = 4
Values to be deleted = {4,1,3,6}

Input: Value to be deleted = 4
Output:
        5    
      /   \
     2     6
    / \     \  
   1   3     7

Input: Value to be deleted = 1
Output:
        5    
      /   \
     2     6
      \     \  
       3     7

Input: Value to be deleted = 3
Output:
        5    
      /   \
     2     6
            \  
             7

Input: Value to be deleted = 6
Output:
        5    
      /   \
     2     7

Your Task:  
You dont need to read input or print anything. Complete the function delelteNode() which takes the root of the tree and the value of the node to be deleted as input parameters and returns the root of the modified tree.

Note: The tree will be checked after each deletion. 
If it violates the properties of balanced BST, an error message will be printed followed by the inorder traversal of the tree at that moment.
If instead all deletion are successful, inorder traversal of tree will be printed.
If every single node is deleted from tree, 'null' will be printed.

Expected Time Complexity: O(height of tree)
Expected Auxiliary Space: O(height of tree)

Constraints:
1 ≤ N ≤ 500

*/

class Sol
{
    
      Node root;
    public static int height(Node root) {
        if (root == null)
            return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
 
    public static int getBalance(Node root) {
        if (root == null)
            return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return rightHeight - leftHeight;
    }
 
    public static Node leftRotation(Node x) {
        Node y = x.right;
        Node T = y.left;
        x.right = T;
        y.left = x;
        return y;
    }
 
    public static Node rightRotation(Node x) {
        Node y = x.left;
        Node T = y.right;
        x.left = T;
        y.right = x;
        return y;
    }
 
    public static int findMax(Node head) {
        if (head == null)
            return -1;
        while (head.left != null) {
            head = head.left;
        }
        return head.data;
    } 
    
    public static Node deleteNode(Node root, int data)
    {
        // code here.
           if (root == null)
            return root;
 
        if (root.data < data)
            root.right = deleteNode(root.right, data);
        else if (root.data > data)
            root.left = deleteNode(root.left, data);
        else {
            if (root.left == null || root.right == null) {
                Node temp = (root.left == null) ? root.right : root.left;
                if (temp == null) {
                    temp = root;
                    root = null;
                } else {
                    root = temp;
                }
            } else {
                int rep = findMax(root.right);
                root.data = rep;
                root.right = deleteNode(root.right, rep);
            }
        }
 
        if (root == null)
            return root;
 
        int balance = getBalance(root);
        if (balance > 1 && getBalance(root.right) >= 0)
            return leftRotation(root);
        else if (balance < -1 && getBalance(root.left) <= 0)
            return rightRotation(root);
        else if (balance > 1 && getBalance(root.right) < 0) {
            root.right = rightRotation(root.right);
            return leftRotation(root);
        } else if (balance < -1 && getBalance(root.left) > 0) {
            root.left = leftRotation(root.left);
            return rightRotation(root);
        }
        return root;
    }
}
