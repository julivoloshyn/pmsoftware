package com.diploma.pmsoftware.repository;

import com.diploma.pmsoftware.model.ProjectModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<ProjectModel, String> {
}
