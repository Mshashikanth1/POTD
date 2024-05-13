
class Solution {
    
    static int[] parent;
    static int noOfIslandsWithEveryPairNodeHasEdge=0;
    public static int findNumberOfGoodComponent(int e, int v, int[][] edges) {
        // code here
        
        parent=new int[v+1];
        for(int i=0; i<v+1;i++) parent[i]=i;
    
        
        Map<Integer,List<Integer>> adjList=new HashMap<>();
        for(int[] edge:edges) {
            
            //construct adjacency list
            List<Integer> currList = adjList.getOrDefault(edge[0], new ArrayList<>());
            currList.add(edge[1]);
            adjList.put(edge[0],currList);
            
            currList = adjList.getOrDefault(edge[1], new ArrayList<>());
            currList.add(edge[0]);
            adjList.put(edge[1],currList);
            
            //union the edges
            // union(edge[0], edge[1]);
            union(edge[1], edge[0]);
            
        }
        for(int i=1;i<=v;i++) if(!adjList.containsKey(i)) adjList.put(i, new ArrayList<>());
        
        // System.out.println(adjList);
        // System.out.println(Arrays.toString(parent));
        
        
        int islands=0;
        Set<Integer> visited=new HashSet<>();
        for(int node : adjList.keySet()){
            if(!visited.contains(node)){
                
            //   List<Integer> islandMembers=dfs(node, adjList, visited);
                 List<Integer> islandMembers=dfsRec(node, adjList, visited, new ArrayList<>());
                 
             updateResult(adjList,islandMembers);
            }
        }
        
        return noOfIslandsWithEveryPairNodeHasEdge;
    }
    
    public static void updateResult(  Map<Integer,List<Integer>> adjList, List<Integer> islandMembers){
        boolean isAllMembersHaveAnEdge=true;
            //   System.out.println(islandMembers);
              for(int i :islandMembers){
                  for(int j : islandMembers){
                   if( i!=j && !adjList.get(i).contains(j) ) {isAllMembersHaveAnEdge=false; break;}
                  }
              };
              if(islandMembers.size()==1)  isAllMembersHaveAnEdge=true;
              if(isAllMembersHaveAnEdge) noOfIslandsWithEveryPairNodeHasEdge++;
    }
    
    
    
    
    public static  List<Integer>  dfs(int root, Map<Integer,List<Integer>> adjList ,  Set<Integer> visited ){
           Stack<Integer> stack=new Stack<>();
           stack.push(root);
           
           List<Integer> islandMembers=new ArrayList<>();
           
           
           while(!stack.isEmpty()){
               int pop=stack.pop();

               islandMembers.add(pop);
               visited.add(pop);
               for(int neighbour:adjList.get(pop)){
                     if(!visited.contains(neighbour)) {stack.push(neighbour);  visited.add(neighbour);}
               }
           }
           return islandMembers;
    }
       

          
    
    
      public static  List<Integer>  dfsRec(int root, Map<Integer,List<Integer>> adjList ,  Set<Integer> visited, List<Integer> islandMembers){
      
               islandMembers.add(root);
               visited.add(root);
               for(int neighbour:adjList.get(root)){
                     if(!visited.contains(neighbour)) { 
                         visited.add(neighbour);
                         dfsRec(neighbour, adjList, visited, islandMembers);
                     }
               }
                return islandMembers;
           }
           
           
        public static void union(int a, int b){
            int aRep=find(a), bRep=find(b);
                 if (aRep != bRep) {
                    parent[aRep]=bRep;
                }
            }
        
        public static  int find(int a){
            if(parent[a] == a) return a;
            parent[a]= find(parent[a]);
            return parent[a];
        }
}
/*
Number of Good Components
MediumAccuracy: 60.81%Submissions: 28K+Points: 4
In need of more Geekbits? Win from a pool of 3500+ Geekbits via GfG Weekly this sunday!

banner
Given an undirected graph with v vertices(numbered from 1 to v) and e edges. Find the number of good components in the graph.
A component of the graph is good if and only if the component is fully connected.
Note: A fully connected component is a subgraph of a given graph such that there's an edge between every pair of vertices in the component, the given graph can be a disconnected graph. 

Example 1:

Input: 


e=3 
v=3
edges={{1, 2},{1, 3},{3, 2}}
Output: 
1
Explanation: 
We can see that there is only one component in the graph and in this component there is a edge between any two vertces.
Example 2:

Input:

e=5 
v=7
edges={{1, 2},{7, 2},{3, 5},{3, 4},{4, 5}}
Output: 
2
Explanation: 
We can see that there are 3 components in the graph. For 1-2-7 there is no edge between 1 to 7, so it is not a fully connected component. Rest 2 are individually fully connected component.
Your Task:
You don't need to read input or print anything. Your task is to complete the function findNumberOfGoodComponent(), which takes an integer e and v and edges[][] as input parameters and returns an integer denoting the number of good components.

Expected Time Complexity: O(v+e)
Expected Auxiliary Space: O(depth of the graph)

Constraints:
1 <= edges[i][0], edges[i][1] <= v
1 ≤ v, e ≤ 104
All edges are unique


*/
