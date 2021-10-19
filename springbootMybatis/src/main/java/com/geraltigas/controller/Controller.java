package com.geraltigas.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.geraltigas.pojo.Scinews;
import com.geraltigas.service.ScinewsService;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class Controller {

    private final ScinewsService scinewsService;

    public Controller(ScinewsService scinewsService){
        this.scinewsService = scinewsService;
    }

    @RequestMapping("/getall")
    public String getAll(){
        return JSON.toJSONString(scinewsService.getAll());
    }

    @GetMapping("/findbyuserid/{user_id}")
    public String findByUserId(@PathVariable String user_id){
        return JSON.toJSONString(scinewsService.findByUserId(user_id));
    }

    @PostMapping("/update")
    @ResponseBody
    public String updateBook(@RequestBody JSONObject jsonObject){
        Scinews news = JSONObject.toJavaObject(jsonObject,Scinews.class);
        return "" + scinewsService.updateScinews(news);
    }

    @PostMapping("/insert")
    @ResponseBody
    public String insertBook(@RequestBody JSONObject jsonObject){
        Scinews news = JSONObject.toJavaObject(jsonObject,Scinews.class);
        return "" + scinewsService.insertScinews(news);
    }

    @DeleteMapping("/deletescinewsbyuserid/{user_id}")
    public String deleteScinewsByUserId(@PathVariable String user_id){
        return "" + scinewsService.deleteScinewsByUserId(user_id);
    }

    @DeleteMapping("/deletescinewsbytitle/{title}")
    public String deleteScinewsByTitle(@PathVariable String title){
        return "" + scinewsService.deleteScinewsByTitle(title);
    }

}
