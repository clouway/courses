package com.valentin;


public class HTree {

    private Node rootNode=new Node();
    private boolean flagContains;

    public HTree(){}

    /**
     *
     * @param key
     * @param value
     * @return
     */
    public boolean add(Integer key,Object value){
        Node currentNode=new Node(key,value);
        if (rootNode.value!=null){
            if (contains(key)){
                return false;
            }else {
                arrangeNodes(currentNode,rootNode);
                return true;
            }
        }else {
            currentNode.value=value;
            currentNode.key=key;
            rootNode=currentNode;
            return true;
        }}

    /**
     *
     * @param currentNode
     * @param currentRoot
     */
    private void arrangeNodes(Node currentNode,Node currentRoot){
        if (currentRoot.key>currentNode.key){
            if (currentRoot.leftChild==null){
                currentRoot.leftChild=currentNode;
                currentNode.parent=currentRoot;

            }else {
                arrangeNodes(currentNode,currentRoot.leftChild);
            }
        }else {
            if (currentRoot.rightChild==null){
                currentRoot.rightChild=currentNode;
                currentNode.parent=currentRoot;
            }else {
                arrangeNodes(currentNode,currentRoot.rightChild);
            }
        }
    }

    /**
     *
     * @param root
     * @param x
     */
    private void containsHelper(Node root,int x){
        if (root.key==x){
            flagContains=true;

        }else if (root.key>x){
            if (root.leftChild!=null){
                containsHelper(root.leftChild,x);
            }
        }else {
            if (root.rightChild!=null){
                containsHelper(root.rightChild,x);
            }
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
        Integer key;
        Object value;

        private Node(){}

        private Node(Integer key, Object value){
            this.key=key;
            this.value=value;
        }
    }
}