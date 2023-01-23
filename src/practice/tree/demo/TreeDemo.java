package practice.tree.demo;

import demo.Pair;

import java.util.*;

public class TreeDemo {

    static int max_Level_Left=0;
    static int max_Level_Left1=1;
    static int max_Level_right=0;
    public static void main(String[] args) {
        Tree root=null;
        root=insertNode(root,7);
        root=insertNode(root,2);
        root=insertNode(root,8);
        root=insertNode(root,1);
        root=insertNode(root,5);
       /* root=insertNode(root,9);
        root=insertNode(root,12);
        root=insertNode(root,15);*/
        //preOrderTraversal(root);
        //System.out.println("");
        //levelOrderTraversal(root);
        //printRightView(root,1);
        //System.out.println("\n");
        //printLeftView(root,1);
        //System.out.println("\n");
        //System.out.println("Height of Tree is : "+getTreeHeight(root));
        int[] arr={1,2,3,4,5};
        inOrderTraversal(arrayToBST(arr,0,arr.length-1));
        //zigZagTraversal(root);
        //printTopView(root);
    }

    /**
     * INSERT A NODE INSIDE BINARY TREE
     * @param root
     * @param data
     * @return
     */
    public static Tree insertNode(Tree root,int data){
        if(root==null)
            return new Tree(data);
        else if(root.data>data)
            root.left=insertNode(root.left,data);
        else
            root.right=insertNode(root.right,data);
        return root;
    }

    /**
     * PRINT GIVEN TREE WITH IN-ORDER
     * @param root
     */
    public static void inOrderTraversal(Tree root){
        //left->root->left
        if(root==null){return;}
        inOrderTraversal(root.left);
        System.out.print(" "+root.data+" ");
        inOrderTraversal(root.right);
    }

    /**
     * PRINT GIVEN TREE WITH PRE-ORDER
     * @param root
     */
    public static void preOrderTraversal(Tree root){
        //root->left->right
        if(root==null){return;}
        System.out.print(" "+root.data+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }


    /**
     * PRINT GIVEN TREE WITH POST-ORDER
     * @param root
     */
    public static void postOrderTraversal(Tree root){
        //left->right-->root
        if(root==null){return;}
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(" "+root.data+" ");
    }

    /**
     * PRINT GIVEN TREE WITH LEVEL-ORDER
     * @param root
     */
    public static void levelOrderTraversal(Tree root){
        Queue<Tree> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Tree temp=q.peek();
            q.remove();
            System.out.print(" " +temp.data + " ");
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
        }

    }

    /**
     * PRINT GIVEN TREE WITH ZIG-ZAG
     * @param root
     */
    public static void zigZagTraversal(Tree root){
        Stack<Tree> ns=new Stack<>();
        Stack<Tree> cs=new Stack<>();
        //boolean leftToRight=true;
        int level=1;
        cs.add(root);
        while (!cs.isEmpty()){
            Tree temp=cs.peek();
            cs.pop();
            if(null!=temp){
                System.out.print(" " +temp.data + " ");

                if(level%2==0)
                {
                    if(temp.right!=null){
                        ns.add(temp.right);
                    }
                    if(temp.left!=null){
                        ns.add(temp.left);
                    }
                    //level++;
                }
                else{
                    if(temp.left!=null){
                        ns.add(temp.left);
                    }
                    if(temp.right!=null){
                        ns.add(temp.right);
                    }
                    //level++;
                }
                if(cs.isEmpty()){
                    level++;
                    Stack<Tree> t = cs;
                    cs = ns;
                    ns = t;
                }
            }


        }

    }

    public static void printLeftView(Tree root,int level){
        if(root==null){return;}
        if(max_Level_Left<level) {
            System.out.print(" " + root.data + " ");
            max_Level_Left=level;
        }
        printLeftView(root.left,level+1);
        printLeftView(root.right,level+1);
    }

    //for reference another similar approach
    public static void printLeftView1(Tree root,int level){
        if(root==null){return;}
        if(max_Level_Left1==level) {
            System.out.print(" " + root.data + " ");
            max_Level_Left1++;
        }
        printLeftView1(root.left,level+1);
        printLeftView1(root.right,level+1);
    }


    public static void printRightView(Tree root,int level){
        if(root==null){return;}
        if(max_Level_right<level){
            System.out.print(" "+ root.data+ " ");
            max_Level_right=level;
        }
        printRightView(root.right,level+1);
        printRightView(root.left,level+1);
    }

    /**
     * CALCULATE HEIGHT OF A TREE
     * @param root
     * @return
     */
    public static int getTreeHeight(Tree root){

        if(root==null){return 0;}
        int leftHeight=getTreeHeight(root.left);
        int rightHeight=getTreeHeight(root.right);
        return Math.max(leftHeight,rightHeight)+1;
    }

    public static Tree arrayToBST(int[] arr,int st,int end) {
        Tree root = null;
        while (st<=end) {
            int mid = (st + end) / 2;
            root = new Tree(arr[mid]);
            root.left = arrayToBST(arr, st, mid - 1);
            root.right = arrayToBST(arr, mid + 1, end);
            return root;
        }
        return root;
    }

    public static Tree arrayToBSTWithRecursion(int[] arr, int st, int end) {
        if (st > end) {
            return null;
        }

        int mid = (st + end) / 2;
        Tree root = new Tree(arr[mid]);

        root.left = arrayToBST(arr, st, mid - 1);
        root.right = arrayToBST(arr, mid + 1, end);

        return root;
    }

    //PRINT TOP LEVEL VIEW
    public static void printTopView(Tree root){

        Queue<Pair<Tree,Integer>> q=new LinkedList<>();
        //Map<Integer,Integer> map=new HashMap<>();
        SortedMap<Integer, Integer> map=new TreeMap<>();
        q.add(new Pair<>(root,0));
        while (!q.isEmpty()){
            Pair temp=q.peek();
            q.poll();
            Tree node=(Tree)temp.getKey();
            int hd=(int)temp.getValue();
            if(!map.containsKey(hd)){
                map.put(hd,node.data);
            }
            if(null!=node.left){
                q.add(new Pair<>(node.left,hd-1));
            }
            if(null!=node.right){
                q.add(new Pair<>(node.right,hd+1));
            }
        }

        map.entrySet().stream().forEach(e->{
            System.out.print(" "+e.getValue()+" ");
        });


    }



    // PRINT VERTICAL ORDER TRAVERSAL

    public static void printTopViewTraversal(Tree root){

        Queue<Pair<Tree,Integer>> q=new LinkedList<>();
        SortedMap<Integer, List<Integer>> map=new TreeMap<>();
        q.add(new Pair<>(root,0));
        while (!q.isEmpty()){
            Pair<Tree,Integer> p=q.poll();
            Tree temp=p.getKey();
            int hd=p.getValue();
            if(map.containsKey(hd)){
                List<Integer> list=map.get(hd);
                list.add(temp.data);
                map.put(hd,list);
            }
            else{
                map.put(hd,Arrays.asList(temp.data));
            }

            if(root.left!=null){
                q.add(new Pair(root.left,hd-1));
            }
            if(root.right!=null){
                q.add(new Pair(root.right,hd+1));
            }
        }

        map.entrySet().stream().forEach(e->{
            System.out.println("");
            printList(e.getValue());
        });

    }

    private static void  printList(List<Integer> list){
        list.stream().forEach((e)->{
            System.out.print(e+" ");
        });
    }

    public static boolean isIdenticalTree(Tree root1, Tree root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.data != root2.data) {
            return false;
        }
        return (isIdenticalTree(root1.left, root2.left) && isIdenticalTree(root1.right, root2.right));
    }

    public static boolean isMirrorTree(Tree root1, Tree root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.data != root2.data) {
            return false;
        }
        return (isMirrorTree(root1.left, root2.right) && isMirrorTree(root1.right, root2.left));
    }




}

class Tree{
    int data;
    Tree left;
    Tree right;

    public Tree(int data) {
        this.data = data;
        this.left=null;
        this.right=null;
    }
}
