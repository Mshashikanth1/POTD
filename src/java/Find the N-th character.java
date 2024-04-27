

class Solution
{
    public char nthCharacter(String s, int r, int n)
    {
        //code here
        while(r-->0){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<=n && sb.length()<=n;i++){
            if(s.charAt(i)=='0') sb.append("01");
            else sb.append("10");
        }
         s=sb.toString();
        }
        return s.charAt(n);
    }
}

/*
Find the N-th character
MediumAccuracy: 19.13%Submissions: 36K+Points: 4
Internship Alert!
New month-> Fresh Chance to top the leaderboard and get SDE Internship! 

banner
Given a binary string s. Perform r iterations on string s, where in each iteration 0 becomes 01 and 1 becomes 10. Find the nth character (considering 0 based indexing) of the string after performing these r iterations (see examples for better understanding).

Example 1:

Input:
s = "1100"
r = 2
n = 3
Output:
1
Explanation: 
After 1st iteration s becomes "10100101".
After 2nd iteration s becomes "1001100101100110".
Now, we can clearly see that the character at 3rd index is 1, and so the output.
Example 2:

Input:
s = "1010"
r = 1
n = 2
Output:
0
Explanation : 
After 1st iteration s becomes "10011001".
Now, we can clearly see that the character at 2nd index is 0, and so the output.
Your task:
You don't need to read input or print anything. Your task is to complete the function nthCharacter() which takes the string s and integers r and n as input parameters and returns the n-th character of the string after performing r operations on s.
 
Expected Time Complexity: O(r*|s|)
Expected Auxilary Space: O(|s|)
 
Constraints:
1 ≤ |s| ≤ 103
1 ≤ r ≤ 20
0 ≤ n < |s|

*/
