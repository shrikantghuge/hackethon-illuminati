package com.hsbc.hackethon.controller;


import com.hsbc.hackethon.service.QueryExecutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class QueryExecutorController {

    @Autowired
    private QueryExecutorService queryExecutorService;

    @PostMapping("/executeQuery")
    public List<Map<String, Object>> executeQuery(@RequestBody String sql) {
        return queryExecutorService.executeQuery(sql);
    }
}
