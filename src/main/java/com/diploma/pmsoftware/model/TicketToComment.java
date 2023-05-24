package com.diploma.pmsoftware.model;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tickettocomment")
public class TicketToComment {

    @Column(nullable = false, name = "ticket_id")
    private UUID ticketId;

    @Column(nullable = false, name = "comment_id")
    private UUID commentId;
}
