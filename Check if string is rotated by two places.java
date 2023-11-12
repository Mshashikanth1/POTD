
class Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String a, String b)
    {
        // Your code here
        int m=b.length(),n=a.length();
        
    return a.equals(b.substring(m-2,m)+b.substring(0,m-2)) ||
           b.equals(a.substring(n-2,n)+a.substring(0,n-2)) ;

    }
    
}

/*

Check if string is rotated by two places
EasyAccuracy: 32.7%Submissions: 183K+Points: 2
GfG Weekly + You = Perfect Sunday Evenings!
Register for free now

banner
Given two strings a and b. The task is to find if the string 'b' can be obtained by rotating (in any direction) string 'a' by exactly 2 places.

Example 1:

Input:
a = amazon
b = azonam
Output: 
1
Explanation: 
amazon can be rotated anti-clockwise by two places, which will make it as azonam.
Example 2:

Input:
a = geeksforgeeks
b = geeksgeeksfor
Output: 
0
Explanation: 
If we rotate geeksforgeeks by two place in any direction, we won't get geeksgeeksfor.
*/
