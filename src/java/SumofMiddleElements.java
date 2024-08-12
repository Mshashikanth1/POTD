class Solution {
    public int SumofMiddleElements(int[] arr1, int[] arr2) {
        // code here
        int n= arr1.length, m= arr2.length, i=0, j=0, k=0;
        int[] marr= new int[n+m];
        
        while( i< n && j<m){
            marr[k++]= arr1[i] >= arr2[j] ? arr2[j++] : arr1[i++];
        }
        
        while(i<n) marr[k++] = arr1[i++];
        
        while(j<m) marr[k++]= arr2[j++];
        
         i=0; j=marr.length-1; int m1=-1, m2=-1;
        
        while( i<j){
            m1= marr[i++];
            m2= marr[j--];
        }
        
        return m1+ m2;
    }
}


/*
Sum of Middle elements of two sorted arrays
Difficulty: MediumAccuracy: 47.98%Submissions: 67K+Points: 4
Given 2 sorted integer arrays arr1 and arr2. Find the sum of the middle elements of two sorted arrays arr1 and arr2.

Examples:

Input: arr1 = [1, 2, 4, 6, 10], arr2 = [4, 5, 6, 9, 12]
Output: 11
Explanation: The merged array looks like [1, 2, 4, 4, 5, 6, 6, 9, 10, 12]. Sum of middle elements is 11 (5 + 6).
Input: arr1 = [1, 12, 15, 26, 38], arr2 = [2, 13, 17, 30, 45]
Output: 32
Explanation: The merged array looks like [1, 2, 12, 13, 15, 17, 26, 30, 38, 45]. Sum of middle elements is 32 (15 + 17).
Expected Time Complexity: O(log n)
Expected Auxiliary Space: O(1)

Constraints:
1 <= arr1.size() == arr2.size() <= 103
1 <= arr1[i] <= 106
1 <= arr2[i] <= 106

*/
