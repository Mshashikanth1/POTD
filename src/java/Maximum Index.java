
class Solution {
    
    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int a[], int n) {
        int[] maxRight = new int[n];
        maxRight[n - 1] = a[n - 1];
        
        // Precompute the maximum element to the right for each element
        for (int i = n - 2; i >= 0; i--) {
            maxRight[i] = Math.max(maxRight[i + 1], a[i]);
        }
        
        int maxDiff = 0;
        int i = 0, j = 0;
        
        // Traverse the array and find the maximum index difference
        while (i < n && j < n) {
            if (a[i] <= maxRight[j]) {
                maxDiff = Math.max(maxDiff, j - i);
                j++;
            } else {
                i++;
            }
        }
        
        return maxDiff;
    }
}

/*
Maximum Index
MediumAccuracy: 24.5%Submissions: 190K+Points: 4
Internship Alert!
New month-> Fresh Chance to top the leaderboard and get SDE Internship! 

banner
Given an array a of n positive integers. The task is to find the maximum of j - i subjected to the constraint of a[i] < a[j] and i < j.

Example 1:

Input:
n = 2
a[] = {1, 10}
Output:
1
Explanation:
a[0] < a[1] so (j-i) is 1-0 = 1.
Example 2:

Input:
n = 9
a[] = {34, 8, 10, 3, 2, 80, 30, 33, 1}
Output:
6
Explanation:
In the given array a[1] < a[7] satisfying the required condition(a[i] < a[j]) thus giving the maximum difference of j - i which is 6(7-1).
Your Task:
The task is to complete the function maxIndexDiff() which finds and returns maximum index difference. Printing the output will be handled by driver code. 

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints:
1 ≤ n ≤ 106
0 ≤ a[i] ≤ 109



*/
