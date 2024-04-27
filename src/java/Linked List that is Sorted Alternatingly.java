
/*
class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    
    /*
    collect the data in a list and sort it and assign back to it
    Time O(n) + O(nlog(n))
    Space :O(n)
    */
   public Node sort(Node head){
        //your code here, return the head of the sorted list
        List<Integer> lis=new ArrayList<>();
        Node curr=head;
        while(curr!=null){
            lis.add(curr.data);
            curr=curr.next;
        }
        Collections.sort(lis);
        curr=head;
        for(int i : lis){
            curr.data=i;
            curr=curr.next;
        }
        return head;
   }


}

/*

Linked List that is Sorted Alternatingly
MediumAccuracy: 33.67%Submissions: 30K+Points: 4
Share your experience with the world! Submit your admission, interview, campus or any other experience and reach an audience of millions today!

banner
You are given a Linked list of size n. The list is in alternating ascending and descending orders. Sort the given linked list in non-decreasing order.

Example 1:

Input:
n = 6
LinkedList = 1->9->2->8->3->7
Output: 1 2 3 7 8 9
Explanation: 
After sorting the given list will be 1->2->3->7->8->9.
Example 2:

Input:
n = 5
LinkedList = 13->99->21->80->50
Output: 13 21 50 80 99
Explanation:
After sorting the given list will be 13->21->50->80->99.
Your Task:
You do not need to read input or print anything. The task is to complete the function sort() which should sort the linked list of size n in non-decreasing order. 

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1 <= Number of nodes <= 100
0 <= Values of the elements in linked list <= 103

Company Tags

*/
