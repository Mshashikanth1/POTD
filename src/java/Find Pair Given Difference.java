
class Solution {
    
    /*Time : O(n*2). Space : O(n)*/
    public int findPair(int n, int x, int[] arr) {
        // code here
    
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if( Math.abs(arr[i] - arr[j])==x ) {
                    return 1;
                }
            }
        }
        return -1;
    }
    
    
    
    /*Time :O(n). Space :O(n)*/
     public int findPair1(int n, int x, int[] arr) {
        Set<Integer> hset=new HashSet<>();
        for(int i: arr) hset.add(i);

        for(int i=0; i<n-1; i++){
         
                if(x==0 && arr.length==hset.size()) return -1;

                if(  hset.contains(arr[i]-x) || hset.contains(arr[i]+x)  ) {
                    return 1;
                }
        }
        return -1;
    }
    
    
}


/*
Find Pair Given Difference
EasyAccuracy: 27.25%Submissions: 214K+Points: 2
In need of more Geekbits? Win from a pool of 3500+ Geekbits via DSA-based Coding Contest every sunday!

banner
Given an array arr[] of size n and an integer x, return 1 if there exists a pair of elements in the array whose absolute difference is x, otherwise, return -1.

Example 1:

Input:
n = 6
x = 78
arr[] = {5, 20, 3, 2, 5, 80}
Output:
1
Explanation:
Pair (2, 80) have absolute difference of 78.
Example 2:

Input:
n = 5
x = 45
arr[] = {90, 70, 20, 80, 50}
Output:
-1
Explanation:
There is no pair with absolute difference of 45.
Your Task:
You need not take input or print anything. Your task is to complete the function findPair() which takes integers n, x, and an array arr[] as input parameters and returns 1 if the required pair exists, return -1 otherwise.

Expected Time Complexity: O(n* Log(n)).
Expected Auxiliary Space: O(1).

Constraints:
1<=n<=106 
1<=arr[i]<=106 
0<=x<=105
*/
