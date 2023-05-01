
/*
Leaders in an array.java
EasyAccuracy: 29.94%Submissions: 463K+Points: 2
Explore Job Fair for students & freshers for daily new opportunities. Find A Job Today! 

Given an array A of positive integers. Your task is to find the leaders in the array. An element of array is leader if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader. 

 

Example 1:

Input:
n = 6
A[] = {16,17,4,3,5,2}
Output: 17 5 2
Explanation: The first leader is 17 
as it is greater than all the elements
to its right.  Similarly, the next 
leader is 5. The right most element 
is always a leader so it is also 
included.

 

Example 2:

Input:
n = 5
A[] = {1,2,3,4,0}
Output: 4 0

 

Your Task:
You don't need to read input or print anything. The task is to complete the function leader() which takes array A and n as input parameters and returns an array of leaders in order of their appearance.

 

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)

 

Constraints:
1 <= n <= 107
0 <= Ai <= 107

*/


class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> ans=new ArrayList<Integer>();
        int max=0;
        try{
        while(n>0){
            n--;
            //System.out.println(ans.toString()+","+n+","+max+","+arr[n]);
            if(arr[n]>=max){
                ans.add(arr[n]);
            }
            max=Math.max(arr[n],max);
        }
        } catch(Exception e){System.out.println(e);}
         Collections.reverse(ans);
         return ans;
        
    }
}



/*
 an element is leader if  elem >=max(rightElements) 

         <--left,right ---> 
    16 , 17, 4, 3 , 5 , 2
                         \
                          (Leader)
                 .   (n-2)        (n-1)

*/
