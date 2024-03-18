
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
class Solution
{
    /*
    Breadth first search intialize a queue (iterative)
    Time : O(n)
    Space : O(n)
    */
    static ArrayList <Integer> levelOrder1(Node root) 
    {
        ArrayList<Integer> lot=new ArrayList<>();
        Queue<Node> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            Node fst=queue.poll();
           lot.add(fst.data);
            if(fst.left!=null) queue.offer(fst.left);
            if(fst.right!=null) queue.offer(fst.right);
        }
        return lot;
    }
    /*
    Depth first search  by implict  stack (recursive)
    Time :O(n)
    Space :O(n)
    */
    static ArrayList<Integer> levelOrder(Node root){
           Map<Integer,List<Integer>> hMap=new LinkedHashMap<>();
           dfs(root,hMap,0);
           
           ArrayList<Integer> ans =new ArrayList<>();
           for(List<Integer> lis : hMap.values()){
               for(int i : lis){
                   ans.add(i);
               }
           }
           return ans;
           
    }
    static void dfs(Node root,  Map<Integer,List<Integer>> hMap, int level){
        if(root==null) return;
        List<Integer> lis=hMap.containsKey(level) ? hMap.get(level) : new ArrayList<>();
        
        lis.add(root.data);
        hMap.put(level,lis);
        
        dfs(root.left,hMap,level+1);
        dfs(root.right,hMap,level+1);
    }
}

/*
Level order traversal
EasyAccuracy: 70.31%Submissions: 175K+Points: 2
Share your experience with the world! Submit your admission, interview, campus or any other experience and reach an audience of millions today!

banner
Given a root of a binary tree with n nodes, find its level order traversal.
Level order traversal of a tree is breadth-first traversal for the tree.

Example 1:

Input:
    1
  /   \ 
 3     2
Output:
1 3 2
Example 2:

Input:
        10
     /      \
    20       30
  /   \
 40   60
Output:
10 20 30 40 60
Your Task:
You don't have to take any input. Complete the function levelOrder() that takes the root node as input parameter and returns a list of integers containing the level order traversal of the given Binary Tree.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)

Constraints:
1 ≤ n ≤ 105
0 ≤ Data of a node ≤ 109


*/





