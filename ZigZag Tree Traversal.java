
//User function Template for Java

/*class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}*/

class GFG
{
    //Function to store the zig zag order traversal of tree in a list.
     Map<Integer,ArrayList<Integer>> hMap;
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    //Add your code here.
	    hMap=new HashMap<>();
	    dfs(root,0);
	    
	   // System.out.println(hMap);
	    ArrayList<Integer> ans=new ArrayList<>();
	    
	    for(int l=0;l<hMap.size();l++){
	        ArrayList<Integer> arr =hMap.get(l);
	       if(l%2==1){ for(int k: arr) ans.add(k); }
	       else {
	       for(int j=arr.size()-1;j>=0;j--) ans.add(arr.get(j)); 
	       }
	       
	    }
	    return ans;
	}
	void dfs(Node root, int level){
	    if(root==null) return;
	    
	    ArrayList<Integer> lis= hMap.containsKey(level) ? hMap.get(level)  : new ArrayList<>();
	    lis.add(root.data);
	    hMap.put(level,lis);
	    
	      if(root.right!=null) dfs(root.right,level+1);
	      if(root.left!=null) dfs(root.left,level+1);
	}
}

/**
 ZigZag Tree Traversal
MediumAccuracy: 54.05%Submissions: 139K+Points: 4
Maximize your earnings for your published articles in Dev Scripter 2024! Gain recognition & extra compensation while elevating your tech profile.

banner
Given a binary tree with n nodes. Find the zig-zag level order traversal of the binary tree.

Example 1:

Input:
        1
      /   \
     2    3
    / \    /   \
   4   5 6   7
Output:
1 3 2 4 5 6 7
Example 2:

Input:
           7
        /     \
       9      7
     /  \      /   
    8   8  6     
   /  \
  10  9 
Output:
7 7 9 8 8 6 9 10 
Your Task:
You don't need to read input or print anything. Your task is to complete the function zigZagTraversal() which takes the root node of the Binary Tree as its input and returns a list containing the node values as they appear in the zig-zag level-order traversal of the tree.

Expected Time Complexity: O(n).
Expected Auxiliary Space: O(n).

Constraints:
1 <= n <= 105


 
 * /
