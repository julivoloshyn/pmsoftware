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
public class CommentDTO {
    @NotNull
    private UUID commentId;

    @NotNull
    private String userId;

    @NotNull
    private String text;

    @NotNull
    private Date createdTimeStamp;
}
