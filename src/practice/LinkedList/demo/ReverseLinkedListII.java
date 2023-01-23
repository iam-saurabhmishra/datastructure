package practice.LinkedList.demo;


/**
 * Given the head of a singly linked list and two integers left and right where left <= right,
 * reverse the nodes of the list from position left to position right, and return the reversed list.
 *
 * Input: head = [1,2,3,4,5], left = 2, right = 4
 * Output: [1,4,3,2,5]
 */
public class ReverseLinkedListII {
    public static void main(String[] args) {

        Node head1=null;
        Node head2=null;
        //Linked List 1
        head1 = CustumLinkedList.addElement(head1, 1);
        head1 = CustumLinkedList.addElement(head1, 2);
        head1 = CustumLinkedList.addElement(head1, 3);
        head1 = CustumLinkedList.addElement(head1, 4);
        head1 = CustumLinkedList.addElement(head1, 5);
        head1=reverseBetween(head1,3,4);
        CustumLinkedList.printLinkedList(head1);
    }

    public static Node reverseBetween(Node head, int left, int right) {

        if(head==null || head.next==null){
            return head;
        }
        Node temp=head;
        Node temp1=head;
        Node remaining=null;
        Node rList=null;
        int leftCount=1;
        int rightCount=1;
        while (leftCount!=left && temp.next!=null){
            leftCount++;
            temp=temp.next;
        }
        while (rightCount!=right && temp1.next!=null){
            rightCount++;
            temp1=temp1.next;
        }
        remaining=temp1.next;
        temp1.next=null;
        rList=reverseLinkedList(temp);
        Node temp2=null;
        if(temp!=head){
            head.next=rList;
            temp2=head;
        }
        else{
            head=rList;
            temp2=rList;
        }
        while(temp2.next!=null){
            temp2=temp2.next;
        }
       temp2.next=remaining;
        return head;
    }

    public static Node reverseLinkedList(Node head) {
        // System.out.println("REVERSED LINKED LIST IS :");
        Node curr = head;
        Node next = head;
        Node pre = null;
        while (curr.next != null) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        curr.next = pre;
        head = curr;
        return head;
    }
}
