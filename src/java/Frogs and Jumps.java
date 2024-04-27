/User function Template for Java
//Frogs and Jumps.java
// problem : https://practice.geeksforgeeks.org/problems/5551749efa02ae36b6fdb3034a7810e84bd4c1a4/1
class Solution {
      public int unvisitedLeaves(int N, int leaves, int frogs[]) {
        // Code here
        int unVisited = 0;
        boolean[] visit = new boolean[leaves+1];
        
        for(int i=0; i<N; i++){
            int currPos = frogs[i];
            if(currPos <= leaves && !visit[currPos]) {
                for(int j=currPos; j<=leaves; j+=currPos){
                    visit[j] = true;
                }
            }
        }
        for(int i=1; i<=leaves; i++){
            if(!visit[i]) unVisited++;
        }
        return unVisited;
    }
}
