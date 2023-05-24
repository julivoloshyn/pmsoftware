package com.diploma.pmsoftware.model;

import com.diploma.pmsoftware.dto.enumeration.UserRole;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "users")
public class UserModel {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(nullable = false, name = "id")
    private int id;

    @Column(nullable = false, name = "user_id")
    private UUID userId;

    @Column(nullable = false, name = "user_name")
    private String name;

    @Column(nullable = false, name = "surname")
    private String surname;

    @Column(nullable = false, name = "email")
    private String email;

    @Column(nullable = false, name = "user_password")
    private String password;

    @Column(name = "user_role")
    private UserRole role;

    @Column(nullable = false, name = "created_time_stamp")
    private Date createdTimeStamp;

    @Column(name = "last_updated_time_stamp")
    private Date lastUpdatedTimeStamp;
}
