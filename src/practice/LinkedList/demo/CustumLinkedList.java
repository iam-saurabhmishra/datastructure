package practice.LinkedList.demo;


import java.util.ArrayList;
import java.util.List;

public class CustumLinkedList {

    public static void main(String[] args) {
        Node head = null;
        Node head1 = null;
        //List 1
        head = addElement(head, 10);
        head = addElement(head, 20);
        head = addElement(head, 30);
        head = addElement(head, 40);
        head = addElement(head, 50);
        //List 2
        //un-comment line 20-30 to execute line 45
        /*head1 = addElement(head1, 80);
        head1 = addElement(head1, 60);
        Node temp = head1;
        Node node = head;
        while (node.data != 40) {
            node = node.next;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node; */
        //printLinkedList(head);
        //System.out.println("Middle Element -> "+getMiddleElement(head));
        //head=deleteMiddleNode(head);
        // printLinkedList(head);
        //printReverseWithoutReversing(head);
        //head=reverseLinkedList(head);
        //deleteDuplicateNodeFromSortedLL(head);
        //deleteDuplicateNodeFromUnsortedLL(head);
        //printLinkedList(head);
        //System.out.println(detectLoop(head));
        //head=removeLoop(head);
        printLinkedList(head);
        //printLinkedList(head1);
        // System.out.println(detectLoop(head));
        //System.out.println("Intersection Point is : "+getIntersectionPoint(head,head1));
        //System.out.println(isPalindrome(head));
        //head=swapkthnode(head,5,2);
        head=printOddEvenLL(head);
        printLinkedList(head);




    }

    //PRINT GIVEN LINKED LIST
    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("");
    }

    //ADD AN NODE IN A LINKED LIST

    public static Node addElement(Node head, int data) {

        if (null == head) {
            Node temp = new Node(data);
            head = temp;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(data);
        }
        return head;
    }

    // FIND THE MIDDLE ELEMENT OF LINKED LIST

    public static int getMiddleElement(Node head) {
        Node fp = head;
        Node sp = head;
        while (fp != null && fp.next != null) {
            fp = fp.next.next;
            sp = sp.next;
        }
        return sp.data;
    }

    //DELETE MIDDLE ELEMENT
    public static Node deleteMiddleNode(Node head) {
        Node fp = head;
        Node sp = head;
        Node temp = head;
        while (fp != null && null != fp.next) {
            fp = fp.next.next;
            temp = sp;
            sp = sp.next;

        }
        temp.next = sp.next;
        return head;

    }

    //PRINT LINKED LIST IN REVERSE ORDER WITHOUT REVERSING LINKED LIST

    public static void printReverseWithoutReversing(Node head) {
        if (null == head) {
            return;
        }
        Node temp = head;
        printReverseWithoutReversing(temp.next);
        System.out.print(+temp.data + " ");
    }

    //REVERSE A LINKED LIST
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

    //DELETE DUPLICATE NODE FROM LINKED LIST(SORTED)

    public static Node deleteDuplicateNodeFromSortedLL(Node head) {
        Node temp = head;
        //Node prev=head;
        while (temp.next != null) {
            if (temp.data == temp.next.data) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }

    //DELETE DUPLICATE NODE FROM LINKED LIST(UNSORTED)
    public static Node deleteDuplicateNodeFromUnsortedLL(Node head) {

        Node curr = head;
        Node prev = head;
        List<Integer> list = new ArrayList<>();
        while (curr != null) {
            if (list.contains(curr.data)) {
                curr = curr.next;
                prev.next = curr;
            } else {
                prev = curr;
                list.add(curr.data);
                curr = curr.next;
            }

        }
        return head;
    }

    //DETECT A LOOP INSIDE A LINKED LIST
    public static boolean detectLoop(Node head) {
        Node fp = head;
        Node sp = head;
        while (fp != null && fp.next != null) {
            fp = fp.next.next;
            sp = sp.next;
            if (fp == sp) {
                return true;
            }
        }
        return false;
    }

    //REMOVE A LOOP INSIDE A LINKED LIST
    public static Node removeLoop(Node head) {
        Node sp = head, fp = head;

        while (fp != null && fp.next != null) {
            fp = fp.next.next;
            sp = sp.next;
            if (fp == sp) {
                sp = head;
                while (sp.next != fp.next) {
                    sp = sp.next;
                    fp = fp.next;
                }
                fp.next = null;
            }
        }
        return head;
    }

    //FIND INTERSECTION POINT OF TWO LINKED LIST
    public static int getIntersectionPoint(Node head1, Node head2) {
        Node curr1 = head1;
        Node curr2 = head2;
        while (curr1 != curr2) {
            if (curr1 == null) {
                curr1 = head2;
            }
            if (curr2 == null) {
                curr2 = head1;
            }
            curr1 = curr1.next;
            curr2 = curr2.next;

        }
        return curr1.data;
    }

    //PRINT ODD EVEN LINKED LIST

    public static Node printOddEvenLL(Node head){

        Node odd=head;
        Node even=odd.next;
        Node temp=even;

        while(even!=null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next=temp;
        return head;

    }


    //CHECK WHETHER LINKED LIST IS PALINDROME OR NOT

    public static boolean isPalindrome(Node head){
        Node fast=head;
        Node slow=head;
        Node curr=null;
        Node pre=null;
        Node next=null;
        Node temp=head;
        while (fast!=null && fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
        }
        pre=slow;
        curr=slow.next;
        next=slow.next;


        while (curr.next!=null){
            next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
        }
        curr.next=pre;

        while (temp.next!=curr.next){
            if(temp.data!=curr.data){
                return false;
            }
            else{
                temp=temp.next;
                curr=curr.next;
            }
        }



        return true;
    }

    //SWAP Kth element from start to Kth Element form end
    public static Node swapkthnode(Node head, int num, int K)
    {
      Node temp=head;
      Node sTemp=head;
      Node eTemp=head;
        for (int i = 1; i < K; i++) {
            eTemp=eTemp.next;
            temp=temp.next;
        }

        while (eTemp.next!=null){
            eTemp=eTemp.next;
            sTemp=sTemp.next;
        }
        int data=temp.data;
        temp.data=sTemp.data;
        sTemp.data=data;
        return head;
    }

}


class Node {

    int data;
    Node next;

    public Node() {
        this.next = null;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}