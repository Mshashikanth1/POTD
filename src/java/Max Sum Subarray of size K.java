
class Solution{
    
    // brute force : take the sum of all sub arrays; Time: O(n^2) Space: O(1) 
    static long maximumSumSubarray1(int K, ArrayList<Integer> Arr,int N){
        long maxSubArraySum=0L;
        for(int i=0; i<N-K+1; i++){
            long sum=0L;
            for(int j=i ; j<i+K; j++){
               sum+=Arr.get(j);
            }
            maxSubArraySum=Math.max(maxSubArraySum,sum);
        }
        return maxSubArraySum;
    } 
    
    // sliding window : take the sum  of input arr and get all other buy moving the window 
    // subtract from left and add from right; Time : O(n) Space: O(1)
    
   static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        
        long currSubArrSum=Arr.stream()
                     .limit(K)
                     .mapToLong(Integer::valueOf)
                     .sum();
                     
        long maxSubArrSum=currSubArrSum;
        
        for(int i=K;i<N;i++){
            currSubArrSum+=Arr.get(i)-Arr.get(i-K);
            maxSubArrSum=Math.max(maxSubArrSum,currSubArrSum);
        }
        
        return maxSubArrSum;
       
    } 
}

/*
Max Sum Subarray of size K
EasyAccuracy: 49.6%Submissions: 119K+Points: 2
Given an array of integers Arr of size N and a number K. Return the maximum sum of a subarray of size K.

NOTE*: A subarray is a contiguous part of any given array.

Example 1:

Input:
N = 4, K = 2
Arr = [100, 200, 300, 400]
Output:
700
Explanation:
Arr3  + Arr4 =700,
which is maximum.
Example 2:

Input:
N = 4, K = 4
Arr = [100, 200, 300, 400]
Output:
1000
Explanation:
Arr1 + Arr2 + Arr3 + Arr4 =1000,
which is maximum.
*/
