
//User function Template for Java

/*Complete the function below
Node is as follows:
class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=right=null;
	}
}
*/
class Solution
{
    // returns the inorder successor of the Node x in BST (rooted at 'root')
    List<Node> arr;
	public Node inorderSuccessor(Node root,Node x)
         {
          //add code here.
          arr=new ArrayList<>();
          inorder(root);
          try{
          for(int i=0;i<arr.size();i++){
              if(arr.get(i).data==x.data) {return arr.get(i+1);}
          }
          }catch(Exception ex){
          return new Node(-1);
          }
           return new Node(-1);
         }
         public void inorder(Node root){
             if(root==null) return;
             inorder(root.left);
             arr.add(root);
             inorder(root.right);
         }
         
}
/*
Inorder Successor in BST
EasyAccuracy: 34.97%Submissions: 84K+Points: 2
POTD July Placement Special : All POTD in the month of July are based on popular interview questions. Solve every day to ace the upcoming Placement Season !

Given a BST, and a reference to a Node x in the BST. Find the Inorder Successor of the given node in the BST.
 

Example 1:

Input:
      2
    /   \
   1     3
K(data of x) = 2
Output: 3 
Explanation: 
Inorder traversal : 1 2 3 
Hence, inorder successor of 2 is 3.


Example 2:

Input:
             20
            /   \
           8     22
          / \
         4   12
            /  \
           10   14
K(data of x) = 8
Output: 10
Explanation:
Inorder traversal: 4 8 10 12 14 20 22
Hence, successor of 8 is 10.

 

Your Task:
You don't need to read input or print anything. Your task is to complete the function inOrderSuccessor(). This function takes the root node and the reference node as argument and returns the node that is inOrder successor of the reference node. If there is no successor, return null value.


Expected Time Complexity: O(Height of the BST).
Expected Auxiliary Space: O(1).
*/
