package com.diploma.pmsoftware.dto;

import com.diploma.pmsoftware.dto.enumeration.Priority;
import com.diploma.pmsoftware.dto.enumeration.TicketStatus;
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
public class EpicDTO {
    @NotNull
    private UUID epicId;

    @NotNull
    private UUID projectId;

    @NotNull
    private UUID creatorId;

    private UUID sprintId;

    @NotNull
    private String title;

    private String description;

    @NotNull
    private TicketStatus status;

    @NotNull
    private Priority priority;

    @NotNull
    private Date createdTimeStamp;

    private Date lastUpdatedTimeStamp;
}
