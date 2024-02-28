
//User function Template for Java

class Solution{
    int DivisibleByEight(String s){
        //code here
        int n=s.length();
        if (n<3) return Integer.valueOf(s) % 8 ==0 ? 1 : -1;
        String LastThreeCharsOfS=s.substring(n-3,n);
        if (LastThreeCharsOfS.equals("000")) return 1;
        return Integer.valueOf(LastThreeCharsOfS) % 8 ==0 ? 1 : -1;
        


    }
}

/*
Check if a number is divisible by 8
EasyAccuracy: 22.22%Submissions: 51K+Points: 2
Internship Alert!
New month-> Fresh Chance to top the leaderboard and get SDE Internship! 

banner
Given a string representation of a decimal number s, check whether it is divisible by 8.

Example 1:

Input:
s = "16"
Output:
1
Explanation:
The given number is divisible by 8,
so the driver code prints 1 as the output.
Example 2:

Input:
s = "54141111648421214584416464555"
Output:
-1
Explanation:
Given Number is not divisible by 8, 
so the driver code prints -1 as the output.
Your Task:
You don't need to read input or print anything.Your task is to complete the function DivisibleByEight() which takes a string s as the input and returns 1 if the number is divisible by 8, else it returns -1.

Expected Time Complexity: O(1).
Expected Auxillary Space: O(1).

Constraints:
1 <= |s| <= 106

*/
