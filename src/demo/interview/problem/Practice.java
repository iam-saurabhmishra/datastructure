package demo.interview.problem;

//Find circular or not

import java.util.HashMap;

public class Practice {

    public static void main(String[] args) {

       Node head=null;
       head=addElement(head,10);
       head=addElement(head,20);
       head=addElement(head,30);
       head=addElement(head,40);
       Node n=head.next;
       //printLinkedList(head);
       addElementCircular(head,n);
        System.out.println(isCircullar(head));





    }

    //add element
    public static Node addElement(Node head,int data){

        if(head==null){
            Node temp=new Node(data);
            head=temp;
        }
        else {
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            Node node=new Node(data);
            temp.next=node;
        }
        return head;
    }

    //add element
    public static Node addElementCircular(Node head,Node existingNode){


            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            Node node=existingNode;
            temp.next=node;

        return head;
    }

    //print
    public static void printLinkedList(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.println("Element is :"+temp.data);
            temp=temp.next;
        }
    }

    //find Circular
    public static boolean isCircullar(Node head){

        HashMap<Node,Boolean> hashMap=new HashMap<>();
        Node temp=head;
        while (temp!=null){
            if(hashMap.get(temp)==null){
                //System.out.println("sasa");
                hashMap.put(temp,true);
                temp=temp.next;
                //System.out.println(hashMap.entrySet());
            }
            else
                return true;
        }
        return false;
    }

}



class Node {

    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}


