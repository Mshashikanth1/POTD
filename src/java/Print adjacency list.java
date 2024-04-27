

class Solution {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        List<List<Integer>> adj=new ArrayList<>();
        
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int[] edge:edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        
        return adj;
    }
}

/*
Print adjacency list
EasyAccuracy: 43.42%Submissions: 102K+Points: 2

Given an undirected graph with V nodes and E edges, create and return an adjacency list of the graph. 0-based indexing is followed everywhere.

Example 1:

Input:
V = 5, E = 7
edges = {(0,1),(0,4),(4,1),(4,3),(1,3),(1,2),(3,2)}

Output: 
{{1,4}, 
 {0,2,3,4}, 
 {1,3},
 {1,2,4},
 {0,1,3}}
Explanation:
Node 0 is connected to 1 and 4.
Node 1 is connected to 0,2,3 and 4.
Node 2 is connected to 1 and 3.
Node 3 is connected to 1,2 and 4.
Node 4 is connected to 0,1 and 3.

Example 2:

Input:
V = 4, E = 3
edges = {(0,3),(0,2),(2,1)}


Output: 
{{2,3} 
 {2}, 
 {0,1} 
 {0}}
Explanation:
Node 0 is connected to 2 and 3.
Node 1 is only connected to 2.
Node 2 is connected to 0 and 1.
Node 3 is only connected to 0.

Your task:
You don't need to read input or print anything. Your task is to complete the function printGraph() which takes the integer V denoting the number of vertices and edges as input parameters and returns the list of list denoting the adjacency list.

Expected Time Complexity: O(V + E)
Expected Auxiliary Space: O(V + E)

Constraints:
1 ≤ V, E ≤ 105
*/
