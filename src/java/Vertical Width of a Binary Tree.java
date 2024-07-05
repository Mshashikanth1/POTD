
class Solution {
    // Function to find the vertical width of a Binary Tree.
    
    /* T :O(n) S:O(n)*/
    public int verticalWidth(Node root) {
        // code here.
        
        Map<Integer,Integer> lis=dfs(root, new TreeMap<>() , 0);
        return lis.size();
        
    }
    public  Map<Integer,Integer> dfs( Node root,Map<Integer,Integer> lis ,int  width){
        if( root==null) return lis;
        
        lis.put(width, root.data); 
        dfs(root.left, lis, width-1);
        return  dfs (root.right,lis, width+1);
        
    }
    
    


   /*NOT WORKING*/
    int max=Integer.MIN_VALUE, min= Integer.MAX_VALUE;
    public int verticalWidth(Node root) {

        
        _dfs(root, new TreeMap<>() , 0);
        return Math.abs(max-min)+1;
        
    }
    public  Map<Integer,Integer> _dfs( Node root,Map<Integer,Integer> lis ,int  width){
        if( root==null) return lis;
        
        max= Math.max( width, max);
        min=Math.min(width, min);
        
        _dfs(root.left, lis, width-1);
        return  _dfs (root.right,lis, width+1);
        
    }
}


/*

Vertical Width of a Binary Tree
Difficulty: MediumAccuracy: 43.48%Submissions: 48K+Points: 4
Given a Binary Tree. You need to find and return the vertical width of the tree.

Examples :

Input:
         1
       /    \
      2      3
     / \    /  \
    4   5  6   7
            \   \
             8   9
Output: 6
Explanation: The width of a binary tree is
the number of vertical paths in that tree.



The above tree contains 6 vertical lines.
Input:
     1
    /  \
   2    3
Output: 3
Explanation: The above tree has 3 vertical lines, hence the answer is 3.
Expected Time Complexity: O(n).
Expected Auxiliary Space: O(height of the tree).

Constraints:
0 <= number of nodes <= 104


*/


