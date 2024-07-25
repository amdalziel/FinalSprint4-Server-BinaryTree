package com.binarytree;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class BinaryTreeController {

    @Autowired
    private BinaryTreeRepository binaryTreeRepository;

    @GetMapping("/enter-numbers")
    public String getHomeResponse() {
        return "Hello World";
    }

}
