/*Complete the Function below*/
class GfG
{
	public static int palinArray(int[] a, int n)
           {
                  //add code here.
                 int ans=1;
                 for(int i: a){
                     if(!isPalindrome(i+"")){
                         return ans=0;
                     }
                 }
                 return ans;
           }
           
    public static boolean isPalindrome(String str){
        StringBuilder sb=new StringBuilder(str);
        return sb.reverse().toString().equals(str);
    }
}

/*
Palindromic Array
SchoolAccuracy: 58.62%Submissions: 126K+Points: 0
Win 2X Geekbits, Get on the Leaderboard & Top the Coding Charts! Register for GFG Weekly Coding Contest

banner
Given a Integer array A[] of n elements. Your task is to complete the function PalinArray. Which will return 1 if all the elements of the Array are palindrome otherwise it will return 0.

Example 1:

Input:
5
111 222 333 444 555

Output:
1

Explanation:
A[0] = 111 //which is a palindrome number.
A[1] = 222 //which is a palindrome number.
A[2] = 333 //which is a palindrome number.
A[3] = 444 //which is a palindrome number.
A[4] = 555 //which is a palindrome number.
As all numbers are palindrome so This will return 1.
Example 2:

Input:
3
121 131 20
 
Output:
0

Explanation:
20 is not a palindrome hence the output is 0.

Constraints:
1 <=T<= 50
1 <=n<= 20
1 <=A[]<= 10000


*/
