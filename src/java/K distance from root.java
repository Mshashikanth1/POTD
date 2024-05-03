
//User function Template for Java

/*
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} 
K distance from root
EasyAccuracy: 52.18%Submissions: 81K+Points: 2
 Done with winning Geekbits? Now win GfG Bag, GfG T-shirt & much more just by writing your experiences. Start Writing, Start Winning.
banner
Given a binary tree having n nodes and an integer k. Print all nodes that are at distance k from the root (root is considered at distance 0 from itself). Nodes should be printed from left to right.

Example 1:

Input:
k = 0
      1
    /   \
   3     2
Output: 
1
Explanation: 
1 is the only node which is 0 distance from the root 1.
Example 2:

Input:
k = 3
        1
       /
      2
       \
        1
      /  \
     5    3
Output: 
5 3
Explanation:  
5 and 3 are the nodes which are at distance 3 from the root 3.
Here, returning 3 5 will be incorrect.
Your Task:
You don't have to take input. Complete the function Kdistance() that accepts root node and k as parameters and returns the value of the nodes that are at a distance k from the root.

Expected Time Complexity: O(n).
Expected Auxiliary Space: O(Height of the Tree).

Constraints:
1 <= n <= 104
0 <= k <= 30


*/

class Tree
{
     ArrayList<Integer> Kdistance(Node root, int k)
     {
          ArrayList<Integer> arr=new ArrayList<>();
          dfs(root, 0,k, arr);
          return arr;
     }
    ArrayList<Integer> dfs( Node root, int depth ,int k, ArrayList<Integer> arr){
         if(root==null) return arr;
         if(depth==k) arr.add(root.data);
         dfs(root.left, depth+1,k, arr);
         dfs(root.right, depth+1 ,k, arr);
         return arr;
     }
}
