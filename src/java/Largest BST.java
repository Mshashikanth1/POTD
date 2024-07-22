
//User function Template for Java

// class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }


/* T : O(V *V )  S: O (V) */
class Solution{
    
    // Return the size of the largest sub-tree which is also a BST
    static List<Integer> arr;
    static int max=0;
    static int largestBst(Node root)
    {
        // Write your code here
        arr= new ArrayList<>();
        max=0;
        dfsNode(root);
        
        return max;
    }
    
    static void dfs(Node root){
        if( root==null) return;
        
        dfs(root.left);
        
        arr.add(root.data);
        dfs(root.right);
    }
    
    static void dfsNode(Node root){
        if( root==null) return;
        
        arr= new ArrayList<>();
        dfs(root);
        if(isSorted()) max = Math.max( max, arr.size());
        
        dfsNode(root.left);
        dfsNode(root.right);
    }
    
    static boolean isSorted(){
        
        // System.out.println(arr);
        for( int i=0; i<arr.size()-1; i++){
            if( arr.get(i+1) <= arr.get(i) ) return false;
        }   
        return true;
    }
    
    
}


/*
Largest BST
Difficulty: MediumAccuracy: 29.73%Submissions: 129K+Points: 4
Given a binary tree. Find the size of its largest subtree which is a Binary Search Tree.
Note: Here Size equals the number of nodes in the subtree.

Examples :

Input:   1
        /  \
        4   4              
       / \ 
      6   8
Output: 1 
Explanation: There's no sub-tree with size greater than 1 which forms a BST. All the leaf Nodes are the BSTs with size equal to 1.

Input:    6
        /   \
      6      2              
       \    / \
        2  1   3
Output: 3
Explanation: The following sub-tree is a BST of size 3:  2
                                                       /   \
                                                      1     3
Expected Time Complexity: O(n).
Expected Auxiliary Space: O(Height of the BST).

Constraints:
1 ≤ Number of nodes ≤ 105
1 ≤ Data of a node ≤ 106


*/
