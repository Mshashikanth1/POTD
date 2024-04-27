//User function Template for Java

/*Subtree In N-ary Tree.java
MediumAccuracy: 85.54%Submissions: 5K+Points: 4
Explore Job Fair for students & freshers for daily new opportunities. Find A Job Today! 

Given the root of a n-ary tree find the number of duplicate subtrees in the n-ary tree. Two trees are duplicates if they have the same structure with the same node values.

Example 1:

Input:
1 N 2 2 3 N 4 N 4 4 3 N N N N N

Output: 
2
Explanation: 
[4], [3] are duplicate subtree.

Example 2:

Input:
1 N 2 3 N 4 5 6 N N N N

Output: 
0
Explanation: 
No duplicate subtree found.

Your Task:
You don't need to read input or print anything. Your task is to complete the function duplicateSubtreeNaryTree() which takes the root of the n-ary tree as input and returns an integer value as a number of duplicate subtrees.

Expected Time Complexity: O(n), n is the total no of nodes
Expected Space Complexity: O(n2)


Algortithm :
1. Traverse all the sub trees.
2. store each subtree in the map
3. iterate over the map values and check if(value >1 ) in that case our anser will increase by1 

but how to store the values in the map ??
 we can do one thing to implemnet this , we can represent each subtree as a string and then store that string , integer as 
 [key,value pari type in map
 
 the idea is pretty simple.
 
 1. traverse the whole N-array tree using recursion.
 2. while traversing, make a string for representing current root subtree]
 
 pseudo code:
 string solve(root)
       if(root is Nonde)
       return ""
       string returnvalue=String(root.data)
       
       //iterate over all childerens
       for(Node child : root.childresns)
       returnValue +="#"+solve (root)
       
       store in map
       
       return returnValue
*/


class Solution{
    HashMap<String , Integer> hashMap;
    public int duplicateSubtreeNaryTree(Node root){
       // Code here
       this.hashMap=new HashMap<>();
       
       int dub=0;
       traverseNaryTree(root);
       
       for(Map.Entry<String,Integer> entry : hashMap.entrySet()){
           if(entry.getValue()>1){
               dub+=1;
           }
       }
       
       
       return dub;
    }
    
    private String traverseNaryTree(Node root){
        String s=""+root.data+"+";
        
        for (int i=0; i< root.children.size() ;i++){
            Node nd=root.children.get(i);
            
            s+=i+"-"+traverseNaryTree(nd)+"-";
        }
        
        hashMap.merge(s,1,Integer::sum);
        return "("+s+")";
    }
    
}
