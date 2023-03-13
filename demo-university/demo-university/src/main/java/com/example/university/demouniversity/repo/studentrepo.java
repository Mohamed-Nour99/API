package com.example.university.demouniversity.repo;

import com.example.university.demouniversity.controller.controller;

import com.example.university.demouniversity.models.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface studentrepo extends JpaRepository <student, Integer> {




    @Query("select  s from student s where  s.facultyid=?1")
    List<student> findAllById (Integer facultyid) ;




  





}
