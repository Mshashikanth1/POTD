
class Solution{
    int mod = (int) 1e9+7;
    int dp[][] = null;
    int helper(String s,String t,int i,int j){
        if(j==t.length())
            return 1;
        
        if(i==s.length())
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        int incl = 0;
        if(s.charAt(i)==t.charAt(j))
            incl = helper(s,t,i+1,j+1);
        int excl = helper(s,t,i+1,j);
        
        return dp[i][j]=(incl+excl)%mod;
    }
    int  subsequenceCount(String s, String t){
	    dp = new int[s.length()][t.length()];
	    for(int d[]:dp)
	        Arrays.fill(d,-1);
	    return helper(s,t,0,0);
    }
}

/*
Distinct occurrences
MediumAccuracy: 27.37%Submissions: 54K+Points: 4
Internship Alert!
Become an SDE Intern by topping this monthly leaderboard! 

banner
Given two strings s and t of length n and m respectively. Find the count of distinct occurrences of t in s as a sub-sequence modulo 109 + 7.

Example 1:

Input:
s = "banana" , t = "ban"
Output: 
3
Explanation: 
There are 3 sub-sequences:[ban], [ba n], [b an].
Example 2:

Input:
s = "geeksforgeeks" , t = "ge"
Output: 
6
Explanation: 
There are 6 sub-sequences:[ge], [ge], [g e], [g e] [g e] and [g e].
Your Task:
You don't need to read input or print anything.Your task is to complete the function subsequenceCount() which takes two strings as argument s and t and returns the count of the sub-sequences modulo 109 + 7.

Expected Time Complexity: O(n*m).
Expected Auxiliary Space: O(n*m).

Constraints:
1 ≤ n,m ≤ 1000



*/
