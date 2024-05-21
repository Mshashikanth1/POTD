// User function Template for Java

class Solution {
 
    int[] printKClosest(int[] arr, int n, int k, int x) {
        // code here-
       
        int ans[] = new int[k];
         int j=arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x) {
                j=i;
                break;
            }
            if(arr[i]>x){
                j=i-1;
                break;
            }
        }

        int m=j+1;

        for(int i=0;i<k;i++){
            if(j>=0 && arr[j]==x) j--;
            if(m<n && arr[m]==x) m++;
            int left = Integer.MAX_VALUE;
            int right = Integer.MAX_VALUE;
            
            
            if(j>=0)
             left=Math.abs(arr[j]-x);
            if(m<arr.length)
             right = Math.abs(arr[m]-x);
            if(left<right ){
                ans[i]=arr[j--];
                
                
            }
            else if(m<arr.length)
            ans[i]=arr[m++];
            
        }
       
        return ans;
    }
    
    int binarySearch(int[] arr, int n, int x){
        int l=0, r=n-1;
        
        while(l<r){
            int mid= l +(r-l)/2;
            if( x > arr[mid]) l=mid+1;
            else if( x< arr[mid]) r=mid-1;
            else return mid;
        }
        
        return l;//get the closest number smaller than the elemtn
    }
}

/*

K closest elements
MediumAccuracy: 15.96%Submissions: 58K+Points: 4
In need of more Geekbits? Win from a pool of 3500+ Geekbits via DSA-based Coding Contest every sunday!

banner
Given a sorted array of unique elements in increasing order, arr[] of n integers, and a value x. Find the K closest elements to x in arr[].
Keep the following points in mind:

If x is present in the array, then it need not be considered.
If two elements have the same difference as x, the greater element is prioritized.
If sufficient elements are not present on the right side, take elements from the left and vice versa.
 
Example 1:

Input:
n = 13
arr[] = {12, 16, 22, 30, 35, 39, 42, 
         45, 48, 50, 53, 55, 56}
k = 4, x = 35
Output: 39 30 42 45
Explanation: 
First closest element to 35 is 39.
Second closest element to 35 is 30.
Third closest element to 35 is 42.
And fourth closest element to 35 is 45.

Example 2:

Input:
n = 5
arr[] = {1, 2, 3, 6, 10}
k = 3, x = 4
Output: 3 6 2
Explanation: 
First closest element is 3.
There are two elements 2 and 6 for which 
the difference with 4 is same i.e. 2.
So first take greatest number 6 
then the lower number 2.

Your Task:
You don't need to read input or print anything. Complete the function printKClosest() which takes arr[], n, k, and x as input parameters and returns an array of integers containing the K closest elements to x in arr[].


Expected Time Complexity: O(log n + k)
Expected Auxiliary Space: O(k)


Constraints:
1 ≤ n ≤ 105
1 ≤ k ≤ n
1 ≤ x ≤ 106
1 ≤ arr[i] ≤ 106
*/
