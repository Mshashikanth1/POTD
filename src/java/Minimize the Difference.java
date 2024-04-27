
class Solution {
    
    /*Time : O(n^2) Space O(n)*/
    public static int minimizeDifference1(int n, int k, int[] arr) {
        
        // code here
        
        int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        for(int i:arr) {
            max=Math.max(max,i);
            min=Math.min(min,i);
        }
        int minDiff=max-min;
        
        
        int i=0,j=k-1;
        
        while(j<n){
           
            max=Integer.MIN_VALUE; min=Integer.MAX_VALUE;
            for( k=0;k<n;k++){
                if( k < i || k > j){
                    max=Math.max(max,arr[k]);
                    min=Math.min(min,arr[k]);
                }
            }
            minDiff=Math.min(max-min, minDiff);  
            
            i++;
            j++;
        }
        
        return minDiff;
    }
    
    /*Time : O(nlogn+klogn)  Space O(n)*/
     public static int minimizeDifference2(int n, int k, int[] arr) {

        Queue<Integer> minHeap=new PriorityQueue<>( (a,b)-> a-b);
        Queue<Integer> maxHeap=new PriorityQueue<>( (a,b)-> b-a);

        for(int i=0;i<n;i++){
            minHeap.add(arr[i]);
            maxHeap.add(arr[i]);
        }

        int minDiff= maxHeap.peek()-minHeap.peek();
        for(int i=0;i<k;i++){
            minHeap.remove(arr[i]);
            maxHeap.remove(arr[i]);
        }


        int i=0,j=k;
        while(j<n){
            maxHeap.remove(arr[j]);
            maxHeap.add(arr[i]);
            
            minHeap.remove(arr[j]);
            minHeap.add(arr[i]);

            minDiff= Math.min(maxHeap.peek()-minHeap.peek(),minDiff);

            i++;
            j++;
        }
        return minDiff;
    }
    
    
   /*Time : O(nlogn+klogn) Space O(n)*/
   public static int minimizeDifference3(int n, int k, int[] arr) {

        String dlm=",";
        Queue<String> minHeap=new PriorityQueue<>( (String a,String b)->  Integer.valueOf(a.split(dlm)[0]) -  Integer.valueOf(b.split(",")[0]));
        Queue<String> maxHeap=new PriorityQueue<>( (String a,String b)->  Integer.valueOf(b.split(dlm)[0]) -  Integer.valueOf(a.split(",")[0]));

        for(int i=0;i<n;i++){
            minHeap.add(arr[i]+dlm+i);
            maxHeap.add(arr[i]+dlm+i);
        }

        int minDiff= Integer.valueOf(maxHeap.peek().split(dlm)[0])-Integer.valueOf(minHeap.peek().split(dlm)[0]);
        for(int i=0;i<k;i++){
            minHeap.remove(arr[i]+dlm+i);
            maxHeap.remove(arr[i]+dlm+i);
        }

        // System.out.println(minHeap.peek().split(dlm)[0]+","+maxHeap.peek().split(dlm)[0]);

        int i=0,j=k;

        while(j<n){
            maxHeap.remove(arr[j]+dlm+j);
            maxHeap.add(arr[i]+dlm+i);

            minHeap.remove(arr[j]+dlm+j);
            minHeap.add(arr[i]+dlm+i);

            minDiff= Math.min(Integer.valueOf(maxHeap.peek().split(dlm)[0])-Integer.valueOf(minHeap.peek().split(dlm)[0]), minDiff);
            // System.out.println(minHeap.peek().split(dlm)[0]+","+maxHeap.peek().split(dlm)[0]);

            i++;
            j++;
        }
        return minDiff;
    }
    
    
    
   //Time :O(n) Space :o(n)
    public static int minimizeDifference(int n, int k, int[] arr) {
        int post_max[] = new int[n];
        int post_min[] = new int[n];

        post_max[n - 1] = post_min[n - 1] = arr[n - 1];

        for(int i = n - 2; i >= 0; i--) {
            post_max[i] = Math.max(arr[i], post_max[i + 1]);
            post_min[i] = Math.min(arr[i], post_min[i + 1]);
        }

        int mini = arr[0], maxi = arr[0],
        
        res = post_max[k] - post_min[k];

        for(int i = 1; i < n - k; i++) {
            res = Math.min(res, Math.max(maxi, post_max[i + k]) - Math.min(mini, post_min[i + k]));
            mini = Math.min(mini, arr[i]);
            maxi = Math.max(maxi, arr[i]);
        }

        res = Math.min(res, maxi - mini);

        return res;
    }
    



}

/*
Minimize the Difference
MediumAccuracy: 65.56%Submissions: 8K+Points: 4
You are given an array arr of size n. You have to remove a subarray of size k , such that the difference between the maximum and minimum values of the remaining array is minimized.
Find the minimum value obtained after performing the operation of the removal of the subarray and return it.

Example 1:

Input:
n = 5
k = 3
arr = {1, 2, 3, 4, 5}
Output: 
1
Explanation: 
We can remove first subarray of length 3(i.e. {1, 2, 3}) then remaining array will be {4,5} and the difference of maximum and minimum element will be 1 i.e 5 - 4 = 1
Example 2:

Input:
n = 6
k = 3
arr = {2, 3, 1, 4, 6, 7}
Output: 
2
Explanation:
If we remove the subarray {2,3,1} then remaining array will be {4,6,7} and the difference  = 7-4 = 3
If we remove the subarray {3,1,4} then remaining array will be {2,6,7} and the difference  = 7-2 = 5
If we remove the subarray {1,4,6} then remaining array will be {2,3,7} and the difference  = 7-2 = 5
If we remove the subarray {4,6,7} then remaining array will be {2,3,1} and the difference  = 3-1 = 2
So the answer will be min(3,5,5,2) = 2
Your Task: 
You have to complete the function minimizeDifference( ), which takes two integers n and k and an integer array arr of size n. You have to return the minimum difference of maximum and minimum elements of the remaining array after removing one k length subarray of it.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)

Constraints:
2 <= n <= 105
1 <= k <= n-1
0 <= arr[i] <= 109

*/
