class Solution {

    /* T : O(n)  S: O(1) */
    String compareFrac(String str) {
        // Code here
        String[] fracStr=str.split(","), first = fracStr[0].split("/"),
                  second= fracStr[1].split("/");
                  
        double firstVal=(  (double) Integer.valueOf(first[0].strip())/ Integer.valueOf(first[1].strip()) );
        double secVal = ( (double) Integer.valueOf(second[0].strip())/ Integer.valueOf(second[1].strip()) );
        
        if( firstVal> secVal ){
            return fracStr[0].strip();
        } else if( firstVal==secVal) return "equal";
        return fracStr[1].strip();
        
    }
}

/*
Compare two fractions
Difficulty: EasyAccuracy: 68.29%Submissions: 7K+Points: 2
You are given a string str containing two fractions a/b and c/d, compare them and return the greater. If they are equal, then return "equal".

Note: The string str contains "a/b, c/d"(fractions are separated by comma(,) & space( )). 

Examples

Input: str = "5/6, 11/45"
Output: 5/6
Explanation: 5/6=0.8333 and 11/45=0.2444, So 5/6 is greater fraction.
Input: str = "8/1, 8/1"
Output: equal
Explanation: We can see that both the fractions are same, so we'll return a string "equal".
Input: str = "10/17, 9/10"
Output: 9/10
Explanation: 10/17 = 0.588 & 9/10 = 0.9, so the greater fraction is "9/10".
Expected Time Complexity: O(len|str|)
Expected Auxiliary Space: O(1)

Constraints:
0<=a,c<=103
1<=b,d<=103



*/
