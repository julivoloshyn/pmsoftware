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
@Table(name = "usertoproject")
public class UserToProject {

    @Column(nullable = false, name = "user_id")
    private UUID userId;

    @Column(nullable = false, name = "project_id")
    private UUID projectId;
}
