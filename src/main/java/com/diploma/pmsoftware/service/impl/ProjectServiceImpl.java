package com.diploma.pmsoftware.service.impl;

import com.diploma.pmsoftware.dto.ProjectDTO;
import com.diploma.pmsoftware.service.ProjectService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Override
    public ProjectDTO createProject(ProjectDTO project) {
        return null;
    }

    @Override
    public List<ProjectDTO> getAll(String userId) {
        return null;
    }

    @Override
    public ProjectDTO getProject(String id) {
        return null;
    }

    @Override
    public boolean deleteProject(String projectId) {
        return false;
    }

    @Override
    public ProjectDTO updateProject(ProjectDTO project) {
        return null;
    }
}
