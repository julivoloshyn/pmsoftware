package com.diploma.pmsoftware.service;

import com.diploma.pmsoftware.dto.SprintDTO;
import org.springframework.stereotype.Service;

import java.time.Period;
import java.util.List;

@Service
public interface SprintService {
    SprintDTO createSprint(SprintDTO sprint);
    List<SprintDTO> getAll(String projectId);
    SprintDTO getSprint(String sprintId);
    boolean deleteSprint(String sprintId);
    SprintDTO updateSprint(SprintDTO sprint);
}
