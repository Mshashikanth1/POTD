
/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	// Your code here	
	Set<Integer> orderSet=new LinkedHashSet<>();
	Node curr=head;
	while(curr != null){
	    orderSet.add(curr.data);
	    curr=curr.next;
	}
	
    curr=head;
    int i=0;
	for(int j: orderSet){
	    if(i<orderSet.size()){
	        curr.data=j;
	        if(i==orderSet.size()-1){
	            break;
	        }
	        curr=curr.next;
	        i++;
	    }
	}
	curr.next=null;

	
	return head;
    }
}
/*
Remove duplicate element from sorted Linked List
EasyAccuracy: 49.37%Submissions: 241K+Points: 2
Win from a prize pool of INR 15K and get exciting merch! Register your team for Hack-A-Thon today!

Given a singly linked list consisting of N nodes. The task is to remove duplicates (nodes with duplicate values) from the given list (if exists).
Note: Try not to use extra space. The nodes are arranged in a sorted way.

Example 1:

Input:
LinkedList: 2->2->4->5
Output: 2 4 5
Explanation: In the given linked list 
2 ->2 -> 4-> 5, only 2 occurs more 
than 1 time. So we need to remove it once.

Example 2:

Input:
LinkedList: 2->2->2->2->2
Output: 2
Explanation: In the given linked list 
2 ->2 ->2 ->2 ->2, 2 is the only element
and is repeated 5 times. So we need to remove
any four 2.

Your Task:
The task is to complete the function removeDuplicates() which takes the head of input linked list as input. The function should remove the duplicates from linked list and return the head of the linkedlist.

Expected Time Complexity : O(N)
Expected Auxilliary Space : O(1)

Constraints:
1 <= Number of nodes <= 105
Company Tags
*/

