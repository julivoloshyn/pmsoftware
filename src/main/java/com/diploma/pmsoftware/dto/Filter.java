package com.diploma.pmsoftware.dto;

import com.diploma.pmsoftware.dto.enumeration.Priority;
import com.diploma.pmsoftware.dto.enumeration.UserRole;
import com.diploma.pmsoftware.dto.enumeration.TicketStatus;
import com.diploma.pmsoftware.dto.enumeration.TicketType;
import lombok.Getter;

import java.time.Period;

@Getter
public class Filter {
    private boolean sprintStatus;
    private Priority ticketPriority;
    private TicketStatus ticketStatus;
    private TicketType ticketType;
    private UserRole userRole;
    private Period period;
    private Period created;
    private Period lastUpdated;

}
