package com.diploma.pmsoftware.model;

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
@Table(name = "project")
public class ProjectModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name = "id")
    private int id;

    @Column(nullable = false, name = "project_id")
    private UUID projectId;

    @Column(nullable = false, name = "title")
    private String title;

    @Column(name = "shortname")
    private String shortname;

    @Column(name = "project_description")
    private String description;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "deadline_date")
    private Date deadlineDate;

    @Column(nullable = false, name = "created_time_stamp")
    private Date createdTimeStamp;

    @Column(name = "last_updated_time_stamp")
    private Date lastUpdatedTimeStamp;

}
