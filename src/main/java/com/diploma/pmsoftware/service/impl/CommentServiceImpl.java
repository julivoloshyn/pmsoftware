package com.diploma.pmsoftware.service.impl;

import com.diploma.pmsoftware.dto.CommentDTO;
import com.diploma.pmsoftware.dto.Filter;
import com.diploma.pmsoftware.service.CommentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Override
    public CommentDTO createComment(CommentDTO comment) {
        return null;
    }

    @Override
    public List<CommentDTO> getByUser(String userId, Filter filter) {
        return null;
    }

    @Override
    public List<CommentDTO> getByTask(String taskId, Filter filter) {
        return null;
    }

    @Override
    public List<CommentDTO> getAll(Filter filter) {
        return null;
    }

    @Override
    public CommentDTO getComment(String commentId) {
        return null;
    }

    @Override
    public boolean deleteComment(CommentDTO comment) {
        return false;
    }
}