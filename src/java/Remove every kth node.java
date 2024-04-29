
/* Link list Node
class Node
{
	Node next;
	int data;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
Remove every kth node
EasyAccuracy: 29.88%Submissions: 61K+Points: 2
 Done with winning Geekbits? Now win GfG Bag, GfG T-shirt & much more just by writing your experiences. Start Writing, Start Winning.
banner
Given a singly linked list having n nodes, your task is to remove every kth node from the linked list. 

Example 1:

Input:
n = 8
linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 
k = 2
Output: 
1 -> 3 -> 5 -> 7
Explanation: 
After removing every 2nd node of the linked list, the resultant linked list will be: 1 -> 3 -> 5 -> 7.
Example 2:

Input:
n = 10
linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 10 
k = 3
Output: 
1 -> 2 -> 4 -> 5 -> 7 -> 8 -> 10
Explanation: 
After removing every 3rd node of the linked list, the resultant linked list will be: 1 -> 2 -> 4 -> 5 -> 7 -> 8 -> 10.
Your Task:
The task is to complete the function deleteK() which takes head of linked list and integer k as input parameters and delete every kth node from the linked list and return its head.

Expected Time Complexity :  O(n)
Expected Auxiliary Space :  O(1)

Constraints:
1 <= n <= 105
-109 <= elements of linked list <= 109
1 <= k <= n
*/
class Solution
{
    /*Time :O(n) Space:O(1)*/
    Node delete(Node head, int k){
        if(k==1) return null;
        try{

    	int i=1;
        Node curr=head,prev=head;

        while(curr!=null && curr.next!=null ){
            if(i==k){
                i=1;
                prev.next= curr.next;
                prev=prev.next;
                curr= prev.next;
            }else{
                prev=curr;
                curr=curr.next;
            }
            i++;
        }
         if(i==k) prev.next=curr.next;
        
        } finally{
          return head;
        }
    }
}

