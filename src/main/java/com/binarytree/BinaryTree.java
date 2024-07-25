package com.binarytree;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class BinaryTree {

    @Id
    @SequenceGenerator(name = "binaryTree_sequence", sequenceName = "binaryTree_sequence", allocationSize = 1, initialValue=1)
    @GeneratedValue(generator = "binaryTree_sequence")
    private long id;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }




}
