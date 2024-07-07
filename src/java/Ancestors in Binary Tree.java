
/*class Node of the binary tree
class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
    
    Ancestors in Binary Tree
Difficulty: MediumAccuracy: 40.34%Submissions: 53K+Points: 4
Given a Binary Tree and an integer target. Find all the ancestors of the given target.

Note:

The ancestor of node x is node y, which is at the upper level of node x, and x is directly connected with node y. Consider multiple levels of ancestors to solve this problem.
In case there are no ancestors available, return an empty list.
Examples:

Input:
         1
       /   \
      2     3
    /  \    /  \
   4   5  6   8
  /
 7
target = 7
Output: [4 2 1]
Explanation: The given target is 7, if we go above the level of node 7, then we find 4, 2 and 1. Hence the ancestors of node 7 are 4 2 and 1
Input:
        1
      /   \
     2     3
target = 1
Output: [ ]
Explanation: Since 1 is the root node, there would be no ancestors. Hence we return an empty list.
Expected Time Complexity: O(n).
Expected Auxiliary Space: O(height of tree)

Constraints:
1 ≤ no. of nodes ≤ 103
1 ≤ data of node ≤ 104


}*/
class Solution {


    /* T : O(n)  S: O(n) */
    public ArrayList<Integer> Ancestors(Node root, int target) {

        
        ArrayList<Integer> ancestors= new ArrayList<>();
        Map<Integer,Integer> parentMap= new HashMap<>();
        
        parentMap=dfs(root, parentMap);
        parentMap=dfs_iterative(root, parentMap);

        
        while(  parentMap.containsKey(target) ) {
            int targetParent= parentMap.get( target);
            ancestors.add( targetParent );
            target= targetParent;
        }   
        
        return ancestors;
        
    }
    
    Map<Integer,Integer> dfs_iterative( Node root, Map<Integer,Integer> parentMap ){

      Stack<Node> stack = new Stack<>();
        stack.push(root);
        
        while(!stack.isEmpty()){
            
            Node pop= stack.pop();
            
            if(pop.left != null)  { parentMap.put( pop.left.data , pop.data );  stack.push(pop.left);  }
            if(pop.right != null) { parentMap.put( pop.right.data , pop.data ); stack.push( pop.right); }
        }
        
        return parentMap;
    }
    
    Map<Integer,Integer> dfs( Node root, Map<Integer,Integer> parentMap ){
        
        if (root==null  ) return  parentMap;
          
        if(root.left != null)  { parentMap.put( root.left.data , root.data );  dfs( root.left, parentMap);  }
        if(root.right != null) { parentMap.put( root.right.data , root.data );   dfs(root.right, parentMap); }
          
        return  parentMap;
    }
    
    
}



