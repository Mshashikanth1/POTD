







/* Structure of node

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

Nth node from end of linked list
EasyAccuracy: 41.18%Submissions: 290K+Points: 2
Lamp
You can earn more Geekbits by participating in GFG Weekly Coding Contest  

Given a linked list consisting of L nodes and given a number N. The task is to find the Nth node from the end of the linked list.

Example 1:

Input:
N = 2
LinkedList: 1->2->3->4->5->6->7->8->9
Output: 8
Explanation: In the first example, there
are 9 nodes in linked list and we need
to find 2nd node from end. 2nd node
from end is 8.  

Example 2:

Input:
N = 5
LinkedList: 10->5->100->5
Output: -1
Explanation: In the second example, there
are 4 nodes in the linked list and we
need to find 5th from the end. Since 'n'
is more than the number of nodes in the
linked list, the output is -1.

Your Task:
The task is to complete the function getNthFromLast() which takes two arguments: reference to head and N and you need to return Nth from the end or -1 in case node doesn't exist.

Note:
Try to solve in a single traversal.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= L <= 106
1 <= N <= 106
View Bookmarked Problems 
*/

class GfG
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// Your code here	
    	try{
    	Stack<Integer> stack= new Stack<>();
    	Node curr=head;
    	while(curr!=null){stack.push(curr.data); curr=curr.next;}
    	
    	while(n-->1){stack.pop();}
    	
    	return stack.pop();
    	}catch (Exception e){return -1;}
    }
}

