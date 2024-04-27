// User function Template for Java

class Solution {
    
    /*Time : O(n^2)  space :O(1)*/
    static long pairAndSum1(int n, long arr[]) {
        long ans=0;
        for(int i=0; i<n-1; i++) {
            for(int j=i+1; j<n; j++){
                ans+=(arr[j] & arr[i]);
            }
        }
        return ans;
    }
    
    static long pairAndSum(int n , long arr[]){
        long ans=0;
        
        //iterate over 32 bits
        for(int i=0; i<32; i++){
            int bitMask= (1 << i) , setBits=0;
            
            //count how set bits are present in this index over all the inut array
            for(long j:arr) if( ((int)j & bitMask) !=0 ) setBits++;
            
            
            //calcualte how much of amout contribute to ans
            ans += (long) setBits*(setBits-1)/2 * bitMask;
        }
        return ans;
    }
}

/*
Sum of Products
MediumAccuracy: 50.93%Submissions: 11K+Points: 4
Given an array arr[] of size n. Calculate the sum of Bitwise ANDs ie: calculate sum of arr[i] & arr[j] for all the pairs in the given array arr[] where i < j.

Example 1:

Input:
n = 3
arr = {5, 10, 15}
Output:
15
Explanation:
The bitwise Ands of all pairs where i<j are (5&10) = 0, (5&15) = 5 and (10&15) = 10.
Therefore, the total sum = (0+5+10) = 15.
Example 2:

Input:
n = 4
arr = {10, 20, 30, 40}
Output:
46
Explanation:
The sum of bitwise Ands 
of all pairs = (0+10+8+20+0+8) = 46.
Your Task:
You don't need to read input or print anything.Your Task is to complete the function pairAndSum() which takes an Integer n and an array arr[]  of size n as input parameters and returns the sum of bitwise Ands of all pairs.

Expected Time Complexity:O(n)
Expected Auxillary Space:O(1)

Constraints:
1 <= n <= 105
1 <= arr[i] <= 108


*/
