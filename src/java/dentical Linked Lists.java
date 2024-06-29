

/* T : O(n) S: O(1)*/
class Solution {
    // Function to check whether two linked lists are identical or not.
    public boolean areIdentical(Node head1, Node head2) {
        // write your code here
        
        Node temp1=  head1 , temp2= head2;
        
        while( temp1!=null && temp2!=null){
            
            if( temp1.data!= temp2.data) return false;
            
            temp1=temp1.next;
            temp2=temp2.next;
        }
        
        if( temp1==null && temp2==null) return true;
        
        return false;
    }
}


/*
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

problem discription :


Identical Linked Lists
Difficulty: BasicAccuracy: 47.49%Submissions: 142K+Points: 1
Given the two singly Linked Lists respectively. The task is to check whether two linked lists are identical or not. 
Two Linked Lists are identical when they have the same data and with the same arrangement too. If both Linked Lists are identical then return true otherwise return false. 

Examples:

Input:
LinkedList1: 1->2->3->4->5->6
LinkedList2: 99->59->42->20
Output: false
Explanation:

As shown in figure linkedlists are not identical.
Input:
LinkedList1: 1->2->3->4->5
LinkedList2: 1->2->3->4->5
Output: true
Explanation: 
 
As shown in figure both are identical.
Expected Time Complexity: O(n)
Expected Auxilliary Space: O(1)

Constraints:
1 <= length of lists <= 103



*/
