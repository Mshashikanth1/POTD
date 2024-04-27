
//User function Template for Java

class Solution {
      
        final int MOD= (int) 1e9+7;
        
    int distinctSubsequences(String S) {

        
        int n=S.length();
        int[] dp =new int[n+1];
        int[] last_occurence =new int[256];
        Arrays.fill(last_occurence,-1);
        dp[0]=1;
        
        for(int i=1; i<=n; i++){
            dp[i]=(2*dp[i-1]) % MOD;
            
            if(last_occurence[S.charAt(i-1)] !=-1){
                dp[i] -=dp[last_occurence[S.charAt(i-1)]];
            }
            
            dp[i] %=MOD;
            last_occurence[S.charAt(i-1)] =i-1;
        }
      return (dp[n]+MOD) % MOD;
    }
}

/*
Number of distinct subsequences
HardAccuracy: 30.43%Submissions: 38K+Points: 8
Win 2X Geekbits, Get on the Leaderboard & Top the Coding Charts! Register for GFG Weekly Coding Contest

banner
Given a string consisting of lower case English alphabets, the task is to find the number of distinct subsequences of the string
Note: Answer can be very large, so, ouput will be answer modulo 109+7.

Example 1:

Input: 
s = "gfg"
Output: 
7
Explanation: 
The seven distinct subsequences are "", "g", "f", "gf", "fg", "gg" and "gfg" .
Example 2:

Input: 
s = "ggg"
Output: 
4
Explanation: 
The four distinct subsequences are "", "g", "gg", "ggg".
Your task:
You do not need to read any input or print anything. The task is to complete the function distinctSubsequences(), which takes a string as input and returns an integer.

Expected Time Complexity: O(|str|)
Expected Auxiliary Space: O(|str|)

Constraints:
1 ≤ |s| ≤ 105
s contains lower case English alphabets
*/
