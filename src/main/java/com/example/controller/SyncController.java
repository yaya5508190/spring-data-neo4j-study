package com.example.controller;

import com.example.model.AssetVMS;
import com.example.repository.jdbc.VMSRepository;
import com.example.repository.neo4j.VMSNeo4jRepository;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/sync")
public class SyncController {
    @Resource
    private VMSRepository vmsRepository;

    @Resource
    private VMSNeo4jRepository vmsNeo4jRepository;

    @GetMapping(value = "/vms")
    String syncVMS() {
        vmsNeo4jRepository.saveAll( vmsRepository.findAll());
        return "success";
    }
}
