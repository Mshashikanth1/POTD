class Solution
{
    //Function to find the nodes that are common in both BST.
public static ArrayList<Integer> findCommon(Node root1,Node root2)
    {
        //code here
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        inorder(root1,list);
        inorder(root2,list1);
        Collections.sort(list);
        Collections.sort(list1);
       HashSet<Integer>set=new HashSet<>();
       HashSet<Integer>set1=new HashSet<>();
       for(int i=0;i<list.size();i++){
           set.add(list.get(i));
       }
       for(int i=0;i<list1.size();i++){
           set1.add(list1.get(i));
       }
       for(int i=0;i<list.size();i++){
           int a=list.get(i);
           if(set1.contains(a)){
               list2.add(a);
           }
       }
       return list2;
        
    }
    public static void inorder(Node root,ArrayList<Integer>list){
        if(root==null){
            return ;
        }
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
    }
}

/*
Find Common Nodes in two BSTs
EasyAccuracy: 51.7%Submissions: 49K+Points: 2
We've got offers as great as this problem! Explore Geek Week 2023

banner
Given two Binary Search Trees. Find the nodes that are common in both of them, ie- find the intersection of the two BSTs.

Note: Return the common nodes in sorted order.

Example 1:

Input:
BST1:
                  5
               /     \
             1        10
           /   \      /
          0     4    7
                      \
                       9
BST2:
                10 
              /    \
             7     20
           /   \ 
          4     9
Output: 4 7 9 10

Example 2:

Input:
BST1:
     10
    /  \
   2   11
  /  \
 1   3
BST2:
       2
     /  \
    1    3
Output: 1 2 3
Your Task:
You don't need to read input or print anything. Your task is to complete the function findCommon() that takes roots of the two BSTs as input parameters and returns a list of integers containing the common nodes in sorted order. 

Expected Time Complexity: O(N1 + N2) where N1 and N2 are the sizes of the 2 BSTs.
Expected Auxiliary Space: O(H1 + H2) where H1 and H2 are the heights of the 2 BSTs.

Constraints:
1 <= Number of Nodes <= 105
1 <= Node data <= 109


*/
