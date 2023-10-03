
//User function Template for Java
class Solution
{
    String colName (long n)
    {
        // your code here
        StringBuilder s=new StringBuilder();
        
        while(n-- > 0){
            s.append((char) (n%26+'A'));
            n/=26;
        }
        
        return s.reverse()
                .toString();
    }
}

/*
Column name from a given column number
MediumAccuracy: 32.41%Submissions: 49K+Points: 4
Win 2X Geekbits, Get on the Leaderboard & Top the Coding Charts! Register for GFG Weekly Coding Contest

banner
Given a positive integer, return its corresponding column title as appear in an Excel sheet.
Excel columns has a pattern like A, B, C, … ,Z, AA, AB, AC,…. ,AZ, BA, BB, … ZZ, AAA, AAB ….. etc. In other words, column 1 is named as “A”, column 2 as “B”, column 27 as “AA” and so on.

Example 1:

Input:
N = 28
Output: AB
Explanation: 1 to 26 are A to Z.
Then, 27 is AA and 28 = AB.

Example 2:

Input: 
N = 13
Output: M
Explanation: M is the 13th character of
alphabet.
Your Task:
You don't need to read input or print anything. Your task is to complete the function colName() which takes the column number N as input and returns the column name represented as a string.
Expected Time Complexity: O(LogN).
Expected Auxiliary Space: O(1).

Constraints:
1 <= N <= 1018

 
*/
