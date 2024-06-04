// User function Template for Java

class Solution {
    String binaryNextNumber1(String s) {
        int n = Integer.valueOf(s,2);
        return Integer.toBinaryString(++n);
    }
    
    /* T : O(n) S: O(n) */
    String binaryNextNumber(String s) {
        
        int[] binNum= new int[s.length()];
        
        for( int i=0; i<binNum.length ; i++){
            binNum[i]=s.charAt(i)-48;
        }

        int carry=1;
        for( int i=s.length()-1; i>=0; i--){
            if(binNum[i]==1 && carry==1)  {
                carry=1;
                binNum[i]=0;
            }else if(binNum[i]==0 && carry==1) {
                carry=0;
                binNum[i]=1;
            }
        }

        
        StringBuilder sb = new StringBuilder();
        
        int i=0;
        if( carry==1) sb.append(1);
        else{
        while( binNum[i]==0) i++;
        }
        
        for( ; i<binNum.length ; i++){ sb.append(binNum[i]);}
        return sb.toString();
        
    }
}


/*

Binary representation of next number
EasyAccuracy: 50.0%Submissions: 16K+Points: 2
In need of more Geekbits? Win from a pool of 3500+ Geekbits via DSA-based Coding Contest every sunday!

banner
Given a binary representation in the form of a string(s) of a number n, the task is to find a binary representation of n+1.

Example 1:

Input: s = "10"
Output: 11
Explanation: "10" is the binary representation of 2 and binary representation of 3 is "11"
Example 2:

Input: s = "111"
Output: 1000
Explanation: "111" is the binary representation of 7 and binary representation of 8 is "1000"
Your Task:  
You don't need to read input or print anything. Complete the function binaryNextNumber()which takes s as input parameter and returns the string.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n) to store resultant string  

Constraints:
1 <= n <= 105
*/
