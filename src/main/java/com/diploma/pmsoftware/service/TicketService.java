package com.diploma.pmsoftware.service;

import com.diploma.pmsoftware.dto.Filter;
import com.diploma.pmsoftware.dto.TicketDTO;
import com.diploma.pmsoftware.dto.enumeration.TicketType;
import org.springframework.stereotype.Service;

import java.time.Period;
import java.util.List;

@Service
public interface TicketService {
    TicketDTO create(TicketDTO ticket);
    List<TicketDTO> getAllByProject(String projectId, Filter filter);
    List<TicketDTO> getAllBySprint(String sprintId);
    List<TicketDTO> getAllByEpic(String epicId);
    List<TicketDTO> getAllByReporter(String reporterId);
    List<TicketDTO> getAllByAssignee(String assigneeId);
    TicketDTO getTicket(String id);
    boolean deleteTicket(TicketDTO ticket);
    TicketDTO updateTicket(TicketDTO ticket);
}
