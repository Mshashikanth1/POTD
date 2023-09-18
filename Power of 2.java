//User function Template for Java


/*Power of 2
BasicAccuracy: 32.58%Submissions: 309K+Points: 1
Learn Google Cloud with Curated Lab Assignments. Register, Earn Rewards, Get noticed by experts at Google & Land your Dream Job! 
Given a non-negative integer N. The task is to check if N is a power of 2. More formally, check if N can be expressed as 2x for some integer x.

Example 1:

Input: 
N = 8
Output: 
YES
Explanation:
8 is equal to 2 raised to 3 (23 = 8).
Example 2:

Input: 
N = 98
Output: 
NO
Explanation: 
98 cannot be obtained by any power of 2.
Your Task:Your task is to complete the function isPowerofTwo() which takes n as a parameter and returns true or false by checking if the given number can be represented as a power of two or not.

Expected Time Complexity:O(log N).
Expected Auxiliary Space:O(1).

Constraints:
0 ≤ N ≤1018

*/

class Solution{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){
        
        // Your code here
        
        //the key anwer hear is  the power of 2 is always like this in binary string 
        // 1**, 1****, 1******, 1******* etcc where * is the zero 
        //and the one lessthen this number is 01111 , 0111111 etc....if we do binary and 
        //the the reuult will be come zero thus we can decide weather it is a power of two or no
        return ((n) & (n-1))==0 && n!=0;
        
    }
    
}
