class Solution
{
    long substrCount (String S, int K) {
        return atmost(S,K)-atmost(S,K-1);
    }
    
    long atmost(String s, int k){
        int arr[] = new int[26];
        
        int dist = 0, left = 0;
        long res = 0;
        
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i) - 'a']++;
            if(arr[s.charAt(i) - 'a'] == 1) dist++;
            
            while(dist > k){
                arr[s.charAt(left)-'a']--;
                if(arr[s.charAt(left)-'a'] == 0) dist--;
                left++;
            }
            res = res + (i-left+1);
        }
        return res;
    }
}

/*

Count number of substrings
MediumAccuracy: 20.46%Submissions: 62K+Points: 4
Continue solving this problem now on your mobile! Download the GfG App Today

banner
Given a string of lowercase alphabets, count all possible substrings (not necessarily distinct) that have exactly k distinct characters. 

Example 1:

Input:
S = "aba", K = 2
Output:
3
Explanation:
The substrings are: "ab", "ba" and "aba".
Example 2:

Input: 
S = "abaaca", K = 1
Output:
7
Explanation:
The substrings are: "a", "b", "a", "aa", "a", "c", "a". 
Your Task:
You don't need to read input or print anything. Your task is to complete the function substrCount() which takes the string S and an integer K as inputs and returns the number of substrings having exactly K distinct characters.

Expected Time Complexity: O(|S|).
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ |S| ≤ 106
1 ≤ K ≤ 26
*/
