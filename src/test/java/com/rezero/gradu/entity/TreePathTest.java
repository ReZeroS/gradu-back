package com.rezero.gradu.entity;

import java.util.HashMap;

public class TreePathTest {

    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }
    }


    private int maxLen;
    private HashMap<Integer, Integer> map = new HashMap<>(16);


    private void initMap(int []array){
        for (int i = 0; i < array.length; ++i){
            map.put(array[i], 1);
        }
    }




    public void getPath(Node node, int []array){
        this.maxLen = 0;
        initMap(array);
        dfs(node, maxLen);

    }



    private void dfs(Node node, int len) {
        if (node == null){
            return ;
        }
// if find the node, calc the path len
        if (map.get(node.val) != null){
            len++;
            if (len > maxLen){
                maxLen = len;
            }
        }
        else {
            len = 0;
        }
        dfs(node.left, len);
        dfs(node.right, len);


    }

    public static void test(){
        int array[] = {3, 6, 7, 12};
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(8);
        root.left.left.right = new Node(9);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(11);
        root.right.right.right = new Node(12);
        TreePathTest tree = new TreePathTest();
        tree.getPath(root, array);
        System.out.println(tree.maxLen);
    }


    public static void main(String[] args) {
        test();
    }


}
