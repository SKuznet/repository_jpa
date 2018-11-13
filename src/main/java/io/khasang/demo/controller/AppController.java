package io.khasang.demo.controller;

import io.khasang.demo.data.Cat;
import io.khasang.demo.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AppController {
    @Autowired
    CatService catService;

    @RequestMapping(value = "/all")
    @ResponseBody
    @CrossOrigin
    public List<Cat> getAllCats(){
        return catService.getAllCats();
    }


    @RequestMapping("/hello")
    public String getHelloPage(Model model) {
        model.addAttribute("hello", "My Spring boot app!");
        return "hello";
    }
}
