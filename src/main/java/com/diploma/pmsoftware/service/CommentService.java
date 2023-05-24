package com.diploma.pmsoftware.service;

import com.diploma.pmsoftware.dto.CommentDTO;
import com.diploma.pmsoftware.dto.Filter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CommentService {
    CommentDTO createComment(CommentDTO comment);
    List<CommentDTO> getByUser(String userId, Filter filter);
    List<CommentDTO> getByTask(String taskId, Filter filter);
    List<CommentDTO> getAll(Filter filter);
    CommentDTO getComment(String commentId);
    boolean deleteComment(CommentDTO comment);
}
