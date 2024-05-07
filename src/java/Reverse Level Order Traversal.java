

/* 
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

Reverse Level Order Traversal
EasyAccuracy: 62.26%Submissions: 116K+Points: 2
 Done with winning Geekbits? Now win GfG Bag, GfG T-shirt & much more just by writing your experiences. Start Writing, Start Winning.
banner
Given a binary tree of size n, find its reverse level order traversal. ie- the traversal must begin from the last level.

Example 1:

Input :
        1
      /   \
     3     2

Output: 
3 2 1
Explanation:
Traversing level 1 : 3 2
Traversing level 0 : 1
Example 2:

Input :
       10
      /  \
     20   30
    / \ 
   40  60

Output: 
40 60 20 30 10
Explanation:
Traversing level 2 : 40 60
Traversing level 1 : 20 30
Traversing level 0 : 10
Your Task: 
You don't need to read input or print anything. Complete the function reverseLevelOrder() which takes the root of the tree as input parameter and returns a list containing the reverse level order traversal of the given tree.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)

Constraints:
1 ≤ n ≤ 104
*/

class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        // code here
        Map<Integer, List<Integer>> lhmap=new TreeMap<>();
        dfs(node, lhmap, 0);
        
        Stack<List<Integer>>stack  =new Stack<>();
        for(int i: lhmap.keySet()){
            stack.push(lhmap.get(i));
        }
        
        ArrayList<Integer> ans=new ArrayList<>();
        while(!stack.isEmpty()){
            for(int i: stack.pop()){
                ans.add(i);
            }
        }
        return ans;
        
    }
    
    void dfs(Node root, Map<Integer,List<Integer>> lhmap, int level){
        if(root==null) return ;
        List<Integer> lis=lhmap.getOrDefault(level, new ArrayList<>());
        lis.add(root.data);
        lhmap.put(level,lis);
        
        dfs(root.left,lhmap,level+1);
        dfs(root.right,lhmap,level+1);
    }
} 

