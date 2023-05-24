package com.diploma.pmsoftware.dto;

import com.diploma.pmsoftware.dto.enumeration.Priority;
import com.diploma.pmsoftware.dto.enumeration.TicketStatus;
import com.diploma.pmsoftware.dto.enumeration.TicketType;
import com.diploma.pmsoftware.dto.enumeration.UnitsOfMeasure;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class TicketDTO {
    @NotNull
    private UUID ticketId;

    @NotNull
    private UUID projectId;

    private UUID sprintId;

    private UUID epicId;

    @NotNull
    private UUID reporterId;

    private UUID assigneeId;

    @NotNull
    private String title;

    private String description;

    @NotNull
    private TicketStatus status;

    @NotNull
    private TicketType ticketType;

    @NotNull
    private Priority priority;

    private int estimate;

    private UnitsOfMeasure unitsOfMeasure;

    @NotNull
    private Date createdTimeStamp;

    private Date lastUpdatedTimeStamp;
}
