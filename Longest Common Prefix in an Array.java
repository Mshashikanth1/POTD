//User function Template for Java
/*
Longest Common Prefix in an Array.java
EasyAccuracy: 29.52%Submissions: 176K+Points: 2
Explore Job Fair for students & freshers for daily new opportunities. Find A Job Today! 

Given a array of N strings, find the longest common prefix among all strings present in the array.


Example 1:

Input:
N = 4
arr[] = {geeksforgeeks, geeks, geek,
         geezer}
Output: gee
Explanation: "gee" is the longest common
prefix in all the given strings.

Example 2:

Input: 
N = 2
arr[] = {hello, world}
Output: -1
Explanation: There's no common prefix
in the given strings.


Your Task:
You don't need to read input or print anything. Your task is to complete the function longestCommonPrefix() which takes the string array arr[] and its size N as inputs and returns the longest common prefix common in all the strings in the array. If there's no prefix common in all the strings, return "-1".


Expected Time Complexity: O(N*max(|arri|)).
Expected Auxiliary Space: O(max(|arri|)) for result.


Constraints:
1 ≤ N ≤ 103
1 ≤ |arri| ≤ 103

*/

class Solution{
     char[] ans;
    String longestCommonPrefix(String arr[], int n){
        // code here
            if(n==1) return arr[0];

        Map<Integer,String> map=new HashMap<Integer,String>();
        String ans="",str1,str2;
       int i=0,j=n-1,minIdx=0;
       while(i<=j){
           str1=arr[i];
           str2=arr[j];
           ans="";
           
           minIdx=Math.min(str2.length(), str1.length());
           
           for(int k=0;k<minIdx;k++){
               if(str1.charAt(k)!=str2.charAt(k)){break;}
               ans+=str1.charAt(k);
           }
           map.put(ans.length(),ans);
         
           i++;
           j--;
       }
       

    //   System.out.println(map.toString());
    //   System.out.println(map.keySet());
    //   System.out.println(Collections.min(map.keySet()));
     if((map.get(Collections.min(map.keySet()))).length()==0) return "-1";

       return map.isEmpty()  ? 
         "-1": map.get(Collections.min(map.keySet())) ;
    }
}
