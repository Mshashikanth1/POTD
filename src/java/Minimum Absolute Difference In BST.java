
//User function Template for Java

/*The Node structure is defined as
struct Node {
    int data;
    Node *left;
    Node *right;

};


[2, 3, 4, 5, 6, 7, 8]

20, 30, 50 , 60, 70 , 80

*/
class Solution
{
    
    /**Time : O(n) Space :O(n)*/
    List<Integer> arr;   
    int absolute_diff1(Node root)
    {
        //Your code here
        arr=new ArrayList<>();
        dfs1(root);
        int min=Integer.MAX_VALUE;
        System.out.println(arr);
        for(int i=0;i<arr.size()-1;i++) min=Math.min(min, arr.get(i+1)-arr.get(i));
        return min;
    }
    void dfs1(Node root){
       if(root==null) return;
       if(root.left!=null)  dfs1(root.left);
        arr.add(root.data);
       if(root.right!=null) dfs1(root.right);
    }
    
    
    /**Time :O(n) Space :O(1)**/
    int min=Integer.MAX_VALUE,pre=Integer.MIN_VALUE;
    int absolute_diff(Node root){
        dfs2(root);
        return min;
    }
    
    void dfs2(Node root){
        if(root==null) return;
        
        dfs2(root.left);
        if(pre==Integer.MIN_VALUE) pre=root.data;
        else {
            min=Math.min(min, Math.abs(root.data-pre));
            pre=root.data;
        }
        dfs2(root.right);
    }

}


/*
Minimum Absolute Difference In BST
MediumAccuracy: 66.33%Submissions: 8K+Points: 4
Given a binary search tree having n (n>1) nodes, the task is to find the minimum absolute difference between any two nodes.

Example 1:

Input:
Input tree

Output:
10
Explanation:
There are no two nodes whose absolute difference in smaller than 10.
Example 2:

Input:
Input tree

Output:
20
Explanation:
There are no two nodes whose absolute difference in smaller than 20.
Your Task:
You don't have to take any input. Just complete the function absolute_diff() , that takes root as input and return minimum absolute difference between any two nodes.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
2 <= n <= 105
1 <= Node->data <= 109

Topic Tags

*/
