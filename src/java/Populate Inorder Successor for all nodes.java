
// User function Template for Java

/*
class Node {
    int data;
    Node left, right,next;

    public Node(int data){
        this.data = data;
    }
}

Populate Inorder Successor for all nodes
Difficulty: MediumAccuracy: 51.2%Submissions: 41K+Points: 4
Given a Binary Tree, complete the function to populate the next pointer for all nodes. The next pointer for every node should point to the Inorder successor of the node.
You do not have to return or print anything. Just make changes in the root node given to you.

Note: The node having no in-order successor will be pointed to -1. You don't have to add -1 explicitly, the driver code will take care of this.

Examples :

Input:
       10
       /  \
      8   12
     /
    3
Output: 3->8 8->10 10->12 12->-1
Explanation: The inorder of the above tree is : 3 8 10 12. So the next pointer of node 3 is pointing to 8 , next pointer of 8 is pointing to 10 and so on.And next pointer of 12 is pointing to -1 as there is no inorder successor of 12.
Input:
       1
      /  
     2 
   /
 3  
Output: 3->2 2->1 1->-1
Explanation: The inorder of the above tree is: 3 2 1. So the next pointer of node 3 is pointing to 2 , next pointer of 2 is pointing to 1. And next pointer of 1 is pointing to -1 as there is no inorder successor of 1.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1<= no. of nodes <=105
1<= data of the node <=105


*/

/*  T : O(n) S: O(n) */
class Solution {
    int count;
     Map<Node, Integer> inOrderIndexMap;
     Map<Integer, Node> indexInOrderMap;
    public void populateNext(Node root) {

        count=1;
        inOrderIndexMap = new HashMap<>();
        indexInOrderMap= new HashMap<>();
        
        inOrderTraversal(root, "READ");
        inOrderTraversal( root, "POPULATE");
        
    }
    
    public void inOrderTraversal( Node root, String Operation){
        if(root==null) return ;
        
        inOrderTraversal(root.left, Operation);
        
        if( Operation.equals( "READ")){
             inOrderIndexMap.put(root, count);
             indexInOrderMap.put( count++,root);
        }else{
                  
             if( indexInOrderMap.containsKey(inOrderIndexMap.get(root)+1) )
             root.next = indexInOrderMap.get(inOrderIndexMap.get(root)+1);
        
        }
        
         inOrderTraversal(root.right, Operation);
    }
    

}
