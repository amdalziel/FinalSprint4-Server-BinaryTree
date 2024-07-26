package com.binarytree.Service;

import com.binarytree.Repository.BinaryTreeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BinaryTreeService {

    @Autowired
    BinaryTreeRepository binaryTreeRepository;

    public String getHomePage() {
        return "Hello World";
    }
}
