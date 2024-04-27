{
    int data;
    Node right, left;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/



class GfG
{
    Node buildBalancedTree(Node root) 
    {
        //Add your code here.
        if(root==null) return null;
        ArrayList<Integer>list=new ArrayList<>();
        inorder(root,list);
        return constructTree(list,0,list.size()-1);
    }
    public void inorder(Node root,ArrayList<Integer>list){
        if(root==null) return ;
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
    }
    public Node constructTree(ArrayList<Integer>list,int low,int high){
        if(low>high) return null;
        int mid=(low+high)/2;
        Node curr = new Node(list.get(mid));
        curr.left=constructTree(list,low,mid-1);
        curr.right=constructTree(list,mid+1,high);
        return curr;
    }
}

/*
Normal BST to Balanced BST
EasyAccuracy: 66.08%Submissions: 39K+Points: 2
We've got offers as great as this problem! Explore Geek Week 2023

banner
Given a Binary Search Tree, modify the given BST such that it is balanced and has minimum possible height. Return the balanced BST.

Example1:

Input:
       30
      /
     20
    /
   10
Output:
     20
   /   \
 10     30
Example2:

Input:
         4
        /
       3
      /
     2
    /
   1
Output:
      3            3           2
    /  \         /  \        /  \
   1    4   OR  2    4  OR  1    3   
    \          /                  \ 
     2        1                    4

Your Task:
The task is to complete the function buildBalancedTree() which takes root as the input argument and returns the root of tree after converting the given BST into a balanced BST with minimum possible height. The driver code will print the height of the updated tree in output itself.
 
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
Here N denotes total number of nodes in given BST.

Constraints:
1 <= N <= 105
1 <= Node data <= 109


*/
