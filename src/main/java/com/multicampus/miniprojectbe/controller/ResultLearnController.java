package com.multicampus.miniprojectbe.controller;

import com.multicampus.miniprojectbe.model.ResultLearn;
import com.multicampus.miniprojectbe.model.Student;
import com.multicampus.miniprojectbe.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1.0/results")
public class ResultLearnController {
    @Autowired
    ResultService resultService;
    @GetMapping
    public List<ResultLearn> searchMark(@RequestParam Double mark){
        return resultService.searchbyMark(mark);
    }
    @DeleteMapping
    public String deleteMark(@RequestParam Double mark){
        if(resultService.deleteMark(mark)){return "Delete Successfully!";}
        return "Delete Fail!";
    }

}
