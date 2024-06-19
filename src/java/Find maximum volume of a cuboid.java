
// User function Template for Java

class Solution {

    double maxVolume(double perimeter, double area) {
        // code here
        double l = (double) (perimeter - Math.sqrt(perimeter*perimeter - 24*area))/12,
               height= (perimeter/4)-(2*l);
        
        
        return l*l*height;
    }
}

/*
Find maximum volume of a cuboid
Difficulty: EasyAccuracy: 53.16%Submissions: 12K+Points: 2
You are given a perimeter & the area. Your task is to return the maximum volume that can be made in the form of a cuboid from the given perimeter and surface area.
Note: Round off to 2 decimal places and for the given parameters, it is guaranteed that an answer always exists.

Examples

Input: perimeter = 22, area = 15
Output: 3.02
Explanation: The maximum attainable volume of the cuboid is 3.02
Input: perimeter = 20, area = 5
Output: 0.33
Explanation: The maximum attainable volume of the cuboid is 0.33
Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)
Constraints :
1 ≤ perimeter ≤ 109
1 ≤ area ≤ 109


*/
