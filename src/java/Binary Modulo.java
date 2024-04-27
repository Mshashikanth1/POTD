//User function Template for Java
/*

Binary Modulo
EasyAccuracy: 59.5%Submissions: 8K+Points: 2
Finding A Job Is Now Easier Than Today's Problem! Explore Job Fair 2023 

You are given a binary string s and an integer m. You need to return an integer r. Where r = k%m, k is the binary equivalent of string s.

Example 1:

Input:
s = "101" 
m = 2
Output:
1
Explanation: Here k=5 because (101)2 = (5)10.
Hence 5 mod 2 = 1.

Example 2:

Input:
s = "1000"
m = 4
Output:
0
Explanation: Here k=8 and m=4 hence 
r = k mod m = 8 mod 4 = 0.

Your Task:
You don't need to read input or print anything. Your task is to complete the function modulo() which takes the string s and integer m as input parameters and returns the value of r as described above.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints:
1 <= len(s) <= 105
1 <= m <= 100

*/
class Solution{
	int modulo(String s, int m) {
		//Write your code here
		
		//Solution 1
		long k=binaryStringToInteger(s);
		return (int)(k%(long)m);
		
		//Soulution 2
		java.math.BigInteger b1=new java.math.BigInteger(s,2);
		java.math.BigInteger b2=new java.math.BigInteger(String.valueOf(m));
		return b1.mod(b2).intValue();

        //soulution 3
        int ans=0;
        for(char ch : s.toCharArray()){
            if(ch=='1') ans=(2*ans+1)%m;
            else ans=(2*ans)%m;
        }
        return ans;
		
		
	}
	long binaryStringToInteger(String s){
	    long val=0;
	    for(char ch: s.toCharArray()){
	        val <<=1;
	        val +=ch-'0';
	        
	    }
	    return val;
	}
}
