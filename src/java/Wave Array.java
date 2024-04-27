class Solution {
    public static void convertToWave(int n, int[] a) {
        // code here
        for(int i=1;i<n;i+=2){
            int temp=a[i]; 
            a[i]=a[i-1];
            a[i-1]=temp;
        }
    }
}

/*
Wave Array
EasyAccuracy: 63.69%Submissions: 208K+Points: 2
Learn Google Cloud with Curated Lab Assignments. Register, Earn Rewards, Get noticed by experts at Google & Land your Dream Job!

banner
Given a sorted array arr[] of distinct integers. Sort the array into a wave-like array(In Place).
In other words, arrange the elements into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5].....

If there are multiple solutions, find the lexicographically smallest one.

Note:The given array is sorted in ascending order, and you don't need to return anything to make changes in the original array itself.

Example 1:

Input:
n = 5
arr[] = {1,2,3,4,5}
Output: 2 1 4 3 5
Explanation: Array elements after 
sorting it in wave form are 
2 1 4 3 5.
Example 2:

Input:
n = 6
arr[] = {2,4,7,8,9,10}
Output: 4 2 8 7 10 9
Explanation: Array elements after 
sorting it in wave form are 
4 2 8 7 10 9.
Your Task:
The task is to complete the function convertToWave(), which converts the given array to a wave array.

Expected Time Complexity: O(n).
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ n ≤ 106
0 ≤ arr[i] ≤107
*/   
