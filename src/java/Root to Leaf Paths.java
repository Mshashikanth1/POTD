*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}

Root to Leaf Paths
MediumAccuracy: 43.65%Submissions: 56K+Points: 4
 Done with winning Geekbits? Now win GfG Bag, GfG T-shirt & much more just by writing your experiences. Start Writing, Start Winning.
banner
Given a Binary Tree of nodes, you need to find all the possible paths from the root node to all the leaf nodes of the binary tree.

Example 1:

Input:
       1
    /     \
   2       3
Output: 
1 2 
1 3 
Explanation: 
All possible paths:
1->2
1->3
Example 2:

Input:
         10
       /    \
      20    30
     /  \
    40   60
Output: 
10 20 40 
10 20 60 
10 30 
Your Task:
Your task is to complete the function Paths() which takes the root node as an argument and returns all the possible paths. (All the paths are printed in new lines by the driver's code.)

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(height of the tree)

Constraints:
1<=n<=104
1 ,2 ,3 
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        return dfs(root, arr,new Stack<>());
      
    }
    
    public static ArrayList<ArrayList<Integer>>  dfs(Node root,  ArrayList<ArrayList<Integer>> arr,Stack<Node> stack2){
        
           if(root!=null) {
               
              stack2.push(root);
           
              if(root.left==null && root.right==null) {
            
                 ArrayList<Integer> path=new ArrayList<>();
                 for(Node n: stack2) path.add(n.data);
            
                 arr.add(path);
               }
            
           
               dfs(root.left, arr, stack2);
               while( !stack2.isEmpty() && stack2.peek()!=root) stack2.pop();
               dfs(root.right, arr, stack2);
               return arr;
           }
          return arr;
       }
 }

