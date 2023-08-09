package com.multicampus.miniprojectbe.service;

import com.multicampus.miniprojectbe.model.ResultLearn;
import com.multicampus.miniprojectbe.repository.ResultLearnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultService {
    @Autowired
    ResultLearnRepository resultLearnRepository;


    public List<ResultLearn> searchbyMark(Double mark){
        return resultLearnRepository.findByMark(mark);
    }
    public boolean deleteMark(Double mark){
        if(resultLearnRepository.findByMark2(mark)!= null){
        resultLearnRepository.deleteById(resultLearnRepository.findByMark2(mark));
        return true;}
        return false;
    }

}

