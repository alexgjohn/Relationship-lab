package com.codeclan.example.RelationshipLab.repositories;

import com.codeclan.example.RelationshipLab.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
