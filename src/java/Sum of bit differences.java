


//time o(n^2). space : O(1)
class Solution {
    long sumBitDifferences1(int[] arr, int n) {
        // code here
        Long count=0L;
        for(int i: arr){
            for(int j: arr){
                 count+=Integer.toBinaryString(i^j)
                               .chars()
                               .filter(k->'1'==k)
                               .count();
            }
        }
        return count;
    }
    
    //time O(n) space : O(1)
    long sumBitDifferences(int[] arr, int n) {
             long count = 0;

        for (int i = 0; i < 32; i++) { 
            int countSet = 0;
            for (int num : arr) {
                if ((num >> i & 1) == 1) {
                    countSet++;
                }
            }
            count += (countSet * (long) (n - countSet)) * 2; 
        }
        return count;
        }
    
}
