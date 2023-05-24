package com.diploma.pmsoftware.repository;

import com.diploma.pmsoftware.model.CommentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<CommentModel, String> {
}
