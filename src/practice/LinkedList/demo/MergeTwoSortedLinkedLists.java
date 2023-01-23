package practice.LinkedList.demo;


/**
 * You are given the heads of two sorted linked lists list1 and list2.
 *
 * Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
 *
 * Return the head of the merged linked list.
 *
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 */
public class MergeTwoSortedLinkedLists {
    public static void main(String[] args) {

        Node head1=null;
        Node head2=null;
        //Linked List 1
        head1 = CustumLinkedList.addElement(head1, 5);
       //head1 = CustumLinkedList.addElement(head1, 2);
        //head1 = CustumLinkedList.addElement(head1, 4);

        //Linked List 1
        head2 = CustumLinkedList.addElement(head2, 1);
        head2 = CustumLinkedList.addElement(head2, 2);
        head2 = CustumLinkedList.addElement(head2, 4);


        Node result=mergeTwoLists(head1,head2);
        CustumLinkedList.printLinkedList(result);

    }

    public static Node mergeTwoLists(Node head1, Node head2) {

        Node head = null;

        if (head1 == null && head2 != null) {
            return head2;
        }
        if (head2 == null && head1 != null) {
            return head1;
        }


        while (head1 != null || head2 != null) {

            if ((head1 != null && head2 != null) && (head1.data > head2.data || head1.data == head2.data)) {
                head = CustumLinkedList.addElement(head, head2.data);
                head2 = head2.next;
            } else if ((head1 != null && head2 != null) && (head1.data < head2.data)) {
                head = CustumLinkedList.addElement(head, head1.data);
                head1 = head1.next;
            } else if (head1 == null) {
                head = CustumLinkedList.addElement(head, head2.data);
                head2 = head2.next;
            } else if (head2 == null) {
                head = CustumLinkedList.addElement(head, head1.data);
                head1 = head1.next;
            }
        }
        return head;

    }


}
