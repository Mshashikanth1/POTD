class Solution {
   
    
    
    public static ArrayList<Integer> getPrimes(int n) {
        // code here
        Set<Integer> tps= findAllPrimeNumberLessThanN(n);
        ArrayList<Integer> ans= new ArrayList<>();
        
        for( int i : tps) {
            if( tps.contains(n-i) ) {
                
                ans.add(i);
                ans.add(n-i);
                return ans;}
        }
        
        ans.add(-1);
        ans.add(-1);
        return ans;
    }
    
    
    public static TreeSet<Integer> findAllPrimeNumberLessThanN(int n){
            TreeSet<Integer> treeSet= new TreeSet<>();
            
            for( int i=2; i<=n ;i++){
                
                if( isPrime(i) ) treeSet.add(i);
            }
            return treeSet;

     }
     
     public static Boolean isPrime( int i){
         for( int j =2 ; j<= (int) Math.sqrt( i) ; j++){
                    if( i%j ==0) return false;
            }
                
        return true;
     }
    
    public static TreeSet<Integer> findAllPrimeNumberLessThanNSteaveOfErithos(int n){
        
        Boolean [] isPrime = new Boolean[n+1];
        
        Arrays.fill( isPrime , true);
        isPrime[0]=false;
        isPrime[1]= false;
        
        
        for( int i=2; i*i<=n ;i++){
            if( isPrime[i]) {
            for(int j=i*i ; j<=n ; j+=i){
               isPrime[j]=false;
            }
           }
        }
        TreeSet<Integer> treeSet= new TreeSet<>();
        
        for( int i=0;i<=n; i++){
            if( isPrime[i]) treeSet.add(i);
        }
        return treeSet;
        
        
        
    }
    
    
}

/*Prime Pair with Target Sum
MediumAccuracy: 27.67%Submissions: 40K+Points: 4
Solve today's problem-> Be the comment of the day-> Win a GfG T-Shirt!
Daily rewards up for grabs!

banner
Given a number n, find out if n can be expressed as a+b, where both a and b are prime numbers. If such a pair exists, return the values of a and b, otherwise return [-1,-1] as an array of size 2.
Note: If [a, b] is one solution with a <= b, and [c, d] is another solution with c <= d, and a < c then  [a, b] is considered as our answer.

Examples

Input: n = 10
Output: 3 7
Explanation: There are two possiblities 3, 7 & 5, 5 are both prime & their sum is 10, but we'll pick 3, 7 as 3 < 5.
Input: n = 3
Output: -1 -1
Explanation: There are no solutions to the number 3.
Expected Time Complexity: O(n*loglog(n))
Expected Auxiliary Space: O(n)

Constraints:
2 <= n <= 106

*/
