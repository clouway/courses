package com.valentin;


import java.util.Vector;

public class HTree {
    Vector<Node> nodesVector=new Vector();
    Node rootNode=new Node();
    boolean flagContains;

    public HTree(){}

    /**
     *
     * @param object
     * @param value
     */
    public void add(Object object,int value){
        Node currentNode=new Node(object,value);
        if (!nodesVector.isEmpty()){
            if (contains(value)){
                System.out.println("this value is already used");
                return;
            }else {
                currentNode.indexInVector=nodesVector.size();
                nodesVector.addElement(currentNode);
                arrangeNodes(currentNode,rootNode);
            }
        }else {
            currentNode.value=value;
            currentNode.object=object;
            currentNode.indexInVector = 0;
            rootNode=currentNode;
            nodesVector.addElement(rootNode);
        }}

    /**
     *
     * @param currentNode
     * @param currentRoot
     */
    private void arrangeNodes(Node currentNode,Node currentRoot){
        if (currentRoot.value>currentNode.value){
            if (currentRoot.leftChild==null){
                currentRoot.leftChild=currentNode;
                currentNode.parent=currentRoot;
                nodesVector.set(currentRoot.indexInVector,currentRoot);
                nodesVector.set(currentNode.indexInVector,currentNode);
            }else {
                arrangeNodes(currentNode,currentRoot.leftChild);
            }
        }else {
            if (currentRoot.rightChild==null){
                currentRoot.rightChild=currentNode;
                currentNode.parent=currentRoot;
                nodesVector.set(currentRoot.indexInVector,currentRoot);
                nodesVector.set(currentNode.indexInVector,currentNode);
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

    public void printTree(){
        for(int i=0;i<=(nodesVector.size()-1);i++){
            System.out.println("-----------------");
            Node tempNode=nodesVector.get(i);
            System.out.println("Node: "+tempNode.object);
            System.out.println("NodeValue: "+tempNode.value);
            if(tempNode.parent!=null) System.out.println("Parrent: "+tempNode.parent.value);
            if (tempNode.leftChild!=null) System.out.println("LeftCh: "+tempNode.leftChild.value);
            if (tempNode.rightChild!=null) System.out.println("rightCh: "+tempNode.rightChild.value);
            System.out.println("-----------------");
            System.out.println("\n");
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

        System.out.println(root.object);

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
        Integer indexInVector;
        Node leftChild;
        Node rightChild;
        Node parent;
        int value;
        Object object;

        private Node(){}

        private Node(Object object,int value){
            this.object=object;
            this.value=value;
        }
    }
}

