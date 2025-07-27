// function Template for Java

/* linked list node class:

class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

*/

class Solution {
    Node reverseList(Node head) {
        Node temp=head;
        Node prev=null;
        Node next=null;
       while(temp!=null){
           next=temp.next;
           temp.next=prev;
           prev=temp;
           temp=next;
       }
       return prev;
    }
  
}