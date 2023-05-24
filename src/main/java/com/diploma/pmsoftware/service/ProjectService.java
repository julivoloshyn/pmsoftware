package com.diploma.pmsoftware.service;

import com.diploma.pmsoftware.dto.ProjectDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProjectService {
    ProjectDTO createProject(ProjectDTO project);
    List<ProjectDTO> getAll(String userId);
    ProjectDTO getProject(String projectId);
    boolean deleteProject(String projectId);
    ProjectDTO updateProject(ProjectDTO project);
}
