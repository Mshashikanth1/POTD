
//User function Template for Java


//define a pair class 


class Solution {  
    
    //Time :O(n^2) space :O(1)
    static int countPairs1(int arr[], int n) 
    {
         // Your code goes here
         int c=0;
         for(int i=0;i<n;i++){
             for(int j=i+1; j<n ; j++){
                 if(i*arr[i] > j*arr[j]) c++;
             }
         }
         return c;
    }
    

    /*Time : O(n*(log(n)) Space : O(n*log(n))*/
    static int countPairs(int arr[], int n) 
    {
        //find the product of index and value store it in same array
        for(int i=0;i<n;i++)arr[i]*=i;
        
        return mergeSort(arr,0, n-1);
    }
    static int mergeSort(int[]arr, int l, int r){
        int count = 0;
        if(l<r){
            int mid = l+(r-l)/2;
            count += mergeSort(arr,l,mid);
            count += mergeSort(arr, mid+1,r);
            
            count += merge(arr,l,mid,r);
        }
        return count;
    }
    
    static int merge(int[]arr, int l, int mid, int r){
        int count = 0;
       
        int j = mid+1;
        
        /*  finding pair */
        for(int i=l; i<=mid; i++){
    
         while(j<=r && arr[i]>arr[j] ) j++;
          count+= (j-(mid+1));
          
        }
      
      
      /*calculate the size of left sub array & right sub array*/
        int n = mid-l+1;
        int m = r-mid;
        
        
    /*declare the left sub array and righ sub array*/
        int[]left = new int[n];
        int[]right = new int[m];
        
        
    /*copy the data from input array to left , right sub array*/
        for(int i=0;i<n;i++){
            left[i] = arr[l+i];
        }
        for(int i=0;i<m;i++){
            right[i] = arr[mid+i+1];
        }
        
        
    
        /*declare the iterator indx variables for input array, left, right sub array */
        int i=0;
        j = 0;
        int k = l;
        
        /*iterate untill out of  bounce */
        while(i<n && j<m){
            
            /*copyt the min element from right, left subarray to input array*/
            if(left[i]<=right[j]){
                arr[k++] = left[i++];
            }else{
                arr[k++] = right[j++];
            }
        }
        
        /*copyt the elements remaining from both the arrays*/
        while(i<n)arr[k++] = left[i++];
        while(j<m)arr[k++] = right[j++];
        
        return count;
    }

}

/*

Count Pairs in an Array
HardAccuracy: 48.25%Submissions: 24K+Points: 8
Given an array arr of n integers, count all pairs (arr[i], arr[j]) in it such that i*arr[i] > j*arr[j] and 0 ≤ i < j < n.

Note: 0-based Indexing is followed.

Example 1:

Input :
n = 4
arr[] = {8, 4, 2, 1}
Output :
2
Explanation:
If we see the array after operations
[0*8, 1*4, 2*2, 3*1] => [0, 4, 4, 3]
Pairs which hold the condition i*arr[i] > j*arr[j] are (4,1) and (2,1), so in total 2 pairs are available.
Example 2:

Input :
n = 7
arr[] = {5, 0, 10, 2, 4, 1, 6}
Output:
5
Explanation :
Pairs which hold the condition i*arr[i] > j*arr[j] are (10,2), (10,4), (10,1), (2,1) and (4,1), so in total 5 pairs are there.
Your Task:  
You don't need to read input or print anything. Your task is to complete the function countPairs() which takes the array arr[] and its size n as inputs and returns the required result.

Expected Time Complexity: O(n*log(n))
Expected Auxiliary Space: O(n*log(n))

Constraints:
1 ≤ n ≤ 104
0 ≤ arr[i] ≤ 104


*/
