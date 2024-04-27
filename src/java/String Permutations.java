

class Solution
{
    public String swap(String s , int a , int b){
        StringBuilder sb = new StringBuilder(s);
        //char temp = s.charAt(a);
        sb.setCharAt(b,s.charAt(a));
        sb.setCharAt(a,s.charAt(b));
        return sb.toString();
    }
    public void permute(String s , ArrayList<String> arr , int l , int r){
        if(l == r){
            arr.add(s);
            return;
        }
        for(int i=l;i<=r;i++){
            s = swap(s,l,i);
            permute(s,arr,l+1,r);
            s = swap(s,l,i);
        }
    }
    public ArrayList<String> permutation(String S)
    {
        //Your code here
        ArrayList<String> ans = new ArrayList<>();
        permute(S,ans,0,S.length()-1);
        Collections.sort(ans);
        return ans;
    }
	   
}
/*
String Permutations
EasyAccuracy: 48.33%Submissions: 42K+Points: 2

Given a string S. The task is to find all permutations (need not be different) of a given string.

Example 1:

Input:
S = AAA
Output: AAA AAA AAA AAA AAA AAA
Explanation: There are total 6 permutations, as given in the output.

Example 2:

Input:
S = ABSG
Output: ABGS ABSG AGBS AGSB ASBG ASGB
BAGS BASG BGAS BGSA BSAG BSGA GABS
GASB GBAS GBSA GSAB GSBA SABG SAGB
SBAG SBGA SGAB SGBA
Explanation: There are total 24 permutations, as given in the output.

Your Task:
This is a function problem. You only need to complete the function permutation that takes S as parameter and returns the list of permutations in lexicographically increasing order. The newline is automatically added by driver code.

Constraints:
1 ≤ size of string ≤ 5

Expected Time Complexity: O(N * N!), N = length of string.
Expected Auxiliary Space: O(1)

*/
