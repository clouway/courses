package com.valentin;


import java.util.Vector;

public class Tree {

    private Vector<Node> nodesVector=new Vector();

    private Node rootNode=new Node();
    private boolean flagContains;

    public Tree(){}

    /**
     *
     * @param x
     */
    public void add(int x){
        if (!nodesVector.isEmpty()){
            if(contains(x)){
                return;
            }

            Node currentNode=new Node(x);

            currentNode.parent=null;
            currentNode.leftChild=null;
            currentNode.rightChild=null;

            currentNode.indexInVector =nodesVector.size();
            nodesVector.addElement(currentNode);

            arrangeNodes(currentNode,rootNode);

        }else {
            Node currentNode=new Node(x);
            currentNode.indexInVector = 0;
            rootNode=currentNode;
            nodesVector.addElement(currentNode);
            return;
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


             /*///////////////////////////////////////////////
            if(nodesVector.size()==2){                     //Chooses the bigger value from the first
                currentNode=nodesVector.get(1);            //2 inputs for root, can be removed
                currentRoot=nodesVector.get(0);            //(for a better tree structure)
                if(currentNode.value>currentRoot.value){
                    currentNode.leftChild=currentRoot;
                    rootNode=currentNode;
                    nodesVector.set(rootNode.indexInVector,rootNode);
                    currentRoot.parent=currentNode;
                    nodesVector.set(currentRoot.indexInVector,currentRoot);
                    return;
                }else {
                    currentRoot.leftChild=currentNode;
                    rootNode=currentRoot;
                    nodesVector.set(rootNode.indexInVector,rootNode);
                    currentNode.parent=currentRoot;
                    nodesVector.set(currentNode.indexInVector,currentNode);
                    return;
                }
            }////*//////////////////////////////////////////end



        if (currentRoot.value>currentNode.value){
            if (currentRoot.leftChild!=null){

                arrangeNodes(currentNode,currentRoot.leftChild);
            }else {
                currentRoot.leftChild=currentNode;
                currentNode.parent=currentRoot;
                nodesVector.set(currentNode.indexInVector,currentNode);
                nodesVector.set(currentRoot.indexInVector,currentRoot);
            }
        }else if (currentRoot.rightChild!=null) {

            arrangeNodes(currentNode,currentRoot.rightChild);
        }else {

            currentRoot.rightChild=currentNode;
            currentNode.parent=currentRoot;
            nodesVector.set(currentNode.indexInVector,currentNode);
            nodesVector.set(currentRoot.indexInVector,currentRoot);
        }
    }


    public void printTree(){
        for(int i=0;i<=(nodesVector.size()-1);i++){
            System.out.println("-----------------");
            Node tempNode=nodesVector.get(i);
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
        Integer indexInVector;

        private Node(){}

        private Node(int value){
            this.value=value;
        }
    }
}