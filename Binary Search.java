// User function Template for Java
/*

Binary Search.java
BasicAccuracy: 44.32%Submissions: 353K+Points: 1
Explore Job Fair for students & freshers for daily new opportunities. Find A Job Today! 

Given a sorted array of size N and an integer K, find the position(0-based indexing) at which K is present in the array using binary search.

Example 1:

Input:
N = 5
arr[] = {1 2 3 4 5} 
K = 4
Output: 3
Explanation: 4 appears at index 3.


Example 2:

Input:
N = 5
arr[] = {11 22 33 44 55} 
K = 445
Output: -1
Explanation: 445 is not present.


Your Task:  
You dont need to read input or print anything. Complete the function binarysearch() which takes arr[], N and K as input parameters and returns the index of K in the array. If K is not present in the array, return -1.


Expected Time Complexity: O(LogN)
Expected Auxiliary Space: O(LogN) if solving recursively and O(1) otherwise.


Constraints:

    1 <= N <= 105
    1 <= arr[i] <= 106
    1 <= K <= 106


*/

class Solution {
    int binarysearch(int arr[], int n, int k) {
        // code here
        int left=0,right=n-1,mid;
        while(left<=right){
            mid=(right+left)/2;
            if(arr[mid]==k) return mid;
            else if(arr[mid]>k)  right=mid-1;
            else if(arr[mid]<k)  left=mid+1;
        }
        return -1;
    }
}

// 1 2 3 4 5
// 0 1 2 3 4

// left=0 , right =4 
//             T 
//             mid=4-(4+0)/2 = 2;
//             arr[mid]=3 < k=4    ==> left =mid
            
// left =2 , right =4 
//             T
//             mid=4-(4-2)/2 =3
//             arr[mid]=4 == k=4   return min
            
