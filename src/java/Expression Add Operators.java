

/*
Expression Add Operators
HardAccuracy: 73.12%Submissions: 7K+Points: 8
Finding A Job Is Now Easier Than Today's Problem! Explore Job Fair 2023

Given a string S that contains only digits (0-9) and an integer target, return all possible strings to insert the binary operator ' + ', ' - ', or ' * ' between the digits of S so that the resultant expression evaluates to the target value.

Note:

    Operands in the returned expressions should not contain leading zeros. For example, 2 + 03 is not allowed whereas 20 + 3 is fine. It is allowed to not insert any of the operators.

    If no solution is found, return an empty string array.

Example 1:
Input:
S = "123"
target = 6
Output: { "1*2*3", "1+2+3"}
Explanation: Both "1*2*3" and "1+2+3" evaluate to 6.


Example 2:
Input:
S = "3456237490"
target = 9191
Output: { } 
Explanation: There are no expressions that can be created from "3456237490"  to evaluate to 9191.


Example 3:
Input:
S = "12"
target = 12
Output: { "12"} 
Explanation: S itself matches the target. No other strings are possible.

Your Task:
You don't need to read input or print anything. Your task is to complete the function addOperators() which takes string S and integer target as parameters and returns a list of strings that contains all valid possibilities.

Expected Time Complexity: O(|S|*4|S|)
Expected Auxiliary Space: O(|s|*3|S|)

Constraints:
1 ≤ |S| ≤ 10
S consists of only digits.
-231 ≤ target ≤ 231-1
*/

class Solution {
    public static ArrayList<String> addOperators(String S, int target) {
        // code here
        ArrayList<String> result = new ArrayList<>();
        genExpression(S, target, 0, 0, 0,"",result);
        return result;
    }
    
    private static void genExpression(String num, int target, int index, long value, long prevOp, String exp, ArrayList<String> result){
        if (index == num.length()){
            if (value == target){
                result.add(exp);
            }
            return;
        }
        long currOp = 0;
        for (int i = index; i < num.length(); i++){
            if (i != index && num.charAt(index) == '0')
                break;
                
            currOp = currOp* 10 +(num.charAt(i) - '0');
            
            if(index == 0)
                genExpression(num, target, i+1, currOp,currOp, Long.toString(currOp), result);
            else{
                genExpression(num, target, i+1, value + currOp, currOp, exp + '+' + currOp, result);
                genExpression(num, target, i+1, value - currOp, -currOp, exp + '-' + currOp, result);
                genExpression(num, target, i+1, value - prevOp + prevOp * currOp, prevOp * currOp, exp + '*' + currOp, result);
            }    
        }
    }
}
