package com.diploma.pmsoftware.repository;

import com.diploma.pmsoftware.model.SprintModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SprintRepository extends JpaRepository<SprintModel, String> {
}
