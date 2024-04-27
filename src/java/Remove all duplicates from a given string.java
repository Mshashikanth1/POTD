
//User function Template for Java


class Solution {
    /*
    Time : O(n)
    Space :O(n)
    
    */
    String removeDuplicates1(String str) {
        Set<Character> hSet=new LinkedHashSet<>();
        for(char ch: str.toCharArray()) hSet.add(ch);
        StringBuilder sb=new StringBuilder();
        for(char ch :hSet) sb.append(ch);
        return sb.toString();
    }
    
    /*char frequencey array
    Time :O(n)
    Space :O(n)
    */
    String removeDuplicates(String str) {
    int[] frqArr=new int[255];
    StringBuilder sb=new StringBuilder();
    for(char ch : str.toCharArray()){
        if(frqArr[ch]==0){
            frqArr[ch]++;
            sb.append(ch);
        }
    
    }
    return sb.toString();
    }

}

/*

Remove all duplicates from a given string
EasyAccuracy: 58.68%Submissions: 75K+Points: 2
Internship Alert!
New month-> Fresh Chance to top the leaderboard and get SDE Internship! 

banner
Given a string str which may contains lowercase and uppercase characters. The task is to remove all duplicate characters from the string and find the resultant string. The order of remaining characters in the output should be same as in the original string.

Example 1:

Input:
str = "geEksforGEeks"
Output: 
"geEksforG"
Explanation: 
After removing duplicate characters such as E, e, k, s, we have string as "geEksforG".
Example 2:

Input:
str = "HaPpyNewYear"
Output: 
"HaPpyNewYr"
Explanation: 
After removing duplicate characters such as e, a, we have string as "HaPpyNewYr".
Your Task:
Complete the function removeDuplicates() which takes a string str, as input parameters and returns a string denoting the answer. You don't have to print answer or take inputs.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints:
1 ≤ N ≤ 105
String contains uppercase and lowercase english letters
*/
