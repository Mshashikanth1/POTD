/*Complete the function below
Node is as follows:
class Node{
int data;
Node left, right;
Node(int item)
{
    data = item;
    left = right = null
}
}

Vertical sum
MediumAccuracy: 64.76%Submissions: 32K+Points: 4
 Done with winning Geekbits? Now win GfG Bag, GfG T-shirt & much more just by writing your experiences. Start Writing, Start Winning.
banner
Given a binary tree having n nodes, find the vertical sum of the nodes that are in the same vertical line. Return all sums through different vertical lines starting from the left-most vertical line to the right-most vertical line.

Example 1:

Input:
       1
    /    \
  2      3
 /  \    /  \
4   5  6   7
Output: 
4 2 12 3 7
Explanation:
The tree has 5 vertical lines
Line 1 has only one node 4 => vertical sum is 4.
Line 2 has only one node 2 => vertical sum is 2.
Line-3 has three nodes: 1,5,6 => vertical sum is 1+5+6 = 12.
Line-4 has only one node 3 => vertical sum is 3.
Line-5 has only one node 7 => vertical sum is 7.
Example 2:

Input:
          1
         /
        2
       /
      3
     /
    4
   /
  6
 /
7
Output: 
7 6 5 4 3 2 1
Explanation:
There are seven vertical lines each having one node.
Your Task:
You don't need to take input. Just complete the function verticalSum() that takes root node of the tree as parameter and returns an array containing the vertical sum of tree from left to right.

Expected Time Complexity: O(nlogn).
Expected Auxiliary Space: O(n).

Constraints:
1<=n<=104
1<= Node value <= 105


*/
class Solution{
    public ArrayList <Integer> verticalSum(Node root) {
        // add your code here
        Map<Integer, List<Integer>> hMap=new TreeMap<>();
        dfs(root, 0, hMap);
        
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i : hMap.keySet()){
            int sum=0;
            for(int n: hMap.get(i)){ sum+=n;}
            ans.add(sum);
        }
        return  ans;
    }
    
    public void dfs(Node root, int width, Map<Integer, List<Integer>> hMap ){
        if(root==null) return ;
        
        List<Integer> lis= hMap.getOrDefault(width, new ArrayList<>());
        lis.add(root.data);
        
        hMap.put(width,lis);
        
        dfs(root.left, width-1,hMap);
        dfs(root.right, width+1,hMap);
      
    }
}


