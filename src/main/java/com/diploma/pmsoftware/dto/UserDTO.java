package com.diploma.pmsoftware.dto;

import com.diploma.pmsoftware.dto.enumeration.UserRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class UserDTO {

    @NotNull
    private UUID userId;

    @NotNull
    private String name;

    @NotNull
    private String surname;

    @Email
    @NotNull
    private String email;

    @NotNull
    private String password;

    private UserRole role;

    @NotNull
    private Date createdTimeStamp;

    private Date lastUpdatedTimeStamp;


}
