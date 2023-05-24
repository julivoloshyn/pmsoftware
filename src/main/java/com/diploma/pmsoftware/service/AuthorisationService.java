package com.diploma.pmsoftware.service;

import com.diploma.pmsoftware.dto.UserDTO;
import org.springframework.stereotype.Service;

@Service
public interface AuthorisationService {
    void register(UserDTO user);
    void signIn();
    void logOut();
}
