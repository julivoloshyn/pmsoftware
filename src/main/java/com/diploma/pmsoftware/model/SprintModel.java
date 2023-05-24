package com.diploma.pmsoftware.model;

import com.diploma.pmsoftware.dto.enumeration.SprintStatus;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "sprint")
public class SprintModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name = "id")
    private int id;

    @Column(nullable = false, name = "sprint_id")
    private UUID sprintId;

    @Column(nullable = false, name = "project_id")
    private UUID projectId;

    @Column(nullable = false, name = "title")
    private String title;

    @Column(name = "sprint_description")
    private String description;

    @Column(nullable = false, name = "sprint_status")
    private SprintStatus sprintStatus;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "deadline_date")
    private Date deadlineDate;

    @Column(nullable = false, name = "created_time_stamp")
    private Date createdTimeStamp;

    @Column(name = "last_updated_time_stamp")
    private Date lastUpdatedTimeStamp;
}
