package com.codeclan.example.RelationshipLab.repositories;

import com.codeclan.example.RelationshipLab.models.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignment, Long> {
}

