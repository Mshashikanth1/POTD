class Solution{
    public void count(int[][] grid, int i, int j, int[][] temp){          //finds the count of a island
        if(i<0 || i>=n || j<0 || j>=n || grid[i][j] != 1 || temp[i][j] == -1) return;
        
        c++;
        temp[i][j] = -1;
        count(grid, i+1, j, temp);
        count(grid, i-1, j, temp);
        count(grid, i, j+1, temp);
        count(grid, i, j-1, temp);
    }
    
    public void set (int i, int j, int[][] temp) {                   //set the temp[i][j] to count of numbers in island and also deciding the parent to curPar
        if(i<0 || i>=n || j<0 || j>=n || temp[i][j] != -1) return;
        
        temp[i][j] = c;
        par[i][j] = curPar;
        set(i+1, j, temp);
        set(i-1, j, temp);
        set(i, j+1, temp);
        set(i, j-1, temp);
    }
    
    public boolean isValid(int i, int j) {
        return !(i<0 || j<0 || i>=n || j>=n);
    }
    
    int c, curPar, n, max; // made this global so no need to call mention in function parameter
    int[][] par;

    public int largestIsland(int N,int[][] grid) {
        n = N;
        int[][] temp = new int[n][n];
        par = new int[n][n];
        curPar = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(grid[i][j]==1 && temp[i][j]==0){
                    c=0;
                    curPar++;
                    count(grid, i, j, temp);
                    max = Math.max(c, max);
                    set(i, j, temp);
                }
            }
        }
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(grid[i][j] == 0) {
                    HashMap<Integer, Integer> map = new HashMap<>();
                    if(isValid(i+1, j) && temp[i+1][j]!=0 && !map.containsKey(par[i+1][j])) map.put(par[i+1][j], temp[i+1][j]);
                    if(isValid(i-1, j) && temp[i-1][j]!=0 && !map.containsKey(par[i-1][j])) map.put(par[i-1][j], temp[i-1][j]);
                    if(isValid(i, j+1) && temp[i][j+1]!=0 && !map.containsKey(par[i][j+1])) map.put(par[i][j+1], temp[i][j+1]);
                    if(isValid(i, j-1) && temp[i][j-1]!=0 && !map.containsKey(par[i][j-1])) map.put(par[i][j-1], temp[i][j-1]); 
                    int sum=0;
                    
                    for(int k : map.keySet()){
                        sum+=map.get(k);
                    }
                    max = Math.max(max, sum+1);
                }
            }
        }
        
        return max;
    }
}
/*
Making A Large Island
HardAccuracy: 52.36%Submissions: 20K+Points: 8
Full stack, Backend development, Data Science & other trending courses at upto 35% Off

banner
You are given an n x n binary matrix grid. You are allowed to change at most one 0 to be 1. A group of connected 1s forms an island. Two 1s are connected if they share one of their sides with each other.

Return the size of the largest island in the grid after applying this operation.

Example 1:

Input: 
grid = [[1,0],[0,1]]
Output:
3
Explanation:
Change any one 0 to 1 and connect two 1s, then we get an island with area = 3.
Example 2:

Input: 
grid = [[1,1],[1,0]]
Output:
4
Explanation:
Change the only 0 to 1 and make the island bigger, then we get an island with area = 4.
Example 3:

Input: 
grid = [[1,1],[1,1]]
Output:
4
Explanation:
Can't change any 0 to 1, only one island possible with area = 4.
Your Task:

You don't have to read input or print anything. You have to complete the functions largestIsland(), which takes binary matrix as input and returns an integer denoting the size of the largest island in grid after applying the operation.

Constraints:
*/
