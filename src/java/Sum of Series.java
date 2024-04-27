// User function Template for Java

class Solution {
    // function to return sum of  1, 2, ... n
    long seriesSum(int n) {
        // code here
        return (long) n*(n+1)/2;
    }
}

/*

Sum of Series
SchoolAccuracy: 23.81%Submissions: 237K+Points: 0
Win 2X Geekbits, Get on the Leaderboard & Top the Coding Charts! Register for GFG Weekly Coding Contest

banner
Write a program to find the sum of the given series 1+2+3+ . . . . . .(N terms) 

Example 1:

Input:
N = 1
Output: 1
Explanation: For n = 1, sum will be 1.
Example 2:

Input:
N = 5
Output: 15
Explanation: For n = 5, sum will be 15.
1 + 2 + 3 + 4 + 5 = 15.
Your Task:
Complete the function seriesSum() which takes single integer n, as input parameters and returns an integer denoting the answer. You don't need to print the answer or take inputs.

Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)

Constraints:
1 <= N <= 105

 
*/
