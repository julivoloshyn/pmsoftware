package com.diploma.pmsoftware.service.impl;

import com.diploma.pmsoftware.dto.SprintDTO;
import com.diploma.pmsoftware.service.SprintService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SprintServiceImpl implements SprintService {
    @Override
    public SprintDTO createSprint(SprintDTO sprint) {
        return null;
    }

    @Override
    public List<SprintDTO> getAll(String projectId) {
        return null;
    }

    @Override
    public SprintDTO getSprint(String sprintId) {
        return null;
    }

    @Override
    public boolean deleteSprint(String sprintId) {
        return false;
    }

    @Override
    public SprintDTO updateSprint(SprintDTO sprint) {
        return null;
    }
}
