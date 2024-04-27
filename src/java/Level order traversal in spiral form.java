//User function Template for Java


/*
// A Binary Tree node
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

class Spiral
{
    //Function to return a list containing the level order 
    //traversal in spiral form.	
    Map<Integer,ArrayList<Integer>> adjList;
    ArrayList<Integer> findSpiral(Node root) 
    {
        // Your code here
        adjList=new HashMap<>();
        dfs(root,0);
       // System.out.println(adjList.toString());
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i : adjList.keySet()){
            if(i%2==0){
                Collections.reverse(adjList.get(i));
                for(int k : adjList.get(i)){
                    ans.add(k);
                }
            }else{
                for(int k : adjList.get(i)){
                    ans.add(k);
            }
            
        }
    }
            return ans;
    }
    void dfs(Node root, int depth){
        if(root==null) return;
       
        ArrayList<Integer> list;
        if(adjList.containsKey(depth)) { 
            list=adjList.get(depth);
            list.add(root.data); }
        else { list=new ArrayList<>();
        list.add(root.data);
        adjList.put(depth,list);
        }
        
        dfs(root.left,depth+1);
        dfs(root.right,depth+1);
    }
}


/*

Level order traversal in spiral form
EasyAccuracy: 36.43%Submissions: 185K+Points: 2
POTD July Placement Special : All POTD in the month of July are based on popular interview questions. Solve every day to ace the upcoming Placement Season !

Given a binary tree and the task is to find the spiral order traversal of the tree.

Spiral order Traversal mean: Starting from level 0 for root node, for all the even levels we print the node's value from right to left and for all the odd levels we print the node's value from left to right. 

For below tree, function should return 1, 2, 3, 4, 5, 6, 7.


 
 

Example 1:

Input:
      1
    /   \
   3     2
Output:1 3 2

Example 2:

Input:
           10
         /     \
        20     30
      /    \
    40     60
Output: 10 20 30 60 40 

Your Task:
The task is to complete the function findSpiral() which takes root node as input parameter and returns the elements in spiral form of level order traversal as a list. The newline is automatically appended by the driver code.
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
1 <= Number of nodes <= 105
0 <= Data of a node <= 105
*/
