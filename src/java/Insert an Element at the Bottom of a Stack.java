
//User function Template for Java

/*
approach : use another stack and push every thing in input stack and the new member to it and push back to input stack
Time : O(n) Space: O(n)
*/
class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        
        Stack<Integer> nst=new Stack<>();
        
        while(!st.isEmpty()) nst.push(st.pop());
        nst.push(x);
        
        while(!nst.isEmpty()) st.push(nst.pop());
        
        return st;
    }
}



/*

Insert an Element at the Bottom of a Stack
EasyAccuracy: 71.19%Submissions: 24K+Points: 2
You are given a stack st of n integers and an element x. You have to insert x at the bottom of the given stack. 

Note: Everywhere in this problem, the bottommost element of the stack is shown first while priniting the stack.

Example 1:

Input:
n = 5
x = 2
st = {4,3,2,1,8}
Output:
{2,4,3,2,1,8}
Explanation:
After insertion of 2, the final stack will be {2,4,3,2,1,8}.
Example 2:

Input:
n = 3
x = 4
st = {5,3,1}
Output:
{4,5,3,1}
Explanation:
After insertion of 4, the final stack will be {4,5,3,1}.
Your Task:

You don't need to read input or print anything. Your task is to complete the function insertAtBottom() which takes a stack st and an integer x as inputs and returns the modified stack after insertion.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)

Constraints:
1 <= n <= 105
0 <= x, elements of stack <= 109
*/
