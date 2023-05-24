package com.diploma.pmsoftware.dto;

import com.diploma.pmsoftware.dto.enumeration.SprintStatus;
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
public class SprintDTO {
    @NotNull
    private UUID sprintId;

    @NotNull
    private UUID projectId;

    @NotNull
    private String title;

    private String description;

    @NotNull
    private SprintStatus sprintStatus;

    private Date startDate;

    private Date deadlineDate;

    @NotNull
    private Date createdTimeStamp;

    private Date lastUpdatedTimeStamp;
}
