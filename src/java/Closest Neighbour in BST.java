
// User function Template for Java

/*class Node
{
    int key;
    Node left, right;

    Node(int x)
    {
        key = x;
        left = right = null;
    }

}*/

//Time :O(n) Space :O(1)
class Solution {
        
   int min=-1;

    public  int findMaxForN(Node root, int n) {
        // Add your code here.
        
         dfs(root, n);
         return min;
    }
    public  void dfs(Node root, int n){
        
        if(root==null) return;
          if(root.key <= n)  min=Math.max(min,root.key);
        
        dfs(root.left,n);
        dfs(root.right,n);
        
         }
}

/*
Closest Neighbour in BST
EasyAccuracy: 36.98%Submissions: 33K+Points: 2
Given the root of a binary search tree and a number n, find the greatest number in the binary search tree that is less than or equal to n. 

Example 1 :

Input : 

n = 24
Output : 
21
Explanation : The greatest element in the tree which 
              is less than or equal to 24, is 21. 
              (Searching will be like 5->12->21)
Example 2 :

Input : 

n = 4
Output : 
3
Explanation : The greatest element in the tree which 
              is less than or equal to 4, is 3. 
              (Searching will be like 5->2->3)
Your task :
You don't need to read input or print anything. Your task is to complete the function findMaxForN() which takes the root of the BST, and the integer n as input parameters and returns the greatest element less than or equal to n in the given BST, Return -1 if no such element exists.

Expected Time Complexity: O(Height of the BST)
Expected Auxiliary Space: O(Height of the BST).

Constraints:
1 <= n <= 103
1 <= elements of the BST <= 103
All nodes are unique in the BST
 
*/
