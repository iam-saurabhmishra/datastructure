package practice.LinkedList.demo;

import java.util.LinkedList;

public class AdditionOfTwoLinkedList {

    public static void main(String[] args) {
        Node head1=null;
        Node head2=null;
        //Linked List 1
        head1 = CustumLinkedList.addElement(head1, 8);
        head1 = CustumLinkedList.addElement(head1, 7);
        head1 = CustumLinkedList.addElement(head1, 6);
        head1 = CustumLinkedList.addElement(head1, 5);
        head1 = CustumLinkedList.addElement(head1, 4);

        //Linked List 1
        head2 = CustumLinkedList.addElement(head2, 4);
        head2 = CustumLinkedList.addElement(head2, 5);
        head2 = CustumLinkedList.addElement(head2, 6);
        head2 = CustumLinkedList.addElement(head2, 7);
        head2 = CustumLinkedList.addElement(head2, 8);

        Node result=addTwoLinkedList(head1,head2);
        CustumLinkedList.printLinkedList(result);
    }



    public static Node addTwoLinkedList(Node head1,Node head2){
        if(head1==null && head2!=null){return head2;}
        if(head2==null && head1!=null){return head1;}
        Node result=null;
        int carry=0;
        Node c1=CustumLinkedList.reverseLinkedList(head1);
        Node c2=CustumLinkedList.reverseLinkedList(head2);

        while (c1!=null || c2!=null || carry!=0 ){
            int res=carry+ ((c1!=null)?c1.data:0) +((c2!=null)?c2.data:0);
           int ld=res%10;
           carry=res/10;
            result=CustumLinkedList.addElement(result,ld);

            if(c1!=null){c1=c1.next;}
            if(c2!=null){c2=c2.next;}
        }
        return CustumLinkedList.reverseLinkedList(result);

    }
}

