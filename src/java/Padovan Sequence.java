
//User function Template for Java

class Solution
{
  Map<Integer,Integer> chache =new HashMap();
  int mod= 1000000007;
  public int padovanSequence1(int n)
    {
        //code here.

        if( n<=2) return 1;
        
        if( chache.containsKey(n)) return chache.get(n);
        
        int res= (padovanSequence(n-2) + padovanSequence(n-3) )% mod ;
        chache.put(n,res);
        return res;
    }
    
    
    public int padovanSequence(int n){

     int[] dp= new int[n+3];
        dp[0]++;
        dp[1]++;
        dp[2]++;

        for( int i=3; i< n+1; i++){
            dp[i]= (dp[i-2] + dp[i-3])% mod ;
        }
        return dp[n];
    
 }
}

/*
Padovan Sequence
EasyAccuracy: 34.96%Submissions: 24K+Points: 2
Solve today's problem-> Be the comment of the day-> Win a GfG T-Shirt!
Daily rewards up for grabs!

banner
Given a number n, find the nth number in the Padovan Sequence.

A Padovan Sequence is a sequence which is represented by the following recurrence relation
P(n) = P(n-2) + P(n-3)
P(0) = P(1) = P(2) = 1

Note: Since the output may be too large, compute the answer modulo 10^9+7.

Examples :

Input: n = 3
Output: 2
Explanation: We already know, P1 + P0 = P3 and P1 = 1 and P0 = 1
Input: n = 4
Output: 2
Explanation: We already know, P4  = P2 + P1 and P2 = 1 and P1 = 1
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1 <= n <= 106


*/
