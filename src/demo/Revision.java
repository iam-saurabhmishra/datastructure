package demo;


import demo.Pair;
import practice.tree.demo.TreeDemo;

import java.util.*;

public class Revision {
     //This class is for revision purpose
    public static int leftMaxLevel=1;

    public static void main(String[] args) {
        //TOP VIEW OF TREE
        Tree root=null;
        root=insertNode(root,10);
        root=insertNode(root,7);
        root=insertNode(root,15);
        root=insertNode(root,5);
        root=insertNode(root,18);
        root=insertNode(root,16);
        root=insertNode(root,7);
        root=insertNode(root,9);
        //printTopViewTree(root);
        //levelOrderTraversal(root);
        //System.out.println("Height Of Tree : "+getHeightOfTree(root));
        //int[] arr={1,2,3,4,5};
        //preOrderTraversal(arrayToBST(arr,0,arr.length-1));
        //System.out.println("");
        //preOrderTraversal(root);
       // printZizZag(root);
        //int[][] arr = {{39,70,1},{13,39,1},{85,74,1},{74,13,1},{38,82,1},{82,85,1}};
       // root=createBinaryTree(arr);
        List<Integer> list=delNodes(root,7);
        System.out.println(list);
        preOrderTraversal(root);


    }

    public static void printTopViewTree(Tree root){

        Queue<Pair<Tree, Integer>> q=new LinkedList<>();
        SortedMap<Integer,Integer> map=new TreeMap<>();
        q.add(new Pair<Tree, Integer>(root,0));
        while (!q.isEmpty()){
            Tree temp=q.peek().getKey();
            int hd =q.peek().getValue();
            q.poll();
            if(!map.containsKey(hd)){
                map.put(hd,temp.data);
            }
            if(temp.left!=null){
                q.add(new Pair<>(temp.left,hd-1));
            }
            if(temp.right!=null){
                q.add(new Pair<>(temp.right,hd+1));
            }
        }

       map.keySet().stream().forEach((k)-> System.out.print(" "+map.get(k)+" "));
    }

    //RIGHT VIEW TRAVERSAL

    public static void rightViewTraversal(Tree root,int level){

        if(root==null){
            return;
        }
        if(leftMaxLevel==level){
            System.out.println(" "+root.data);
            leftMaxLevel++;
        }
        rightViewTraversal(root.right,level+1);
        rightViewTraversal(root.left,level+1);
    }

    //LEFT VIEW TRAVERSAL

    public static void leftViewTraversal(Tree root,int level){

        if(root==null){
            return;
        }
        if(leftMaxLevel==level){
            System.out.println(" "+root.data);
            leftMaxLevel++;
        }
        leftViewTraversal(root.left,level+1);
        leftViewTraversal(root.right,level+1);


    }

    //LEVEL ORDER TRAVERSAL

    public static void levelOrderTraversal(Tree root){

        Queue<Tree> q=new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()){
            Tree temp=q.poll();
            System.out.print(" "+temp.data);
            if(null!=temp.left)
                q.add(temp.left);
            if(null!=temp.right)
            q.add(temp.right);

        }
    }

    // HEIGHT OF A TREE
    public static int getHeightOfTree(Tree root){
        if(root==null){
            return 0;
        }
        return Math.max(getHeightOfTree(root.left),getHeightOfTree(root.right))+1;
    }

    //ARRAY TO BST
    public static Tree arrayToBST(int[] arr, int s, int e) {

        if(s>e){
            return null;
        }

        int mid = (s + e) / 2;
        Tree root = new Tree(arr[mid]);
        root.left = arrayToBST(arr, s, mid - 1);
        root.right = arrayToBST(arr, mid + 1, e);
        return root;
}

    //ZIG ZAG TRAVERSAL OF TREE

    public static void printZizZag(Tree root){
        int level=1;
        Stack<Tree> cs=new Stack<>();
        Stack<Tree> ns=new Stack<>();

        cs.push(root);

        while(!cs.isEmpty()){
            Tree temp=cs.pop();
            System.out.print("" +temp.data+" ");

            if(level % 2 != 0){
                if(temp.left!=null){
                    ns.push(temp.left);
                }
                if(temp.right!=null){
                    ns.push(temp.right);
                }
            }
            if(level % 2 == 0){
                if(temp.right!=null){
                    ns.push(temp.right);
                }
                if(temp.left!=null){
                    ns.push(temp.left);
                }
            }

            if(cs.isEmpty()){
                Stack<Tree> t=cs;
                cs=ns;
                ns=t;
                level++;
            }
        }
    }

    /**
     * Input: descriptions = [[20,15,1],[20,17,0],[50,20,1],[50,80,0],[80,19,1]]
     *                       [[39,70,1],[13,39,1],[85,74,1],[74,13,1],[38,82,1],[82,85,1]]
     * Output: [50,20,80,15,17,19]
     * @param arr
     * @return
     */
    public static Tree createBinaryTree(int[][] arr) {
        Tree root = null;
        Map<Integer, Tree> map = new HashMap<>();
        Set<Integer> childSet=new HashSet<>();
        for (int i = 0; i <arr.length ; i++) {
            childSet.add(arr[i][1]);
        }
        for (int i = 0; i <arr.length ; i++) {
            boolean isLeft=(1==arr[i][2])?true:false;

            Tree node=creteTree(arr[i][0],arr[i][1],isLeft,map);

            if(null==root || arr[i][1]==root.data){
                root=node;
            }
        }
        int rootData=getRootData(arr,childSet);
        return map.get(rootData);
    }

    private static int getRootData(int[][] arr, Set<Integer> childSet) {
        int rootData=-1;
        for (int i = 0; i <arr.length ; i++) {
            if(!childSet.contains(arr[i][0])){
                return arr[i][0];

            }
        }
        return rootData;
    }

    private static Tree creteTree(int parent, int child, boolean isLeft, Map<Integer, Tree> map) {

        Tree node = null;
        if (map.containsKey(parent)) {
            node = map.get(parent);
        } else {
            node = new Tree(parent);
            map.put(parent,node);
        }

        if (isLeft) {
            if (map.containsKey(child)) {
                Tree childNode = map.get(child);
                node.left = childNode;
            } else {
                Tree childNode = new Tree(child);
                node.left = childNode;
                map.put(child,childNode);
            }
        } else {
            if (map.containsKey(child)) {
                Tree childNode = map.get(child);
                node.right = childNode;
            } else {
                Tree childNode = new Tree(child);
                node.right = childNode;
                map.put(child,childNode);
            }
        }

        return node;
    }


    /*public static Tree createBinaryTree1(int[][] arr) {
        Tree root = null;
        Map<Integer, Tree> map = new HashMap<>();
        for (int i = 0; i < arr.length - 1; i++) {
            int parentData = arr[i][0];
            if (map.containsKey(parentData)) {
                Tree node = map.get(parentData);
                if (arr[i][2] == 1) {

                    node.left = new Tree(arr[i][1]);
                } else {
                    node.right = new Tree(arr[i][1]);
                }
            }
            else{
                Tree node=new Tree(parentData);
                if (arr[i][2] == 1) {
                    node.left = new Tree(arr[i][1]);
                } else {
                    node.right = new Tree(arr[i][1]);
                }
            }
        }
        return root;
    }

*/

    //Saurabh
    public static List<Integer> delNodes(Tree root, int target) {


        List<Integer> res=new ArrayList<>();
        treeHelper(root,res,target);
        if(root.data!=target){
            res.add(root.data);
        }
        return res;
    }

    public static Tree treeHelper(Tree root,List<Integer> res,int target){

        if(root==null){
            return null;
        }

         root.left=treeHelper(root.left,res,target);
         root.right=treeHelper(root.right,res,target);

        if(target==root.data){

            if(root.left!=null){
                res.add(root.left.data);
            }
            if(root.right!=null){
                res.add(root.right.data);
            }

            return null;

        }
        return root;
    }





    public static Tree insertNode(Tree root,int data){
        if(root==null)
            return new Tree(data);
        else if(root.data>data)
            root.left=insertNode(root.left,data);
        else
            root.right=insertNode(root.right,data);
        return root;
    }

    public static void preOrderTraversal(Tree root){
        if(root==null){
            return;
        }
        System.out.print(" "+root.data);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
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
