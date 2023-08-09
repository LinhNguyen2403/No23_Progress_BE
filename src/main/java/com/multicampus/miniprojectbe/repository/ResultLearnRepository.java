package com.multicampus.miniprojectbe.repository;

import com.multicampus.miniprojectbe.model.ResultLearn;
import com.multicampus.miniprojectbe.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResultLearnRepository extends JpaRepository <ResultLearn,Integer> {
    @Query("SELECT r.student, r.subject FROM ResultLearn r JOIN r.student s WHERE r.mark =: mark" )
    List<ResultLearn> findByMark(Double mark);
    @Query("SELECT r.ID FROM ResultLearn r JOIN r.student s WHERE r.mark =: mark" )
    Integer findByMark2(Double mark);


}
