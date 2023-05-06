
/*
Another Coin Change Problem
MediumAccuracy: 54.5%Submissions: 11K+Points: 4
Finding A Job Is Now Easier Than Today's Problem! Explore Job Fair 2023 

Given three integers n, k, target, and an array of coins of size n. Find if it is possible to make a change of target cents by using an infinite supply of each coin but the total number of coins used must be exactly equal to k.

Example 1:

Input:
n = 5, k = 3, target = 11
coins = {1, 10, 5, 8, 6}

Output: 
1

Explanation: 
2 coins of 5 and 1 coins of 1 can be used 
to make change of 11 i.e. 11 => 5+5+1.

Example 2:

Input:
n = 3, k = 5, target = 25
coins = {7, 2, 4}

Output:
1

Explanation:
3 coins 7, 2 coins of 2 can be used to
make change of 25 i.e. 25 => 7+7+7+2+2.

Your Task:
This is a function problem. You only need to complete the function makeChanges() that 3 integers n, k, target, and an array coins as parameters and return True or False.

Expected Time Complexity: O(n*k*target)
Expected Space Complexity: O(k*target)

Constraints:
1 <= n, k, coins[i] <= 100
1 <= target <= 1000


*/

/*
Intution:
        i.what if we are alowed to pic only one coin(k=1) tomake the target? its obvious that it is possible only 
        if that coins is giver
        ii. what if we are allowed to pic two coins?(k=2) we would pic a coin and check if there is coin for the bala
        ace amoun.
        iii. what about 3 coins coins ? the same porcess (i..e) pic a coin and check if the balance can be made with 
        2 coins.
        iv. heance for k coins, pick a coin and check if the balance amount can be made wiht k-1 coins. repeat this 
        for all coins till it is possible.
Approach:
        i.create a 2d boolean array dp, dp[k][target] donotes if it si pssible to make target amount with k coins.
        ii.For every target amount made with x coins, make a new target target+coins[i] with x+1 moves.
        (e...g) cons=[1,10,5,8,6]
        Target of 1 can be made with 1 coins (coins[0])
        Target of 2 (1+1) can be madwe with 2 coins.
        Target of 11 (10+1) can be made with 2 coins.
        Target of 6(1+5) can be made with 2 coins.
        .
        .
        .
        .
        .
        . Repate for k coins.
*/
// class Solution {
//     public static boolean makeChanges(int N, int K, int target, int[] coins) {
//         // code here
//         Arrays.sort(coins);
//         int i=0;
//         while(k>0){
//             if(coins[i]*k<target){}
//             else(coins[i]*k>target){
//                 while(coins[i]*k>target){
//                     k--;;
//                     target-=coins[i]*k;
//                     i--;
//                 }
                
//             }
//             else if(coins[i]*k==0){return true}
//         }
        
//         return false;
//     }
// }

/*
n=5, k=3, target=11;

coins= [1,10,5,8,6]
sortedCoins=

             [1,  5,  6,  8,  10]
                 (i*k<t)
target=11     3,y 15,N 

                [1,  5,  6,  8,  10]
                
             

*/


class Solution {
    public static boolean makeChanges(int N, int K, int target, int[] coins) {
        // code here
        boolean[][] dp =new boolean[101][1001];
        dp[0][0]=true;
        for(int k=1;k<=K;k++){
            for(int t=0;t<=target;t++){
                if(dp[k-1][t]){
                    for(int i=0;i<coins.length;i++){
                        dp[k][t+coins[i]]=true;
                    }
                }
                
            }
            
        }
        return dp[K][target];
    }
}
