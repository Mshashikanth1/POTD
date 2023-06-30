
//User function Template for Java
/*
Is Binary Number Multiple of 3
MediumAccuracy: 32.89%Submissions: 65K+Points: 4
Sharpen up your programming skills, participate in coding contests & explore high-paying jobs

Given a number in its binary form find if the given binary number is a multiple of 3. It is recommended to finish the task using one traversal of input binary number.

Example 1:

Input: S = "0011"
Output: 1
Explanation: "0011" is 3, which is divisible by 3.

Example 2:

Input: S = "100"
Output: 0
Explanation: "100"'s decimal equivalent is 4, which is not divisible by 3.

Your Task:  
You don't need to read input or print anything. Your task is to complete the function isDivisible() which takes the string s as inputs and returns 1 if the given number is divisible by 3 otherwise 0.

Expected Time Complexity: O(|S|)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ |S| ≤ 105
View Bookmarked Problems 
*/
class Solution {
    int isDivisible(String s) {
        // code here
        java.math.BigInteger big=new java.math.BigInteger(s, 2);
        java.math.BigInteger bigIntThree=java.math.BigInteger.valueOf(3);
        java.math.BigInteger bigIntZero =java.math.BigInteger.ZERO;
        if(big.remainder(bigIntThree).equals(bigIntZero)) return 1;
        else return 0;
    }
}
