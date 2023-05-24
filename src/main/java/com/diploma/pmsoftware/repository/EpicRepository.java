package com.diploma.pmsoftware.repository;

import com.diploma.pmsoftware.model.EpicModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EpicRepository extends JpaRepository<EpicModel, String> {
}
