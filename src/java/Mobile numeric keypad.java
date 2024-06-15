// User function Template for Java

class Solution {
    public long getCount(int n) {
        if(n==1) return 10;
        
        long[][] prev= {
            {1,1,1},
            {1,1,1},
            {1,1,1},
            {0,1,0}
        };
        
        long ans=0;
        long[][] cur= new long[4][3];
        
        for( int i=1; i<n ; i++){
            long sum=0;
            for( int row=0; row < 4 ; row++){
                for( int  col=0; col<3 ; col++){
                    if( prev[row][col]==0) continue;
                    cur[row][col]= prev[row][col];
                    
                    if( row-1 >=0) cur[row][col] += prev[row-1][col];

                    if( row+1 < 4) cur[row][col] += prev[row+1] [col];
                    
                    if( col-1 >=0 ) cur[row][col] += prev[row][col-1];
                    
                    if( col+1 < 3 ) cur[row][col] += prev[row][col+1];
                    
                    sum+= cur[row][col];
                }
            }
            long temp[][]= prev;
            prev= cur;
            cur= temp;
            ans=sum;
        }
        return ans;
    }
}


/*
Mobile numeric keypad
MediumAccuracy: 32.6%Submissions: 44K+Points: 4
Solve today's problem-> Be the comment of the day-> Win a GfG T-Shirt!
Daily rewards up for grabs!

banner
There is a standard numeric keypad on a mobile phone. You can only press the current button or buttons that are directly up, left, right, or down from it (for ex if you press 5, then pressing 2, 4, 6 & 8 are allowed). Diagonal movements and pressing the bottom row corner buttons (* and #) are prohibited.



Given a number n, find the number of possible unique sequences of length n that you can create by pressing buttons. You can start from any digit.

Examples

Input: n = 1
Output: 10
Explanation: Number of possible numbers are 10 (0, 1, 2, 3, 4, 5, 6, 7, 8, 9)  
Input: n = 2
Output: 36
Explanation: Possible numbers: 00, 08, 11, 12, 14, 22, 21, 23, 25 and so on. If we start with 0, valid numbers will be 00, 08 (count: 2). If we start with 1, valid numbers will be 11, 12, 14 (count: 3). If we start with 2, valid numbers  will be 22, 21, 23,25 (count: 4). If we start with 3, valid numbers will be 33, 32, 36 (count: 3). If we start with 4, valid numbers will be 44,41,45,47 (count: 4). If we start with 5, valid numbers will be 55,54,52,56,58 (count: 5) and so on.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)

Constraints:
1 ≤ n ≤ 25


*/

