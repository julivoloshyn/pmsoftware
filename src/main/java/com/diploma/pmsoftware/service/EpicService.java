package com.diploma.pmsoftware.service;

import com.diploma.pmsoftware.dto.EpicDTO;
import org.springframework.stereotype.Service;

import java.time.Period;
import java.util.List;

@Service
public interface EpicService {
    EpicDTO create(EpicDTO epic);
    List<EpicDTO> getAllByProject(String projectId, Period period);
    List<EpicDTO> getAllBySprint(String sprintId, Period period);
    EpicDTO getEpic(String epicId);
    boolean delete(String epicId);
    EpicDTO update(EpicDTO epic);
}
