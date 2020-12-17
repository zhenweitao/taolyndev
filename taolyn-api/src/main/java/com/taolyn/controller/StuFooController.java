package com.taolyn.controller;


import com.taolyn.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 陶Lyn
 * on 2020/11/23.
 */
@RestController
public class StuFooController {
    @Autowired
    private StuService stuService;
    @GetMapping("/getStu")
    public Object getStu(int id){
        return stuService.getStuInfo(id) ;
    }
    @PostMapping("/saveStu")
    public Object saveStu(){
        stuService.saveStu();
        return "OK" ;
    }
    @PostMapping("/updateStu")
    public Object updateStu(int id){
        stuService.updateStu(id);
        return "OK" ;
    }
    @PostMapping("/deleteStu")
    public Object deleteStu(int id){
        stuService.updateStu(id);
        return "OK" ;
    }

}
