// User function Template for Java

/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}

*/

/*. T : O(n) S: O(n)*/
class Solution {
    // Function to return a list of integers denoting the node
    // values of both the BST in a sorted order.
    List<Integer> lis;
    public List<Integer> merge(Node root1, Node root2) {
        // Write your code here
        lis= new ArrayList<>();
        
        dfs( root1);
        dfs( root2);
        
        Collections.sort( lis);
        return  lis;
    }
    
    public void dfs( Node root){
        if( root==null) return;
        
        lis.add(root.data );
        dfs(root.left);
        dfs(root.right);
    }
}
/*
Merge two BST 's
Difficulty: MediumAccuracy: 64.95%Submissions: 67K+Points: 4
Given two BSTs, return elements of merged BSTs in sorted form.

Examples :

Input:
BST1:
       5
     /   \
    3     6
   / \
  2   4  
BST2:
        2
      /   \
     1     3
            \
             7
            /
           6
Output: 1 2 2 3 3 4 5 6 6 7
Explanation: After merging and sorting the two BST we get 1 2 2 3 3 4 5 6 6 7.
Input:
BST1:
       12
     /   
    9
   / \    
  6   11
BST2:
      8
    /  \
   5    10
  /
 2
Output: 2 5 6 8 9 10 11 12
Explanation: After merging and sorting the two BST we get 2 5 6 8 9 10 11 12.
Expected Time Complexity: O(m+n)
Expected Auxiliary Space: O(Height of BST1 + Height of BST2 + m + n)

Constraints:
1 ≤ Number of Nodes ≤ 105
*/
