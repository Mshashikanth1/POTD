
//User function Template for Java

class Solution
{
    
    ArrayList<Integer> search(String pattern, String text)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        char[] textArr= text.toCharArray(),patternArr=pattern.toCharArray();
        int n=textArr.length,m=patternArr.length; 
        
        for(int i=0;i<n;i++){
            int start=i,end=i;
            for(char ch : patternArr){
                if(end <n && ch==textArr[end] )  end++;
                else break;
            }
            if(end-start==m){
                ans.add(start+1);
            }
            
        }
        return ans;
    }
}

/*
Search Pattern (Rabin-Karp Algorithm)
MediumAccuracy: 34.53%Submissions: 39K+Points: 4
Internship Alert!
New month-> Fresh Chance to top the leaderboard and get SDE Internship! 

banner
Given two strings, one is a text string and other is a pattern string. The task is to print the indexes of all the occurences of pattern string in the text string. For printing, Starting Index of a string should be taken as 1. The strings will only contain lowercase English alphabets ('a' to 'z').

Example 1:

Input: 
text = "birthdayboy"
pattern = "birth"
Output: 
[1]
Explanation: 
The string "birth" occurs at index 1 in text.
Example 2:

Input:
text = "geeksforgeeks"
pattern = "geek"
Output: 
[1, 9]
Explanation: 
The string "geek" occurs twice in text, one starts are index 1 and the other at index 9.
Your Task:
You don't need to read input or print anything. Your task is to complete the function search() which takes the string text and the string pattern as input and returns an array denoting the start indices (1-based) of substring pattern in the string text. 

Expected Time Complexity: O(|text| + |pattern|).
Expected Auxiliary Space: O(1).

Constraints:
1<=|text|<=5*105
1<=|pattern|<=|text|

Company Tags

*/
