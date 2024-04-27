/*
Sort an array of 0s, 1s and 2s.java
EasyAccuracy: 50.58%Submissions: 518K+Points: 2
Explore Job Fair for students & freshers for daily new opportunities. Find A Job Today! 

Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.


Example 1:

Input: 
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Explanation:
0s 1s and 2s are segregated 
into ascending order.

Example 2:

Input: 
N = 3
arr[] = {0 1 0}
Output:
0 0 1
Explanation:
0s 1s and 2s are segregated 
into ascending order.


Your Task:
You don't need to read input or print anything. Your task is to complete the function sort012() that takes an array arr and N as input parameters and sorts the array in-place.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


Constraints:
1 <= N <= 10^6
0 <= A[i] <= 2

*/
class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
       // solution 1 Arrays.sort(a); logn 
      
      //solution 2  O(n) solution
       int noOfZeros=0,noOfOnes=0,noOfTwos=0;
        for(int i=0;i<n;i++){
            if(a[i]==0)
            noOfZeros++;
            else if(a[i]==1)
            noOfOnes++;
            else if(a[i]==2)
            noOfTwos++;
        }
        int j=0;
        //System.out.println(noOfZeros+","+noOfOnes+","+noOfTwos);
        
        while(noOfZeros>0){
            a[j]=0;
            j++;
            noOfZeros--;
        }
        while(noOfOnes>0){
            a[j]=1;
            j++;
            noOfOnes--;
        }
        while(noOfTwos>0){
            a[j]=2;
            j++;
            noOfTwos--;
        }
        
        //solution 3 : bubble sort n^2 solution
        
        //soluton 4: insertion sort n^2 solution
        
        //solution 5 : selection sort n^2 solution
        
        // solution 6 : quick sort logn solution
   
       
    }
    }
