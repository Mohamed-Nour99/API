package com.example.university.demouniversity.controller;

import com.example.university.demouniversity.models.student;
import com.example.university.demouniversity.models.studentmaterial;
import com.example.university.demouniversity.repo.facultyrepo;
import com.example.university.demouniversity.repo.studentmaterialrepo;
import com.example.university.demouniversity.repo.studentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.Set;
import java.util.List;

@RestController
public class controller {

    @Autowired
    private studentrepo STRepo ;
    @Autowired
    private facultyrepo FTRepo ;
    @Autowired
    private studentmaterialrepo SMRepo ;



    @GetMapping("/Student/retrieve/facultyid={facultyid}")
    public List<student> getFacultyStudents(@PathVariable Integer facultyid){



       List<student> students = (STRepo.findAllById( facultyid));
        return  students ;
    }

    @GetMapping("/Student/sort/{studentname}")
    public List<student> sort(@PathVariable String studentname){


         List<student> allstudents =  STRepo.findAll(Sort.by(studentname));
         return allstudents ;




    }

    @GetMapping("/Student/retrieve/grade")
    public List<studentmaterial> secondhighestgrade(){



        List<studentmaterial> students = (SMRepo.findAll());
        return  students ;
    }


    
}
