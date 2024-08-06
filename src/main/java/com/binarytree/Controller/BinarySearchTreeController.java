package com.binarytree.Controller;

import com.binarytree.Model.BinarySearchTree;
import com.binarytree.Repository.BinarySearchTreeRepository;
import com.binarytree.Service.BinarySearchTreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class BinarySearchTreeController {

    @Autowired
    private BinarySearchTreeService binarySearchTreeService;

    @GetMapping("/enter-numbers")
    public String getHomeResponse() {
        return "index";
    }

    @GetMapping("/show-result")
    public String getResultPage() {
        return "result";
    }

    @GetMapping("/binarySearchTrees")
    public List<BinarySearchTree> getAllBinarySearchTrees(){

        return binarySearchTreeService.getAllBinarySearchTrees();

    }

    @PostMapping("/process-numbers")
    public RedirectView processNumbers(@RequestParam("nodeValues") String nodeValues) {

        List<Integer> nodeList = Arrays.stream(nodeValues.split(","))
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        binarySearchTreeService.addBinarySearchTree(nodeList);

        return new RedirectView("/show-result");
    }

}
