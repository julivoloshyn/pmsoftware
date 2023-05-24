package com.diploma.pmsoftware.service.impl;

import com.diploma.pmsoftware.dto.EpicDTO;
import com.diploma.pmsoftware.service.EpicService;
import org.springframework.stereotype.Service;

import java.time.Period;
import java.util.List;

@Service
public class EpicServiceImpl implements EpicService {

    @Override
    public EpicDTO create(EpicDTO epic) {
        return null;
    }

    @Override
    public List<EpicDTO> getAllByProject(String projectId, Period period) {
        return null;
    }

    @Override
    public List<EpicDTO> getAllBySprint(String sprintId, Period period) {
        return null;
    }

    @Override
    public EpicDTO getEpic(String epicId) {
        return null;
    }

    @Override
    public boolean delete(String epicId) {
        return false;
    }

    @Override
    public EpicDTO update(EpicDTO epic) {
        return null;
    }
}
