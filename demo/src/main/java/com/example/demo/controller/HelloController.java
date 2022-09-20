package com.example.demo.controller;

import com.example.demo.dao.PetDao;
import com.example.demo.domain.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {

    @Autowired
    PetDao petDao;

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }

    @RequestMapping("/insert")
    public String insertDB(@RequestBody Map<String, Object> params) {
        System.out.println(params);
        String name = (String) params.get("name");
        String color = (String) params.get("color");

        Pet pet = new Pet();
        pet.setPname(name);
        pet.setColor(color);
        petDao.save(pet);
        return "插入成功！";
    }

    @RequestMapping("/update")
    public String updateDB() {
        petDao.

    }

}