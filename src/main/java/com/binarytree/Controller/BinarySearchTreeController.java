package com.binarytree.Controller;

import com.binarytree.Model.BinarySearchTree;
import com.binarytree.Repository.BinarySearchTreeRepository;
import com.binarytree.Service.BinarySearchTreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class BinarySearchTreeController {

    @Autowired
    private BinarySearchTreeService binarySearchTreeService;

    @GetMapping("/enter-numbers")
    public String getHomeResponse() {
        return "Hello World";
    }

    @GetMapping("binarySearchTrees")
    public List<BinarySearchTree> getAllBinarySearchTrees(){

        return binarySearchTreeService.getAllBinarySearchTrees();

    }

    @PostMapping("newBinarySearchTree")
    public BinarySearchTree newBinarySearchTree(@RequestBody ArrayList<Integer> userNumbers){
        return binarySearchTreeService.addBinarySearchTree(userNumbers);
    }

}
