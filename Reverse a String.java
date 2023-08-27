//User function Template for Java
/*
Reverse a String
BasicAccuracy: 69.49%Submissions: 271K+Points: 1
30% Off on all premium courses! Enrol today and utilize this offer before placement ends

You are given a string s. You need to reverse the string.

Example 1:

Input:
s = Geeks
Output: skeeG

Example 2:

Input:
s = for
Output: rof

Your Task:

You only need to complete the function reverseWord() that takes s as parameter and returns the reversed string.

Expected Time Complexity: O(|S|).
Expected Auxiliary Space: O(1).

Constraints:
1 <= |s| <= 10000
*/


class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        StringBuilder sb=new StringBuilder();
        for(int i=str.length()-1; i>=0; i--)
            sb.append(str.charAt(i));
        
        return sb.toString();
    }
}
