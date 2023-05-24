package com.diploma.pmsoftware.model;

import com.diploma.pmsoftware.dto.enumeration.Priority;
import com.diploma.pmsoftware.dto.enumeration.TicketStatus;
import com.diploma.pmsoftware.dto.enumeration.TicketType;
import com.diploma.pmsoftware.dto.enumeration.UnitsOfMeasure;
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
@Table(name = "ticket")
public class TicketModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name = "id")
    private int id;

    @Column(nullable = false, name = "ticket_id")
    private UUID ticketId;

    @Column(nullable = false, name = "project_id")
    private UUID projectId;

    @Column(name = "sprint_id")
    private UUID sprintId;

    @Column(name = "epic_id")
    private UUID epicId;

    @Column(nullable = false, name = "reporter_id")
    private UUID reporterId;

    @Column(name = "assignee_id")
    private UUID assigneeId;

    @Column(nullable = false, name = "title")
    private String title;

    @Column(name = "ticket_description")
    private String description;

    @Column(nullable = false, name = "ticket_status")
    private TicketStatus status;

    @Column(nullable = false, name = "ticket_type")
    private TicketType ticketType;

    @Column(nullable = false, name = "priority")
    private Priority priority;

    @Column(name = "estimate")
    private int estimate;

    @Column(name = "units_of_measure")
    private UnitsOfMeasure unitsOfMeasure;

    @Column(nullable = false, name = "created_time_stamp")
    private Date createdTimeStamp;

    @Column(name = "last_updated_time_stamp")
    private Date lastUpdatedTimeStamp;
}
