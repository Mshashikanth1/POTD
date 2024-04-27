
# ##/*
# Maximum Depth Of Binary Tree
# EasyAccuracy: 82.29%Submissions: 6K+Points: 2

# Given a binary tree, find its maximum depth.
# A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

# Example 1:
# Input:
#  root  -->     1
#                       /   \
#                     3      2
#                   /
#                 4           
# Output: 3
# Explanation:
# Maximum depth is between nodes 1 and 4, which is 3.

# Example 2:

# Input:
#  root -->    10
#           /    \
#           20    30
#           \      \  
#           40     60
#                   /
#                  2 
# Output: 4
# Explanation:
# Maximum depth is between nodes 10 and 2, which is 4

class Node:
    def __init__(self, val):
        self.right = None
        self.data = val
        self.left = None
        
class Solution:
    maxDepthAns=float('-inf')
    def maxDepth(self,root):
        self.dfs(root,1)
        return self.maxDepthAns
    def dfs(self,root,depth):
        if root==None: return 
        self.maxDepthAns=max(self.maxDepthAns,depth)
        self.dfs(root.left,depth+1)
        self.dfs(root.right,depth+1)
    
