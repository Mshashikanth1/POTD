

class Solution {
    
    
    public static int countNumberswith4(int n) {
        int count=0;
        for(int i=1; i<=n; i++){
           if(isContainsNumFour(i)) count++;
        }
        return count;
    }
    
    
    public static  boolean isContainsNumFour(int num){
        while (num > 0 ){
            if(num%10==4) return true;
            num=num/10;
        }
        return false;
    }
    
}


/*

Count numbers containing 4
EasyAccuracy: 37.85%Submissions: 31K+Points: 2
Solve today's problem-> Be the comment of the day-> Win a GfG T-Shirt!
Daily rewards up for grabs!

banner
You are given a number n, Return the count of total numbers from 1 to n containing 4 as a digit.

Examples:

Input: n = 9
Output: 1
Explanation: 4 is the only number between 1 to 9 which contains 4 as a digit.
Input: n = 44
Output: 9
Explanation: 4, 14, 24, 34, 40, 41, 42, 43 & 44, there are total 9 numbers containing 4 as a digit.
Expected Time Complexity: O(nlogn)
Expected Auxiliary Space: O(1)

Constraints:
1 <= n <= 105
*/
