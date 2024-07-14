
// User function Template for Java

class Solution {
    
    /*T : O(nlog(n)) S: O(1)*/
    void _segregate0and1(int[] arr) {
        // code here
        Arrays.sort(arr);
    }
    
    /* T : O(n) S: O(1)*/
    void segregate0and1(int[] arr){
        int zeroCount=0;
        
        for( int i: arr){
            if( i==0) zeroCount++;
        }
        
        int i=0;
        while( i<zeroCount){
            arr[i++]=0;
        }
        while( i< arr.length){
              arr[i++]=1;
        }
        
    }
}

/*

Segregate 0s and 1s
Difficulty: EasyAccuracy: 54.25%Submissions: 94K+Points: 2
Given an array arr consisting of only 0's and 1's in random order. Modify the array in-place to segregate 0s onto the left side and 1s onto the right side of the array.

Examples :

Input: arr[] = [0, 0, 1, 1, 0]
Output: [0, 0, 0, 1, 1]
Explanation:  After segregation, all the 0's are on the left and 1's are on the right. Modified array will be [0, 0, 0, 1, 1].
Input: arr[] = [1, 1, 1, 1]
Output: [1, 1, 1, 1]
Explanation: There are no 0s in the given array, so the modified array is [1, 1, 1, 1]
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ arr.size() ≤ 106
0 ≤ arr[i] ≤ 1


*/
