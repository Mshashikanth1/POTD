
/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node num1, Node num2){
        // code here
        // return head of sum list
        Node temp1=reverse(num1), temp2=reverse(num2);
        
        int carry=0;
        
        Node head=new Node(-1), curr=head;

        while(temp1!=null || temp2!=null || carry!=0){ 
            int res= carry;
            
            if(temp1!=null) {
                res+=temp1.data;
                temp1=temp1.next;
            }
            
            if(temp2!=null){
                res+=temp2.data;
                temp2=temp2.next;
            }
            
            carry=res/10;
            curr.next=new Node(res % 10);
            curr=curr.next;
        }
        
        
        head=head.next;
        head=reverse2(head);
        while(head.data==0 && head.next!=null) head=head.next;
        return head;
    }
    
    static Node reverse(Node head){
        Stack<Node> stack=new Stack<>();
        Node curr=head;
        while(curr!=null){
           stack.push(curr);
           curr=curr.next;
        }
        
        head=stack.pop();
        curr=head;
        while(!stack.isEmpty()){
            curr.next=stack.pop();
            curr=curr.next;
        }
        curr.next=null;
        return head;
    }
    static Node reverse2(Node head){
        if(head==null || head.next==null) return head;
        Node curr=reverse(head.next);
        head.next.next = head;
        head.next = null;
        return curr;
    }
}
/*
Add two numbers represented by linked lists
MediumAccuracy: 34.52%Submissions: 245K+Points: 4
 Done with winning Geekbits? Now win GfG Bag, GfG T-shirt & much more just by writing your experiences. Start Writing, Start Winning.
banner
Given two decimal numbers, num1 and num2, represented by linked lists of size n and m respectively. The task is to return a linked list that represents the sum of these two numbers.

For example, the number 190 will be represented by the linked list, 1->9->0->null, similarly 25 by 2->5->null. Sum of these two numbers is 190 + 25 = 215, which will be represented by 2->1->5->null. You are required to return the head of the linked list 2->1->5->null.

Note: There can be leading zeros in the input lists, but there should not be any leading zeros in the output list.

Example 1:

Input:
n = 2
num1 = 45 (4->5->null)
m = 3
num2 = 345 (3->4->5->null)
Output: 
3->9->0->null  
Explanation: 
For the given two linked list (4 5) and (3 4 5), after adding the two linked list resultant linked list will be (3 9 0).
Example 2:

Input:
n = 4
num1 = 0063 (0->0->6->3->null)
m = 2
num2 = 07 (0->7->null)
Output: 
7->0->null
Explanation: 
For the given two linked list (0 0 6 3) and (0 7), after adding the two linked list resultant linked list will be (7 0).
Your Task:
The task is to complete the function addTwoLists() which has node reference of both the linked lists and returns the head of the sum list.   

Expected Time Complexity: O(n+m)
Expected Auxiliary Space: O(max(n,m)) for the resultant list.

Constraints:
1 <= n,

m <= 104
*/

