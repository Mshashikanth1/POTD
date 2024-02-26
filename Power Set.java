//User function Template for Java

/*
Power Set
MediumAccuracy: 43.3%Submissions: 82K+Points: 4
Internship Alert!
Become an SDE Intern by topping this monthly leaderboard! 

banner
Given a string s of length n, find all the possible subsequences of the string s in lexicographically-sorted order.

Example 1:

Input : 
s = "abc"
Output: 
a ab abc ac b bc c
Explanation : 
There are a total 7 number of subsequences possible 
for the given string, and they are mentioned above 
in lexicographically sorted order.
Example 2:

Input: 
s = "aa"
Output: 
a a aa
Explanation : 
There are a total 3 number of subsequences possible 
for the given string, and they are mentioned above 
in lexicographically sorted order.
Your Task:
You don't need to read input or print anything. Your task is to complete the function AllPossibleStrings() which takes a string s as the input parameter and returns a list of all possible subsequences (non-empty) that can be formed from s in lexicographically-sorted order.

Expected Time Complexity: O( n*2n  )
Expected Space Complexity: O( n * 2n )

Constraints: 
1 <= n <= 16
s will constitute of lower case english alphabets


*/
class Solution
{
    public List<String> AllPossibleStrings(String s)
    {
        // Code here
        List<String> list = new ArrayList<>();
        solve(s,"", list);
        Collections.sort(list);
        list.remove("");
        return list;
    }
    public void solve(String s , String ans,List<String> list){
        if(s.length()==0){
            list.add(ans);
            return;
        }
           char ch = s.charAt(0);
          String ros = s.substring(1);
          solve(ros,ans+"",list);
          solve(ros,ans+ch,list);
      return;
        
    }
}
