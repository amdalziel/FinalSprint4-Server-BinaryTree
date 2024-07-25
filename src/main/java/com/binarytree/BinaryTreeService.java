package com.binarytree;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BinaryTreeService {

    @Autowired
    BinaryTreeRepository binaryTreeRepository;
}
