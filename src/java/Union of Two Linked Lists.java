
/*
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    Union of Two Linked Lists
EasyAccuracy: 58.65%Submissions: 33K+Points: 2

Given two linked lists, your task is to complete the function makeUnion(), that returns the union list of two linked lists. This union list should include all the distinct elements only and it should be sorted in ascending order.

Example 1:

Input:
L1 = 9->6->4->2->3->8
L2 = 1->2->8->6->2
Output: 
1 2 3 4 6 8 9
Explaination: 
All the distinct numbers from two lists, when sorted forms the list in the output. 

Example 2:

Input:
L1 = 1->5->1->2->2->5
L2 = 4->5->6->7->1
Output: 
1 2 4 5 6 7
Explaination: 
All the distinct numbers from two lists, when sorted forms the list in the output.

Your Task:
The task is to complete the function makeUnion() which makes the union of the given two lists and returns the head of the new list.

Expected Time Complexity: O((N+M)*Log(N+M))
Expected Auxiliary Space: O(N+M)

Constraints:
1<=N,M<=104
View Bookmarked Problems 
*/

class Sol
{
	public static Node findUnion(Node head1,Node head2)
	{
	    //Add your code here.
	    Set<Integer> set=new LinkedHashSet<>();
	    
	    Node temp=head1;
	    while(temp!=null){
	    set.add(temp.data);
	        temp=temp.next;
	    }
	    
	    temp=head2;
	    while(temp!=null){
	    set.add(temp.data);
	        temp=temp.next;
	    }
	    Node head=null,tail=null;
	    
	    int[] arr=set.stream().mapToInt(Integer::intValue).sorted().toArray();

	    for(int i:arr){
	        Node t=new Node(i);
	        if(head==null){
	            head=t;
	            tail=t;
	        }
	        else{
	            tail.next=t;
	            tail=t;
	        }
	    }
	    
	    return head;
	}
}
