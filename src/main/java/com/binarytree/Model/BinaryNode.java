package com.binarytree.Model;

public class BinaryNode {

    public int value;
    public BinaryNode left;
    public BinaryNode right;
    public int height;

    public BinaryNode(int value) {
        this.value = value;
        left = right = null;
    }


}
