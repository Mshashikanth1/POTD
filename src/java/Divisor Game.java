// User function Template for Java

class Solution {
    public static boolean divisorGame(int n) {
        // code here
        
        return n%2==0;
    }
}

/*

Divisor Game
EasyAccuracy: 75.75%Submissions: 9K+Points: 2
 Done with winning Geekbits? Now win GfG Bag, GfG T-shirt & much more just by writing your experiences. Start Writing, Start Winning.
banner
Alice and Bob take turns playing a game, with Alice starting first.
Initially, there is a number n on the chalkboard. On each player's turn, that player makes a move consisting of:

Choosing any x with 0 < x < n  and n % x == 0.
Replacing the number n on the chalkboard with n - x.
Also, if a player cannot make a move, they lose the game.
Return true if and only if Alice wins the game, assuming both players play optimally.

 

Example 1:

Input:
n = 2
Output: True
Explanation: Alice chooses 1, and Bob has no more moves.
 

Example 2:

Input:
n = 3
Output: False
Explanation: Alice chooses 1, Bob chooses 1, and Alice has no more moves.
 

Your Task:
You don't need to read input or print anything. Your task is to complete the function divisorGame() which takes an integer n as a parameter and returns true if Alice wins the game.

Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ n ≤ 103


*/

