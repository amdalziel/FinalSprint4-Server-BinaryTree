package com.binarytree.Model;

import com.binarytree.Utility.BinaryNode;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class BinarySearchTree {

    @Id
    @SequenceGenerator(name = "searchTree_sequence", sequenceName = "searchTree_sequence", allocationSize = 1, initialValue=1)
    @GeneratedValue(generator = "searchTree_sequence")
    private Long id;
//
//    private BinaryNode root;
//
//    public BinarySearchTree() {
//        this.root = null;
//    }
//
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
//
//    public BinaryNode getRoot() {
//        return root;
//    }
//
//    public void setRoot(BinaryNode root) {
//        this.root = root;
//    }
//
//    public void insert(int value) {
//        root = insertRecursion(root, value);
//    }
//
//    private BinaryNode insertRecursion(BinaryNode node, int value) {
//        if (node == null) {
//            node = new BinaryNode(value);
//            return node;
//        }
//
//        if (value <= node.value) {
//            node.left = insertRecursion(node.left, value);
//        } else if (value > node.value) {
//            node.right = insertRecursion(node.right, value);
//        }
//        return node;
//    }
//
//    public void preorder() {
//        preorderRecursion(root);
//    }
//
//    private void preorderRecursion(BinaryNode node) {
//        if (node != null) {
//            System.out.print(node.value + " ");
//            preorderRecursion(node.left);
//            preorderRecursion(node.right);
//        }
//    }
//
//    public static void main(String[] args) {
//
//        BinarySearchTree tree = new BinarySearchTree();
//
//        // Inserting nodes
//        tree.insert(50);
//        tree.insert(10);
//        tree.insert(20);
//        tree.insert(5);
//        tree.insert(70);
//        tree.insert(60);
//        tree.insert(80);
//
//        tree.preorder();
//    }
}
