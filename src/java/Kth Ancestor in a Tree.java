
//User function Template for Java

/*
Structure of Node class is:

class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}
*/

class Solution
{
    public int kthAncestor(Node root, int k, int node)
    {
        //Write your code here
        ArrayList<Integer> list = new ArrayList<>();
         boolean check = helper(root, list, node);
    
         int ans = 0;
         int i = list.size()-1;
         int j = 0;
         while(i>=0){
             if(j==k){
                 break;
             }
             ans = list.get(i);
             j++;
             i--;
         }
         if(i<0){
             return -1;
         }
        return list.get(i);
    }
    public boolean helper(Node root, ArrayList<Integer> list , int node){
        if(root == null){
            return false;
        }
        list.add(root.data);
        if(list.get(list.size()-1)==node){
            return true;
        }
        if(helper(root.left,list,node)||helper(root.right,list,node)){
            return true;
        }
        else{
            list.remove(list.size()-1);
            return false;
        }
    }
}

/*
Kth Ancestor in a Tree
MediumAccuracy: 35.06%Submissions: 72K+Points: 4
POTD July Placement Special : All POTD in the month of July are based on popular interview questions. Solve every day to ace the upcoming Placement Season !

Given a binary tree of size  N, a node, and a positive integer k., Your task is to complete the function kthAncestor(), the function should return the kth ancestor of the given node in the binary tree. If there does not exist any such ancestor then return -1.
Note: It is guaranteed that the node exists in the tree.

Example 1:



Input:
K = 2 Node = 4
Output: 1
Explanation:
Since, K is 2 and node is 4, so we
first need to locate the node and
look k times its ancestors.
Here in this Case node 4 has 1 as his
2nd Ancestor aka the Root of the tree.

Example 2:

Input:
k=1 
node=3
      1
    /   \
    2     3

Output:
1
Explanation:
K=1 and node=3 ,Kth ancestor of node 3 is 1.

Your Task:
You are asked to complete the function kthAncestor() which accepts root of the tree, k and node as input parameters, and returns the kth ancestor of Node which contains node as its value.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints:
1<=N<=105
1<= K <= 100
1 <= Node.data <= N

*/
