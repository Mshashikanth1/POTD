

class Solution {
    
     boolean checkTriplet(int[] arr, int n) {
        // code here
        
        for(int i: arr){
            for(int j: arr){
                for(int k : arr) {
                if(i*i+j*j-k*k==0) return true;
                }
            }
        }
        return false;
    }
    //time: O(n^3) space: O(1)
    
    boolean checkTriplet2(int[] arr, int n) {
        // code here
        
        Set<Integer> hashSet =new HashSet<>();
        for(int k : arr) hashSet.add(k*k);
        for(int i: arr){
            for(int j: arr){
                if(hashSet.contains(i*i+j*j)) return true;
            }
        }
        return false;
    }
    //time: O(n^2) space: O(n)

}


/*
Pythagorean Triplet
MediumAccuracy: 24.77%Submissions: 168K+Points: 4
Hiring Challenge for Working Professionals on 10th November.
Apply to 6 Companies through 1 Contest!  

banner
Given an array arr of n integers, write a function that returns true if there is a triplet (a, b, c) from the array (where a, b, and c are on different indexes) that satisfies a2 + b2 = c2, otherwise return false.

Example 1:

Input:
N = 5
Arr[] = {3, 2, 4, 6, 5}
Output: Yes
Explanation: a=3, b=4, and c=5 forms a
pythagorean triplet.
Example 2:

Input:
N = 3
Arr[] = {3, 8, 5}
Output: No
Explanation: No such triplet possible.
Your Task:
You don't have to take any input or print any thing. You have to complete the function checkTriplet() which takes an array arr, a single integer n, as input parameters and returns boolean denoting answer to the problem.
Note: The driver will print "Yes" or "No" instead of corresponding to the boolean value returned.

Expected Time Complexity: O(n+max(Arr[i])2)
Expected Auxiliary Space: O(max(Arr[i]))

Constraints:
1 <= n <= 105
1 <= arr[i] <= 1000

*/
