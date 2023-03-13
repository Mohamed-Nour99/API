package com.example.university.demouniversity.repo;

import com.example.university.demouniversity.models.faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface facultyrepo extends JpaRepository<faculty, Integer> {
}
