package com.family.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.family.project.entity.Parent;
@Repository
public interface ParentRep extends JpaRepository<Parent, Long> {

}
