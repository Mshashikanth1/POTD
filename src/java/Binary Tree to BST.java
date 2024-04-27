
//User function Template for Java

/*Structure of the node class is
class Node
{
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
    
    Binary Tree to BST
EasyAccuracy: 60.75%Submissions: 62K+Points: 2

Given a Binary Tree, convert it to Binary Search Tree in such a way that keeps the original structure of Binary Tree intact.
 Example 1:

Input:
      1
    /   \
   2     3
Output: 
1 2 3
Explanation:
The converted BST will be 
      2
    /   \
   1     3


Example 2:

Input:
          1
       /    \
     2       3
   /        
 4       
Output: 
1 2 3 4
Explanation:
The converted BST will be

        3
      /   \
    2     4
  /
 1

Your Task:
You don't need to read input or print anything. Your task is to complete the function binaryTreeToBST() which takes the root of the Binary tree as input and returns the root of the BST. The driver code will print inorder traversal of the converted BST.

Expected Time Complexity: O(NLogN).
Expected Auxiliary Space: O(N).

Constraints:
1 <= Number of nodes <= 105
} */


class Solution
{
    // The given root is the root of the Binary Tree
    // Return the root of the generated BST
    Node binaryTreeToBST(Node root)
    {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);
        Collections.sort(list);
        binaryTreeToBST(root,list);
        return root;
    }
    public void inorder( Node root, ArrayList<Integer> list ){
        if(root!=null) {
            inorder(root.left, list);
            list.add(root.data);
            inorder(root.right, list);
        }
    }
    public static void binaryTreeToBST( Node root, ArrayList<Integer> list ){
        if(root!=null) {
            binaryTreeToBST(root.left, list);
            root.data = list.remove(0);
            binaryTreeToBST(root.right, list);
        }
    }
}
 
