/*
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/
class Solution {
    boolean isCircular(Node head) {
        // code here
        if(head==null){
            return true;
        }
        Node temp= head.next;
        while(temp!=null && temp!=head){
            temp=temp.next;
        }
        return(temp==head);
    } 
}