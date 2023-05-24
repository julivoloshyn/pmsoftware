package com.diploma.pmsoftware.service;

import com.diploma.pmsoftware.dto.Filter;
import com.diploma.pmsoftware.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    UserDTO createUser(UserDTO user);
    List<UserDTO> getAll(Filter filter);
    UserDTO getUser(String userId);
    boolean deleteUser(UserDTO user);
    UserDTO updateUser(UserDTO user);

}
