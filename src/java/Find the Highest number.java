class Solution {
    
    /* Time :O(n) Space :O(1)*/
    public int findPeakElement(List<Integer> a) {
        // Code here
        int peakElement=Integer.MIN_VALUE;
        
        //linear serach
        for(int i: a) { peakElement=Math.max(i, peakElement); }
        return peakElement;
    }
    
}


/*
Find the Highest number
EasyAccuracy: 46.89%Submissions: 55K+Points: 2
In need of more Geekbits? Win from a pool of 3500+ Geekbits via DSA-based Coding Contest every sunday!

banner
Given an integer array a[] of size n, find the highest element of the array. The array will either be strictly increasing or strictly increasing and then strictly decreasing.

Note: a[i] != a[i+1] 

Example 1:

Input:
11
1 2 3 4 5 6 5 4 3 2 1
Output: 
6
Explanation: 
Highest element of array a[] is 6.
Example 2:

Input:
5
1 2 3 4 5
Output:
5
Explanation: 
Highest element of array a[] is 5.
Your Task:
You don't need to read or print anything. Your task is to complete the function findPeakElement() which takes integer n, and the array a[] as the input parameters and returns the highest element of the array.

Expected Time Complexity: O(log(n))
Expected Space Complexity: O(1)

Constraints:
2 <= n <= 106
1 <= a[i] <= 106



*/

