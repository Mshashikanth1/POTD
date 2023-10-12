//User function Template for Java

/* A Binary Tree node

class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 */

class Solution {
    int dupSub(Node root) {
        if(root==null) return 0;

        HashMap<String,Integer> m=new HashMap<>();
        dfs(root.left,m);
        dfs(root.right,m);
        
 
        for(Map.Entry<String,Integer> me:m.entrySet()){
             System.out.println(me.getKey() +" : " + me.getValue());
            if(me.getValue()>1) return 1;
           
            
        }
        return 0;
        
    }
    private String dfs(Node root,HashMap<String,Integer> m) {
        StringBuilder s = new StringBuilder(); 
        if (root == null) {
            return "#"; 
        }
        if (root.left==null && root.right==null) return root.data+" "; 

        s.append(root.data+" "); 
        s.append(dfs(root.left,m)); 
        s.append(dfs(root.right,m)); 
        m.put(s.toString(),m.getOrDefault(s.toString(),0)+1);
        
        return s.toString(); 
        }
    }
    
    /*
    
    Duplicate subtree in Binary Tree
MediumAccuracy: 34.23%Submissions: 79K+Points: 4
Hack you way to glory and win from a cash pool prize of INR 15,000. Register for free now

banner
Given a binary tree, find out whether it contains a duplicate sub-tree of size two or more, or not.

Note: Two same leaf nodes are not considered as subtree as size of a leaf node is one. 

Example 1 :

Input : 
               1
             /   \ 
           2       3
         /   \       \    
        4     5       2     
                     /  \    
                    4    5
Output : 1
Explanation : 
    2     
  /   \    
 4     5
is the duplicate sub-tree.
Example 2 :

Input : 
               1
             /   \ 
           2       3
Output: 0
Explanation: There is no duplicate sub-tree 
in the given binary tree.
Your Task:  
You don't need to read input or print anything. Your task is to complete the function dupSub() which takes root of the tree as the only argument and returns 1 if the binary tree contains a duplicate sub-tree of size two or more, else 0.

Expected Time Complexity: O(N)
Expected Space Complexity: O(N)

Constraints:
0 ≤ Data of nodes ≤ 9
1 ≤ Number of nodes ≤ 105 
    */
    
    
    
