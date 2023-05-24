package com.diploma.pmsoftware.repository;

import com.diploma.pmsoftware.model.TicketModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<TicketModel, String> {
}
