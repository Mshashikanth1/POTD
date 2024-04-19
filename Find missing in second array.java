

class Solution
{
    
    //Time :O(n +m) Space :O(m)
    ArrayList<Integer> findMissing(int a[], int b[], int n, int m)
    {
        Set<Integer> hSet=new HashSet<>();
        for(int i: b) hSet.add(i);
        
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i: a) if(!hSet.contains(i)) ans.add(i);
        
        return ans;
    }
}

/*
Find missing in second array
MediumAccuracy: 35.22%Submissions: 67K+Points: 4
Fast-Track your resumes to top tech companies and get the job you deserve! Register for Job-A-Thon Hiring Challenge  

banner
Given two arrays a of size n and b of size m, the task is to find numbers which are present in the first array, but not present in the second array.

Example 1:

Input: 
n = 6, m = 5
a[] = {1, 2, 3, 4, 5, 10}
b[] = {2, 3, 1, 0, 5}
Output: 
4 10
Explanation: 
4 and 10 are present in first array, but not in second array.
Example 2:

Input: 
n = 5, m = 5
a[] = {4, 3, 5, 9, 11}
b[] = {4, 9, 3, 11, 10}
Output: 
5  
Explanation: 
Second array does not contain element 5.
Your Task:
This is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function findMissing() that takes array a, array b, integer n, and integer m as parameters and returns an array that contains the missing elements and the order of the elements should be the same as they are in array a.

Expected Time Complexity: O(n+m).
Expected Auxiliary Space: O(m).

Constraints:
1 ≤ n, m ≤ 105
-109 ≤ A[i], B[i] ≤ 109


*/
