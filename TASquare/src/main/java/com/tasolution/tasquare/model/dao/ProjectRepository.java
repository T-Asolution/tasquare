package com.tasolution.tasquare.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tasolution.tasquare.model.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

}
