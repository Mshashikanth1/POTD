
class Solution {
    List<Node> lis;
    public List<Node> printAllDups(Node root) {
        // code here
        lis= new ArrayList<>();
        dfs( root, new HashMap<>());
        
        return lis;
    }
    
    public String dfs( Node root, HashMap<String, Integer> fmap){
        if(root==null) return "";
        
   
        String left = dfs(root.left,fmap),
            right = dfs(root.right,fmap);
        
        String val= left+"," +right +","+ String.valueOf( root.data);
        
        fmap.put( val, fmap.getOrDefault(val, 0)+1);
     
        if( fmap.get( val)==2 ) {
            lis.add(root);
        }
        
        return val ;
    }
}

/*
Duplicate Subtrees
Difficulty: MediumAccuracy: 23.98%Submissions: 43K+Points: 4
Given a binary tree, your task is to find all duplicate subtrees from the given binary tree.

Note:  Return the root of each tree in the form of a list array & the driver code will print the tree in pre-order tree traversal in lexicographically increasing order.

Examples:

Input : 
 
Output: 2 4   
        4
Explanation: The above tree have two duplicate subtrees.i.e 
  2
 /
4  and 4. Therefore, you need to return the above tree root in the form of a list.
Input:     5
          / \
         4   6
        / \
       3   4
          / \
         3   6
Output: 4 3
        6
Explanation: In the above tree, there are two duplicate subtrees.i.e
  4
 /
3   and 6. Therefore, you need to return the above subtrees root in the form of a list.
Expected Time Complexity: O(n)
Expected Space Complexity: O(n)

Constraints:
1<= size of binary tree <=100


*/

