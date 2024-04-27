class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        // Arrays.sort(arr);
        // int i=0,j=1;
        // while(j<n && i<j){
        //     if(arr[i]==arr[j]) 
        //       { if(!ans.contains(arr[j]) )
        //              ans.add(arr[j]); 
        //       }
        //           i++;
        //           j++;
        // }
        // return ans.size() >0 ? ans : new ArrayList<>(Arrays.asList(-1));
        
         Map<Integer,Integer> freqCount=new HashMap<>();
           
          Arrays.stream(arr)
                .forEach(ele-> {
                
                int value = freqCount.containsKey(ele) ? freqCount.get(ele)+1 : 1;
                freqCount.put(ele, value );
                               
                        });
       
         freqCount.entrySet()
                  .stream()
                  .filter(entry -> entry.getValue()>=2)
                  .map(entry->entry.getKey())
                  .sorted()
                  .forEach(ans::add);
                  
        return ans.size() >0 ? ans : new ArrayList<>(Arrays.asList(-1));

    }
}


/*
Find duplicates in an array
EasyAccuracy: 18.95%Submissions: 545K+Points: 2
Learn Google Cloud with Curated Lab Assignments. Register, Earn Rewards, Get noticed by experts at Google & Land your Dream Job! 
Given an array a of size N which contains elements from 0 to N-1, you need to find all the elements occurring more than once in the given array. Return the answer in ascending order. If no such element is found, return list containing [-1]. 

Note: The extra space is only for the array to be returned. Try and perform all operations within the provided array. 

Example 1:

Input:
N = 4
a[] = {0,3,1,2}
Output: 
-1
Explanation: 
There is no repeating element in the array. Therefore output is -1.
Example 2:

Input:
N = 5
a[] = {2,3,1,2,3}
Output: 
2 3 
Explanation: 
2 and 3 occur more than once in the given array.
Your Task:
Complete the function duplicates() which takes array a[] and n as input as parameters and returns a list of elements that occur more than once in the given array in a sorted manner. 

Expected Time Complexity: O(n).
Expected Auxiliary Space: O(n).

Constraints:
1 <= N <= 105
0 <= A[i] <= N-1, for each valid i


*/
