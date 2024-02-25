
/*
Reach a given score
EasyAccuracy: 79.23%Submissions: 35K+Points: 2
Internship Alert!
Become an SDE Intern by topping this monthly leaderboard! 

banner
Consider a game where a player can score 3 or 5 or 10 points in a move. Given a total score n, find number of distinct combinations to reach the given score.

Example 1:

Input
n = 10
Output
2
Explanation
There are two ways {5,5} and {10}.
Example 2:

Input
n = 20
Output
4
Explanation
There are four possible ways. {5,5,5,5}, {3,3,3,3,3,5}, {10,10}, {5,5,10}.
Your Task:  
You don't need to read input or print anything. Your task is to complete the function count( ) which takes n as input parameter and returns the answer to the problem.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)

Constraints:

1 ≤ n ≤ 106


*/

// Complete this function!

class Geeks {
    public long count1(int n) {
        // Add your code here.
        int[] table=new int[n+1];
        Arrays.fill(table,0);
        table[0]=1;
        
        for(int i=3;i<=n;i++){
            table[i]+=table[i-3];
        }
        
        for(int i=5;i<=n;i++){
            table[i]+=table[i-5];
        }
        
        for(int i=10;i<=n;i++){
            table[i]+=table[i-10];
        }
        
        return table[n];
    }
    
    public long count(int n) {
        // Add your code here.
        
        //intitialize a dp array  tabulation method
       int[] dp=new int[n+1];
       
       //fill the dp array with zero's initially
       Arrays.fill(dp,0);
       
       //base case the count of elements to add for n=0 is 1;
       dp[0]=1; 
       
       //initialize the points array possible;
       int[] points=new int[]{3,5,10};
       
       //for each point calculate the number of possible ways to reach the target score
       for(int point : points){
           for(int i=point;i<=n;i++){
               dp[i]+=dp[i-point];
           }
       }
       
       return dp[n];
    }
    
}
