package com.binarytree.Model;

import jakarta.persistence.*;

import java.util.Arrays;
import java.util.LinkedList;

@Entity
public class BinaryTreeInput {

    @Id
    @SequenceGenerator(name = "input_sequence", sequenceName = "input_sequence", allocationSize = 1, initialValue=1)
    @GeneratedValue(generator = "input_sequence")
    private Long id;

    private LinkedList<Integer> userNumbers;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "binary_search_tree_id")
    private BinarySearchTree binarySearchTree;

    public BinaryTreeInput(LinkedList<Integer> numbersInputFromUser) {
        this.userNumbers = numbersInputFromUser;
        this.binarySearchTree = new BinarySearchTree();
        for (Integer userNumber : numbersInputFromUser) {
            this.binarySearchTree.insert(userNumber);
        }
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LinkedList<Integer> getUserNumbers() {
        return userNumbers;
    }

    public void setUserNumbers(LinkedList<Integer> userNumbers) {
        this.userNumbers = userNumbers;
    }

    public BinarySearchTree getBinarySearchTree() {
        return binarySearchTree;
    }

    public void setBinarySearchTree(BinarySearchTree binarySearchTree) {
        this.binarySearchTree = binarySearchTree;
    }

    public static void main(String[] args) {

        BinaryTreeInput btInput = new BinaryTreeInput(new LinkedList<>(Arrays.asList(10, 50, 80, 100, 20, 800)));
        btInput.setId(1L);

        btInput.binarySearchTree.preorder();




    }
}
