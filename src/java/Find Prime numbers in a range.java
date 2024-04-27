
/*Find Prime numbers in a range.java
MediumAccuracy: 48.64%Submissions: 42K+Points: 4
Explore Job Fair for students & freshers for daily new opportunities. Find A Job Today! 

Given two integers M and N, generate all primes between M and N including M and N.

Example 1:

Input:
M=1,N=10
Output:
2 3 5 7
Explanation:
The prime numbers between 1 and 10
are 2,3,5 and 7.

Example 2:

Input:
M=2, N=5
Output:
2,3,5
Explanation:
The prime numbers between 2 and 5 are 
2,3 and 5.


Your Task:
You don't need to read input or print anything. Your task is to complete the function primeRange() which takes 2 integer inputs M and N and returns a list of all primes between M and N including N and M.


Expected Time Complexity:O(N*sqrt(N))
Expected Auxillary Space:O(1)


*/


// User function Template for Java

class Solution {
    ArrayList<Integer> primeRange(int M, int N) {
        // code here
         ArrayList<Integer> ans=new ArrayList<Integer>();
         for(int i=M;i<=N;i++){
             if(isPrime(i)){
                 ans.add(i);
             }
         }
         return ans;
    }
    public static boolean  isPrime(int num){
        if(num==1) return false;
        
        for(int i=2;i*i<=num;i++){
            if(num%i==0) return false;
        }
        return true;
    }
}

/*
one is neighter prime nor composite

if any number has more than two factors other than 1 and itself it is called a prime number
*/

