
//User function Template for Java

class Solution {
    int isPalindrome(String S) {
        for(int i=0,j=S.length()-1;i<S.length()/2;i++,j--){
            if(S.charAt(i)!=S.charAt(j)) return 0;
        }
        return 1;
    }
}

/*
Palindrome String
EasyAccuracy: 51.21%Submissions: 266K+Points: 2
30% Off on all premium courses! Enrol today and utilize this offer before placement ends

Given a string S, check if it is palindrome or not.

Example 1:

Input: S = "abba"
Output: 1
Explanation: S is a palindrome

Example 2:

Input: S = "abc" 
Output: 0
Explanation: S is not a palindrome

Your Task:
You don't need to read input or print anything. Complete the function isPalindrome()which accepts string S and returns an integer value 1 or 0.

Expected Time Complexity: O(Length of S)
Expected Auxiliary Space: O(1)

Constraints:
1 <= Length of S<= 2*105

*/
