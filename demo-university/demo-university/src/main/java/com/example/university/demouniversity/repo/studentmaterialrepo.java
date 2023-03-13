package com.example.university.demouniversity.repo;


import com.example.university.demouniversity.models.studentmaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Set;
import java.util.List;

@Repository
public interface studentmaterialrepo extends JpaRepository<studentmaterial, Integer> {


    @Query(
            value = "select *  from ( select * from studentmaterial   order by grade Desc limit 2 ) as studentmaterial   order by grade asc limit 1 " ,
            nativeQuery = true
    )
    List<studentmaterial> findAll () ;
}
