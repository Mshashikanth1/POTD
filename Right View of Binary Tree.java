
//User function Template for Java


/*Complete The Function Provided
Given Below is The Node Of Tree
class Node
{
    int data;
    Node left, right;
    public Node(int data)
    {
        this.data = data;
         left = right = null;
    }
}*/


class Solution{
    //Function to return list containing elements of right view of binary tree.
    public Map<Integer,ArrayList<Integer>> adjList;
    ArrayList<Integer> rightView(Node node) {
        //add code here.
        adjList = new LinkedHashMap<>();
        dfs(node,1);
        
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i: adjList.keySet()) {
            List<Integer> lis =adjList.get(i);
            int last=lis.size()-1;
            ans.add(lis.get(last));
        }
        
        return ans;

    }
    void dfs(Node node,int level){
        if(node==null) return;
        
        ArrayList<Integer> lis;
        if(adjList.containsKey(level)) {
        lis=adjList.get(level);
            lis.add(node.data);
        }
        else {
        lis=new ArrayList();
        lis.add(node.data);
        }
        adjList.put(level,lis);

        
        dfs(node.left,level+1);
        dfs(node.right,level+1);
    }
}
/*
Right View of Binary Tree
EasyAccuracy: 65.18%Submissions: 133K+Points: 2
POTD July Placement Special : All POTD in the month of July are based on popular interview questions. Solve every day to ace the upcoming Placement Season !

Given a Binary Tree, find Right view of it. Right view of a Binary Tree is set of nodes visible when tree is viewed from right side.

Right view of following tree is 1 3 7 8.

          1
       /     \
     2        3
   /   \      /    \
  4     5   6    7
    \
     8

Example 1:

Input:
       1
    /    \
   3      2
Output: 1 2

Example 2:

Input:
     10
    /   \
  20     30
 /   \
40  60 
Output: 10 30 60

Your Task:
Just complete the function rightView() that takes node as parameter and returns the right view as a list. 

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Height of the Tree).

Constraints:
1 ≤ Number of nodes ≤ 105
0 ≤ Data of a node ≤ 105

*/
