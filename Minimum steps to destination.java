

// User function Template for Java

class Solution {
    
     static int minSteps1(int d) {
        // code here
        int sum=0,i=1;
        while(sum!=d){
        
            if(sum>d) sum-=i;
            else sum+=i;
            
            i++;
        }
        return i-1;
    }
    
    /*Time : O(sqrt(d)) : Space : O(1)*/
    static int minSteps(int d) {
       int step = 0;
        long sum = 0;
        while (sum < d || (sum - d) % 2 != 0) {
            step++;
            sum += step;
        }

        return step;
    }
}

/*




1 -> 1 -> 1
2 -> 1 -2  + 3 ->  3
3 -> 1 + 2  --> 3
4 -> -1 + 2 + 3. --> 3
5 -> 1 + 2 + 3 + 4 - 5  --> 5
6 ->  1 + 2 + 3   ---> 3
7 -> -1 + 2 + -3 + 4 + 5. --> 5
8 -> 1+ 2+ 3+ 4 + 5 


Minimum steps to destination
MediumAccuracy: 31.77%Submissions: 19K+Points: 4
In need of more Geekbits? Win from a pool of 3500+ Geekbits via GfG Weekly this sunday!

banner
Given an infinite number line. You start at 0 and can go either to the left or to the right. The condition is that in the ith move, you must take i steps. Given a destination d, find the minimum number of steps required to reach that destination.

Example 1:

Input: d = 2
Output: 3
Explaination: The steps takn are +1, -2 and +3.
Example 2:

Input: d = 10
Output: 4
Explaination: The steps are +1, +2, +3 and +4.
Your Task:
You do not need to read input or print anything. Your task is to complete the function minSteps() which takes the value d as input parameter and returns the minimum number of steps required to reach the destination d from 0.

Expected Time Complexity: O(d)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ d ≤ 10000

*/
