//User function Template for Java

/* 
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
    //Function to find the height of a binary tree.
    Map<Integer,List<Integer>> adjList;
    int height(Node node) 
    {
        // code here 
        adjList=new HashMap<>();
        dfs(node,0);
        
        return adjList.size();
    }
    
    void dfs(Node node,int level){
        if(node==null) return;
        
        List<Integer> val = adjList.containsKey(level) ? adjList.get(level) : new ArrayList<>();
        
        val.add(node.data);
        adjList.put(level,val);
        
        dfs(node.left,level+1);
        dfs(node.right,level+1);
        
    }
}

/*
Height of Binary Tree
EasyAccuracy: 78.58%Submissions: 239K+Points: 2
Hack you way to glory and win from a cash pool prize of INR 15,000. Register for free now

banner
Given a binary tree, find its height.

Example 1:

Input:
     1
    /  \
   2    3
Output: 2
Example 2:

Input:
  2
   \
    1
   /
 3
Output: 3   
Your Task:
You don't need to read input or print anything. Your task is to complete the function height() which takes root node of the tree as input parameter and returns an integer denoting the height of the tree. If the tree is empty, return 0. 

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints:
1 <= Number of nodes <= 105
1 <= Data of a node <= 109



*/
