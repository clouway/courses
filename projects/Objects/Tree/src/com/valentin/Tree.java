package com.valentin;


public class Tree {


    private Node rootNode=new Node(null);
    private boolean flagContains;


    public Tree(){}

    /**
     *
     * @param x
     * @return
     */
    public boolean add(int x){

        if (rootNode.value!=null){
            if(contains(x)){
                return false;
            }

            Node currentNode=new Node(x);


            currentNode.parent=null;
            currentNode.leftChild=null;
            currentNode.rightChild=null;

            arrangeNodes(currentNode,rootNode);
            return true;

        }else {
            Node currentNode=new Node(x);
            rootNode=currentNode;
            return true;
        }
    }

    /**
     *
     * @param c
     * @param r
     */
    private void arrangeNodes(Node c,Node r){

        Node currentRoot=r;
        Node currentNode=c;

        if (currentRoot.value>currentNode.value){
            if (currentRoot.leftChild!=null){

                arrangeNodes(currentNode,currentRoot.leftChild);
            }else {
                currentRoot.leftChild=currentNode;
                currentNode.parent=currentRoot;
            }
        }else if (currentRoot.rightChild!=null) {

            arrangeNodes(currentNode,currentRoot.rightChild);
        }else {

            currentRoot.rightChild=currentNode;
            currentNode.parent=currentRoot;
        }
    }


    public void print(){
        printHelper(rootNode);

    }

    /**
     *
     * @param root
     */
    private void printHelper(Node root){
        if (root==null)return;
        printHelper(root.leftChild);

        System.out.println(root.value);

        printHelper(root.rightChild);
    }


    /**
     *
     * @param root
     * @param x
     */
    private void containsHelper(Node root,int x){
        if (root.value==x){
            flagContains=true;

        }else if (root.value>x){
            if (root.leftChild!=null){
                containsHelper(root.leftChild,x);
            }
        }else {
            if (root.rightChild!=null){
                containsHelper(root.rightChild,x);
            }
        }
    }


    /**
     *
     * @param x
     * @return
     */
    public boolean contains(int x){
        flagContains=false;
        containsHelper(rootNode,x);
        return flagContains;
    }



    private class Node{
        Node leftChild;
        Node rightChild;
        Node parent;
        Integer value;

        private Node(){}

        private Node(Integer value){
            this.value=value;
        }
    }
}
