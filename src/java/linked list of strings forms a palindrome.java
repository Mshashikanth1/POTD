// User function Template for Java
class Solution {
    public boolean compute(Node root) {
        StringBuilder sb = new StringBuilder();
        
        Node temp= root;
        
        while( temp!=null){
            sb.append( temp.data);
            temp=temp.next;
        }
        
        return sb.toString().equals( sb.reverse().toString());
    }
}

/*

linked list of strings forms a palindrome
Difficulty: EasyAccuracy: 58.6%Submissions: 25K+Points: 2
Given a linked list with string data, check whether the combined string formed is palindrome. If the combined string is palindrome then return true otherwise return false.

Example:

Input:

Output : true
Explanation: As string "abcddcba" is palindrome the function should return true.
Input:

Output : false
Explanation: As string "abcdba" is not palindrome the function should return false.
Expected Time Complexity:  O(n)
Expected Auxiliary Space: O(n)

Constraints:
1 <= Node.data.length<= 103
1<=list.length<=103
*/

