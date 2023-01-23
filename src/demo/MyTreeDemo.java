package demo;

import demo.Pair;

import java.util.*;

public class MyTreeDemo {


    public static void main(String[] args) {
        int data[]={1,2,3,4,5,6,7};
        TreeNode root=TreeNode.constructTree(data);
        List<List<TreeNode>> list=TreeNode.getTreeNodeVerticalOrder(root);
        TreeNode.printTree(list);

    }


}


class TreeNode {

    TreeNode left;
    TreeNode right;
    int data;

    public TreeNode(int data) {
        this.data = data;
        this.left=null;
        this.right=null;
    }




    public static TreeNode constructTree(int[] data){

        TreeNode root=new TreeNode(data[0]);
        TreeNode temp=root;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int count=1;
        while(!q.isEmpty() && count<data.length){
            temp=q.poll();
            if(temp.left==null){
                temp.left=new TreeNode(data[count]);
                count++;
                q.add(temp.left);
            }
            else if(temp.right==null){
                temp.right=new TreeNode(data[count]);
                count++;
                q.add(temp.right);
            }
        }

        return root;
    }

    public static List<List<TreeNode>> getTreeNodeVerticalOrder(TreeNode root){

        Queue<Pair<TreeNode,Integer>> q=new LinkedList<>();
        SortedMap<Integer,TreeNode> map=new TreeMap<>();
        q.add(new Pair<>(root,0));
        List<List<TreeNode>> res=new ArrayList<>();

        while (!q.isEmpty()){

            TreeNode temp=q.peek().getKey();
            int hd=q.peek().getValue();
            q.poll();
            List<TreeNode> t1=new ArrayList<>();
            if(!map.containsKey(hd)){
                List<TreeNode> t=new ArrayList<>();
                t.add(temp);
                res.add(t);
            }
            else {
                t1.add(temp);
            }
            if(temp.left!=null){
                q.add(new Pair<>(root.left,hd-1));
            }
            if(temp.right!=null){
                q.add(new Pair<>(root.right,hd+1));
            }

            res.add(t1);
        }
return res;
    }

    public static void printTree(List<List<TreeNode>> lists){

        for (List<TreeNode> nodes:lists){
            for(TreeNode node:nodes){
                System.out.println(node.data);
            }
        }
    }

}
