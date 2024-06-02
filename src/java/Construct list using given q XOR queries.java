
class Solution {
    
    /*Time : O(n^2) Space : O(n)*/
    public static ArrayList<Integer> constructList1(int q, int[][] queries) {
        // code here
        ArrayList<Integer> ans= new ArrayList<>();
        ans.add(0);
        
        for( int[] query : queries){
            if( query[0] ==0 )
                ans.add(query[1]);
            else {
                  for( int i=0; i<ans.size();i++)
                    ans.set(i, ans.get(i) ^ query[1]);
            }
              
        }
    
        Collections.sort(ans);
        return ans;
    }
    
    
    /*Time : O(nlog(n))  Space : O(n) */
    public static ArrayList<Integer> constructList(int q, int[][] queries) {
            ArrayList<Integer> ans = new ArrayList<>();
            int xor = 0;
            for( int i=queries.length-1; i>=0; i-- ){
                if( queries[i][0]==0 ) ans.add( queries[i][1] ^ xor);
                else  xor ^= queries[i][1];
            }
            ans.add(xor);
            
            Collections.sort(ans);
            return ans;
            
        }
}

/*
Construct list using given q XOR queries
MediumAccuracy: 50.86%Submissions: 19K+Points: 4
In need of more Geekbits? Win from a pool of 3500+ Geekbits via DSA-based Coding Contest every sunday!

banner
Given a list s that initially contains only a single value 0. There will be q queries of the following types:

0 x: Insert x in the list
1 x: For every element a in s, replace it with a ^ x. ('^' denotes the bitwise XOR operator)
Return the sorted list after performing the given q queries.

Example 1:

Input:
q = 5
queries[] = {{0, 6}, {0, 3}, {0, 2}, {1, 4}, {1, 5}}
Output:
1 2 3 7
Explanation:
[0] (initial value)
[0 6] (add 6 to list)
[0 6 3] (add 3 to list)
[0 6 3 2] (add 2 to list)
[4 2 7 6] (XOR each element by 4)
[1 7 2 3] (XOR each element by 5)
The sorted list after performing all the queries is [1 2 3 7]. 
Example 2:
Input:
q = 3
queries[] = {{0, 2}, {1, 3}, {0, 5}} 
Output :
1 3 5
Explanation:
[0] (initial value)
[0 2] (add 2 to list)
[3 1] (XOR each element by 3)
[3 1 5] (add 5 to list)
The sorted list after performing all the queries is [1 3 5].

Your Task:  
You don't need to read input or print anything. Your task is to complete the function constructList() which takes an integer q the number of queries and queries[] a list of lists of length 2 denoting the queries as input parameters and returns the final constructed list.


Expected Time Complexity: O(q*log(q))
Expected Auxiliary Space: O(l), where l is only used for output-specific requirements.


Constraints:
1 ≤ q ≤ 105

Seen this question in a real interview before ?
1/4
Yes
No
Company Tags
Topic Tags
ArraysBit MagicData Structures
Related Interview Experiences
Google Online Challenge 2020
*/
