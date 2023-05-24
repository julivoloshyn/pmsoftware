package com.diploma.pmsoftware.service.impl;

import com.diploma.pmsoftware.dto.Filter;
import com.diploma.pmsoftware.dto.TicketDTO;
import com.diploma.pmsoftware.service.TicketService;
import org.springframework.stereotype.Service;

import java.time.Period;
import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {
    @Override
    public TicketDTO create(TicketDTO ticket) {
        return null;
    }

    @Override
    public List<TicketDTO> getAllByProject(String projectId, Filter filter) {
        return null;
    }

    @Override
    public List<TicketDTO> getAllBySprint(String sprintId) {
        return null;
    }

    @Override
    public List<TicketDTO> getAllByEpic(String epicId) {
        return null;
    }

    @Override
    public List<TicketDTO> getAllByReporter(String reporterId) {
        return null;
    }

    @Override
    public List<TicketDTO> getAllByAssignee(String assigneeId) {
        return null;
    }

    @Override
    public TicketDTO getTicket(String id) {
        return null;
    }

    @Override
    public boolean deleteTicket(TicketDTO ticket) {
        return false;
    }

    @Override
    public TicketDTO updateTicket(TicketDTO ticket) {
        return null;
    }
}
