package com.diploma.pmsoftware.dto;

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
public class ProjectDTO {
    @NotNull
    private UUID projectId;

    @NotNull
    private String title;

    private String shortname;

    private String description;

    private Date startDate;

    private Date deadlineDate;

    @NotNull
    private Date createdTimeStamp;

    private Date lastUpdatedTimeStamp;
}
