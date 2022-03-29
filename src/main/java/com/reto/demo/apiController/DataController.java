package com.reto.demo.apiController;

import java.util.ArrayList;
import java.util.Map;

import com.reto.demo.apiService.DataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {
    @Autowired
    DataService dataService;

    @GetMapping
    public Map<String, ArrayList<String>> getData(){
        return  dataService.listarData();
    }

}
