
/*Complete the function below
Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
Diagonal sum in binary tree
MediumAccuracy: 61.89%Submissions: 27K+Points: 4
Consider Red lines of slope -1 passing between nodes (in following diagram). The diagonal sum in a binary tree is the sum of all node datas lying between these lines. Given a Binary Tree of size n, print all diagonal sums.

For the following input tree, output should be 9, 19, 42.
9 is sum of 1, 3 and 5.
19 is sum of 2, 6, 4 and 7.
42 is sum of 9, 10, 11 and 12.

DiagonalSum

Example 1:

Input:
         4
       /   \
      1     3
           /
          3
Output: 
7 4 
Example 2:

Input:
           10
         /    \
        8      2
       / \    /
      3   5  2
Output: 
12 15 3 
Your Task:
You don't need to take input. Just complete the function diagonalSum() that takes root node of the tree as parameter and returns an array containing the diagonal sums for every diagonal present in the tree with slope -1.

Expected Time Complexity: O(nlogn).
Expected Auxiliary Space: O(n).

Constraints:
1 <= n <= 105
0 <= data of each node <= 104



*/
class Tree {
   
    static Map<Integer,List<Integer>> hMap;
    static Set<Node> visited;
    public static ArrayList <Integer> diagonalSum(Node root) 
    {

        hMap=new LinkedHashMap<>();
        ArrayList<Integer> ans=new ArrayList<>();
        visited=new HashSet<>();
        dfs(root,0);
        
        for(Set<Node> set: hMap.values()){
            int sum=0;
            for(Node i:set ) sum+=i.data; 
            ans.add(sum);
        }
        return ans;
        
    }
    public static void dfs(Node root,int level){
        if(root==null) return;
        
         Set<Node> lis = hMap.containsKey(level) ?  hSet=hMap.get(level) : new ArrayList<>();
         if(!visited.contains(root)) {
             lis.add(root);
             visited.add(root);
         }
         if(root.right!=null && !visited.contains(root.right) ) {
             hSet.add(root.right);
             visited.add(root.right);
         }
         if(!lis.isEmpty()) hMap.put(level,hSet);
        
   
          lis = hMap.containsKey(level+1) ?  hSet=hMap.get(level+1) : new ArrayList<>();
         if(root.left!=null && !visited.contains(root.left)) {
             lis.add(root.left);
             visited.add(root.left);
         }
         if(!lis.isEmpty()) hMap.put(level+1,hSet);
         
        dfs(root.left,level+1);
        dfs(root.right,level);
    }
}
// 0 ->[1,3,5]
// 1 ->[2,6,4,7]
// 2 ->[9,10,11,12 6]
