package com.diploma.pmsoftware.repository;

import com.diploma.pmsoftware.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, String> {

    Boolean findByEmail(String email);
}
