//User function Template for Java


class Solution
{
    
    //Time : O(q*n) Space :O(n)
    public static int[] countElements1(int a[], int b[], int n, int query[], int q){
        int[] answ=new int[q];
        for(int x=0;x<q; x++){
            for(int i:b) if(i<=a[query[x]])  answ[x]++;
        }
        return answ;
    }


    //Time : O(q*n) Space :O(1)
    public static int[] countElements(int a[], int b[], int n, int query[], int q)
    {
        int c=0;
        for(int x=0;x<q; x++){
            c=0;
            for(int i:b) if(i<=a[query[x]]) c++;
            query[x]=c;
        }
        return query;
    }
    
    
    //Time : nlog(n) Space: O(1)
    public static int[] countElements2(int a[], int b[], int n, int query[], int q){
        Arrays.sort(b);
        int c=0;
        for(int x=0;x<q; x++){
           
            query[x]=binarySearch(b,0,b.length-1,a[query[x]]) +1;

        }
        return query;
    }
    
    
    public static int binarySearch(int[] nums, int l, int r, int tar){
        
        int lfat=-1;
        while(l<r){
            int mid=l+(r-l) >> 1;
            if(nums[mid] == tar)  {
            if (mid == nums.length - 1 || nums[mid + 1] != tar) {
                return mid;
            } else {
                lfat=mid;
                l = mid + 1; 
            }
            }
            else if(nums[mid] > tar) l=mid+1;
            else r=mid-1;
        }
        return lfat==-1 ?  ( r==0 ? nums.length-1 : 0 ): lfat;
    }

}

/*

Count the elements
EasyAccuracy: 25.32%Submissions: 36K+Points: 2
Given two arrays a and b both of size n. Given q queries in an arrray query each having a positive integer x denoting an index of the array a. For each query, your task is to find all the elements less than or equal to a[x] in the array b.

Example 1:

Input:
n = 3
a[] = {4,1,2}
b[] = {1,7,3}
q = 2
query[] = {0,1}
Output : 
2
1
Explanation: 
For 1st query, the given index is 0, a[0] = 4. There are 2 elements(1 and 3) which are less than or equal to 4.
For 2nd query, the given index is 1, a[1] = 1. There exists only 1 element(1) which is less than or equal to 1.
Example 2:

Input:
n = 4
a[] = {1,1,5,5}
b[] = {0,1,2,3}
q = 4
query[] = {0,1,2,3}
Output : 
2
2
4
4
Explanation: 
For 1st query and 2nd query, the given index is 0 and 1 respectively, a[0] = a[1] = 1. There are 2 elements(0 and 1) which are less than or equal to 1. 
For 3rd query and 4th query, the given index is 2 and 3 respectively, a[2] = a[3] = 5. All the 4 elements are less than or equal to 5.   
Your Task:
You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function countElements() that takes array a and b of size n, and array query of size q as parameters and returns an array that contains the answer to the corresponding queries. 

Expected Time Complexity: O(n+q+maximum of a and b).

Expected Auxiliary Space: O(maximum of a and b).

Constraints:
1 ≤ q ≤ n ≤ 105
1 ≤ a[i], b[i] ≤ 105
0 ≤ query[i] < n


*/
