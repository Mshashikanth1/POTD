class Solution {
    /**Time :O(n^2) space :O(1) Remarks : lazy algo time*/
    public int findDuplicate1(int[] nums) {
       for(int i=0;i<nums.length-1;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]==nums[j]) return nums[i]; 
        }
       }
       return -1;
    }
    /**Time :O(nlog(n)) space :O(1) Remarks : violating the rule don't change array'*/
    public int findDuplicate2(int[] nums) {
        //   Arrays.sort(nums);
        //  quickSort(nums,0,nums.length-1); 
        mergeSort(nums,0,nums.length-1);
          for(int i=0;i<nums.length;i++){
            if(nums[i]==nums[i+1]) return nums[i];
          }
          return -1;
    }


    /**Time :O(n) space :O(n) Remarks : voilating the rule don't use extra space'*/
    public int findDuplicate3(int[] nums) {
        Set<Integer> hset=new HashSet<>();
        for(int i: nums) if(!hset.add(i)) return i;
        return -1;
    }

    /**Time :O(n) space :O(1) Remarks : understand its a linked list problem , its all about floyed cycle detection */
    public int findDuplicate(int[] nums) {
           int s=nums[0], f=nums[0];

           do{
            s=nums[s];
            f=nums[nums[f]];
            }while(s!=f);

           f=nums[0];
           while(s!=f){
            s=nums[s];
            f=nums[f];
           }
        return s;
    }


    /**Divide and conquere sorting algos */
    /**Time :O(nlog(n)) space: O(1) Remarks: time is O(n^2) when pivot ele is max in nums [in place sort]*/
    public void quickSort(int[] nums, int l , int r){
        if(l<r){
            int pi=partition(nums,l,r);
            quickSort(nums,l,pi-1);
            quickSort(nums,pi+1,r);
        }
    }
    /**Partitioning is notting put choosing an pivot element and putting it in an index where all elements lesser
    than that are left and greater are right  */
    public int partition(int[] nums,int l, int r){
           int i=l-1,j=l;
           while(j<r){
                if(nums[j] < nums[r]) swap(nums,++i,j);
                j++;
           }
           swap(nums,++i,r);
           return i;
    }
    public void swap(int[] nums,int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }


    /**Time :O(nlog(n)) space :O(n) */
    public void mergeSort(int[] nums, int l ,int r){
        if(l<r){
            int mid=l+(r-l)/2;
            mergeSort(nums,l,mid);
            mergeSort(nums,mid+1,r);
            merge(nums,l,mid,r);
        }
    }
    /**we divide the array between l and mid & mid and r and choose the min elemnts from the both sub arrays and put them
    int original array */
    public void merge(int[] nums, int l , int mid, int r){
           int n=mid-l+1, m=r-mid ,i=0,j=0,k=0;
           int[] nArr=new int[n], mArr=new int[m];

            while(i<n) nArr[i]=nums[l + i++];
            while(j<m) mArr[j]=nums[mid+ 1+ j++];

            i=0; j=0;k=l;
            while(i<n && j<m) nums[k++]= nArr[i] <= mArr[j] ? nArr[i++] : mArr[j++];

            while(i<n)  nums[k++]= nArr[i++];
            while(j<m)  nums[k++]= mArr[j++];  
    }

    
}

/***

287. Find the Duplicate Number
Solved
Medium
Topics
Companies
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.

 

Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
Example 2:

Input: nums = [3,1,3,4,2]
Output: 3
Example 3:

Input: nums = [3,3,3,3,3]
Output: 3
 

Constraints:

1 <= n <= 105
nums.length == n + 1
1 <= nums[i] <= n
All the integers in nums appear only once except for precisely one integer which appears two or more times.
 

Follow up:

How can we prove that at least one duplicate number must exist in nums?
Can you solve the problem in linear runtime complexity?

 */
