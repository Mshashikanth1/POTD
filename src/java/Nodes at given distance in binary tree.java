//User function Template for Java

// class Node  
// { 
//     int data; 
//     Node left, right;
// }




class Solution
{
    public static Node SearchTarget(Node root,int val){
        if(root==null)return null;
        if(root.data==val)return root;
        Node left=SearchTarget(root.left,val);
        Node right=SearchTarget(root.right,val);
        if(left==null)return right;
        return left;
    }
    public static ArrayList<Integer> KDistanceNodes(Node root, int target , int k)
    {
        // return the sorted list of all nodes at k dist
        HashMap<Node,Node>mp=new HashMap<>();
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        while(q.size()!=0){
            Node temp=q.remove();
            if(temp.left!=null){
                mp.put(temp.left,temp);
                q.add(temp.left);
            }
            if(temp.right!=null){
                mp.put(temp.right,temp);
                q.add(temp.right);
            }
        }
        ArrayList<Integer>ans=new ArrayList<>();
        HashMap<Node,Integer>isVisit=new HashMap<>();
        Queue<Node>q1=new LinkedList<>();
        Node node=SearchTarget(root,target);
        q1.add(node);
        isVisit.put(node,0);
        while(q1.size()!=0){
            Node temp=q1.poll();
            
            if(temp.left!=null && !isVisit.containsKey(temp.left)){
                Node left=temp.left;
                q1.add(left);
                isVisit.put(left,isVisit.get(temp)+1);
                if(isVisit.get(left)==k){
                    ans.add(left.data);
                }
            }
            
            if(temp.right!=null && !isVisit.containsKey(temp.right)){
                Node right=temp.right;
                q1.add(right);
                isVisit.put(right,isVisit.get(temp)+1);
                if(isVisit.get(right)==k){
                    ans.add(right.data);
                }
            }
            
            if(mp.containsKey(temp) && !isVisit.containsKey(mp.get(temp))){
                Node parent=mp.get(temp);
                q1.add(parent);
                isVisit.put(parent,isVisit.get(temp)+1);
                if(isVisit.get(parent)==k){
                    ans.add(parent.data);
                }
            }
            
        }
        Collections.sort(ans);
        return ans;
    }
};


/*
Nodes at given distance in binary tree
HardAccuracy: 32.36%Submissions: 65K+Points: 8
Hack you way to glory and win from a cash pool prize of INR 15,000. Register for free now

banner
Given a binary tree, a target node in the binary tree, and an integer value k, find all the nodes that are at distance k from the given target node. No parent pointers are available.
Note:

You have to return the list in sorted order.
The tree will not contain duplicate values.
Example 1:

Input:      
          20
        /    \
      8       22 
    /   \
   4    12 
       /   \
      10    14
Target Node = 8
K = 2
Output: 10 14 22
Explanation: The three nodes at distance 2
from node 8 are 10, 14, 22.

Example 2:

Input:      
         20
       /    \
      7      24
    /   \
   4     3
        /  
       1    
Target Node = 7
K = 2
Output: 1 24
Your Task:  
You don't need to read input or print anything. Complete the function KDistanceNodes() which takes the root of the tree, target, and K as input parameters and returns a list of nodes at k distance from target in a sorted order.

Expected Time Complexity: O(N*logN)
Expected Auxiliary Space: O(Height of tree)

Constraints:
1 ≤ N ≤ 105
1 ≤ data of node ≤ 109
1 ≤ target ≤ 109
1 ≤ k ≤ 20

*/
