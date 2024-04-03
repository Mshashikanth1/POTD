
// User function Template for Java
class Solution {
 Map<Integer,List<Integer>> hMap;
 int xi=-1;
 int yi=-1;
 public int kthCommonAncestor1(Node root, int k, int x, int y) {
         hMap=new HashMap<>();
         lot(root,0,x,y);
         
         System.out.println(hMap.toString());
 
     return -1;
 }


   public void lot(Node root,int level,int x, int y){
       if(root==null) return;
       if(x==root.data) xi=level;
       if(y==root.data) yi=level;
       
       List<Integer> lis= hMap.getOrDefault(level,new ArrayList<>());
       lis.add(root.data);
       hMap.put(level,lis);
       
       lot(root.left,level+1,x,y);
       lot(root.right,level+1,x,y);
   }
   
   public int kthCommonAncestor(Node root, int k, int x, int y) {
        // code here
        if(root == null || (root.left == null && root.right == null))
            return -1;
            
        List<Integer> list = new LinkedList<>();
        kthAncestor(root, x, y, list);
        int count = 1, idx = list.size() - 1;
        while(count < k) {
            idx--;
            if(idx < 0)
                return -1;
            count++;
        }
        
        return idx >= 0 ? list.get(idx) : -1;
    }
    
    private void kthAncestor(Node root, int x, int y, List<Integer> list) {
        if(root == null)
            return;
        
        list.add(root.data);
        if(root.data > x && root.data > y)
            kthAncestor(root.left, x, y, list);
        if(root.data < x && root.data < y)
            kthAncestor(root.right, x, y, list);
    }

}

/*
Kth common ancestor in BST
MediumAccuracy: 61.97%Submissions: 11K+Points: 4
Given a BST with n (n>=2) nodes, find the kth common ancestor of nodes x and y in the given tree. Return -1 if kth ancestor does not exist.

Nodes x and y will always be present in the input of a BST, and x != y.

Example 1:

Input: 
Input tree

k = 2, x = 40, y = 60 
Output:
30
Explanation:
Their 2nd common ancestor is 30.
Example 2:

Input: 
Input tree

k = 2, x = 40, y = 60
Output:
-1
Explanation:
LCA of 40 and 60 is 50, which is root itself. There does not exists 2nd common ancestor in this case.
Your task :
You don't have to read input or print anything. Your task is to complete the function kthCommonAncestor() that takes the root of the tree, k, x and y as input and returns the kth common ancestor of x and y.
 
Expected Time Complexity: O(Height of the Tree)
Expected Space Complexity: O(Height of the Tree)
 
Your Task :
1 <= n, k <= 105
1 <= node->data, x, y <= 109
  1. --> 50
  2. --> 40,  70
  3  --> 30,  60,  80
  
  
  1 -->  30
  2 ---> 20, 50
  3 ---> 40, 60
  4 ---> 90, 70, 80
  
  
  20 , 30 , 40 , 50 , 60 
        1
        
  30, 40 , 50, 60 , 70 , 80
*/
