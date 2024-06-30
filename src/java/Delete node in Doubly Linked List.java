
/*

Definition for doubly Link List Node
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    
    /* T : O(n) S: O(1) */
    public Node _deleteNode(Node head, int x) {
        List<Integer> lis= new ArrayList<>();
        
        Node temp= head;
        
        int count=1;
        while(temp!=null) {
            if( count!= x)
             lis.add( temp.data);
             
             temp= temp.next;
             count++;
        }
        
        head= new Node(-1);
        temp= head;
        
        for( int i: lis){
            Node newNode= new Node(i);

            newNode.prev=temp;
            temp.next=newNode;
            temp=temp.next;
        }
        
        head=head.next;
        head.prev=null;
        return head;
        
        
    }
    
    
    /* T : O(n) S : O(1) */
    public Node deleteNode(Node head, int x) {
        
        Node curr=head;
        int count=1;
        while( curr!=null ){
            
            if( count==x){
                
                Node prevNode= curr.prev , nextNode= curr.next;
                
                if( prevNode !=null)  prevNode.next=curr.next;
                else { head=head.next; curr=head; curr.prev=null; }
                if( nextNode !=null )nextNode.prev=prevNode;
                
            }
            curr=curr.next;
            count++;
        }
        
        return head;
            
    }
}

/*
Delete node in Doubly Linked List
Difficulty: EasyAccuracy: 42.98%Submissions: 96K+Points: 2
Given a doubly Linked list and a position. The task is to delete a node from a given position (position starts from 1) in a doubly linked list and return the head of the doubly Linked list.

Examples:

Input: LinkedList = 1 <--> 3 <--> 4, x = 3
Output: 1 3  
Explanation: 
After deleting the node at position 3 (position starts from 1),the linked list will be now as 1 <--> 3.
 
Input: LinkedList = 1 <--> 5 <--> 2 <--> 9, x = 1
Output: 5 2 9
Explanation:

Expected Time Complexity: O(n)
Expected Auxilliary Space: O(1)

Constraints:
2 <= size of the linked list(n) <= 105
1 <= x <= n
1 <= node.data <= 109
*/
