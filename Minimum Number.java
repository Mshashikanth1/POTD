/*

Minimum Number
EasyAccuracy: 73.25%Submissions: 6K+Points: 2
Lamp
You can earn more Geekbits by participating in GFG Weekly Coding Contest  

You are given an array arr of n elements. In one operation you can pick two indices i and j, such that arr[i] >= arr[j] and replace the value of arr[i] with (arr[i] - arr[j]). You have to minimize the values of the array after performing any number of such operations.

Example 1:

Input:
n = 3
arr = {3,2,4}
Output:
1
Explanation:
1st Operation : We can pick 4 & 3, subtract 4-3 => {3,2,1}
2nd Opeartion : We can pick 3 & 2, subtarct 3-2 => {1,2,1}
3rd Operation : We can pick 1 & 2, subtract 2-1 => {1,1,1}
4th Opeartion : We can pick 1 & 1, subtract 1-1 => {1,0,1}
5th Operation : We can pick 1 & 1, subtract 1-1 => {0,0,1}
After this no operation can be performned, so maximum no is left in the array is 1, so the ans is 1.

Example 2:

Input:
n = 2
arr = {2,4}
Output:
2
Explanation:
1st Operation : We can pick 4 & 2, subtract 4-2 => {2,2}
2nd Operation : We can pick 2 & 2, subtract 2-2 => {0,2}
After this no operation can be performned, so maximum no is left in the array is 2, so the ans is 2.

Your Task:  
You don't need to read input or print anything. Your task is to complete the function minimumNumber() which takes an integer n and an array arr, as input parameters and returns the maximum number which is minimized after performing operations.

Expected Time Complexity: O(n)
Expected Space Complexity: O(1)

Constraints:
1 ≤ n ≤ 105
1 ≤ arr[i] ≤ 109

*/
class Solution {
    public static int gcd(int a, int b){
        if(a==0) return b;
        else if(b==0) return a;
        else if(a==b) return b;
        else if(a>b) return gcd(a%b,b);
        else return gcd(a, b%a);
    }
    public static int minimumNumber(int n, int[] arr) {
        // code here
        if(n==1) return arr[0];
        int gc=gcd(arr[0],arr[1]);
        for(int i=2;i<n;i++){
            gc=gcd(gc,arr[i]);
            
        }
        return gc;
    }
}
        
