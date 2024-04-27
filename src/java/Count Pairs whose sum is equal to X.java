
// your task is to complete this function

/*
class Node
{
    int data;
    Node next;

    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class Solution {

    /*
    use a hash set for constant time access of the remaining difference element look for each element in l1 in l2
    Time : O( len(head1) + len(head2))
    Space : O(len(head1))
    */
    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,
                          int x) {

        int c=0;
    
        Set<Integer> hSet=new HashSet<>();
        
        for(int  i: head1 ){
                hSet.add(x-i);
        }

        for(int j: head2) {
            if(hSet.contains(j)) c++;
        }
        return c;
    }
}

/*

Count Pairs whose sum is equal to X
EasyAccuracy: 39.61%Submissions: 84K+Points: 2
Share your experience with the world! Submit your admission, interview, campus or any other experience and reach an audience of millions today!

banner
Given two linked list head1 and head2 with distinct elements, determine the count of all distinct pairs from both lists whose sum is equal to the given value x.

Note: A valid pair would be in the form (x, y) where x is from first linked list and y is from second linked list.

Example 1:

Input:
head1 = 1->2->3->4->5->6
head2 = 11->12->13
x = 15
Output: 3
Explanation: There are total 3 pairs whose sum is 15 : (4,11) , (3,12) and (2,13)
Example 2:

Input:
head1 = 7->5->1->3
head2 = 3->5->2->8
x = 10
Output: 2
Explanation: There are total 2 pairs whose sum is 10 : (7,3) and (5,5)
Your Task:
You only need to implement the given function countPairs() that take two linked list head1 and head2 and return the count of distinct pairs whose sum is equal to x.

Expected Time Complexity: O(length(head1)+lenght(head2)).
Expected Auxiliary Space: O(length(head1)) or O(length(head2)).

Constraints:
1<=length(head1), lenght(head2)<=105
1 <= Value of elements of  linked lists <= 109
1<= x <= 109
Note : All elements in each linked list are unique.


*/
