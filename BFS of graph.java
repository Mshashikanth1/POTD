
class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> bfsTraversal=new ArrayList<>();
        Queue<Integer> queue=new LinkedList<>();
        
        boolean[]  visited =new boolean[V];
        for(int i=0;i<V;i++) visited[i]=false;
        
        // System.out.println(Arrays.toString(visited));
        
        //adj.forEach(vec->System.out.println(vec.toString()));
        
        queue.offer(0);
        visited[0]=true;
        while(!queue.isEmpty()){
            
            int remEle=queue.poll();
            //Sysetm.out.println(remEle);
            bfsTraversal.add(remEle);
            for(int i : adj.get(remEle)){
                if(!visited[i]){
                visited[i]=true;
                queue.offer(i);
                }
            }
        }
        return bfsTraversal;
    }
}

/*
BFS of graph
EasyAccuracy: 44.09%Submissions: 283K+Points: 2
POTD July Placement Special : All POTD in the month of July are based on popular interview questions. Solve every day to ace the upcoming Placement Season !

Given a directed graph. The task is to do Breadth First Traversal of this graph starting from 0.
Note: One can move from node u to node v only if there's an edge from u to v. Find the BFS traversal of the graph starting from the 0th vertex, from left to right according to the input graph. Also, you should only take nodes directly or indirectly connected from Node 0 in consideration.


Example 1:

Input:

Output: 0 1 2 3 4
Explanation: 
0 is connected to 1 , 2 , 3.
2 is connected to 4.
so starting from 0, it will go to 1 then 2
then 3. After this 2 to 4, thus bfs will be
0 1 2 3 4.

Example 2:

Input:

Output: 0 1 2
Explanation:
0 is connected to 1 , 2.
so starting from 0, it will go to 1 then 2,
thus bfs will be 0 1 2. 


Your task:
You dont need to read input or print anything. Your task is to complete the function bfsOfGraph() which takes the integer V denoting the number of vertices and adjacency list as input parameters and returns  a list containing the BFS traversal of the graph starting from the 0th vertex from left to right.


Expected Time Complexity: O(V + E)
Expected Auxiliary Space: O(V)


Constraints:
1 ≤ V, E ≤ 104

*/
