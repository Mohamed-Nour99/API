package com.example.university.demouniversity.repo;

import com.example.university.demouniversity.models.material;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface materialrepo extends JpaRepository<material, Integer> {
}
