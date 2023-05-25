package com.diploma.pmsoftware.service.impl;

import com.diploma.pmsoftware.dto.Filter;
import com.diploma.pmsoftware.dto.UserDTO;
import com.diploma.pmsoftware.model.UserModel;
import com.diploma.pmsoftware.repository.UserRepository;
import com.diploma.pmsoftware.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    UserRepository userRepository;
    ModelMapper mapper = new ModelMapper();

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDTO createUser(UserDTO user) {
        UserModel userModel = mapper.map(user, UserModel.class);
        return mapper.map(
                userRepository.save(userModel), UserDTO.class
        );
    }

    @Override
    public List<UserDTO> getAll(Filter filter) {
        List<UserModel> users = userRepository.findAll();
        return users.stream().map((user) -> mapper.map(user, UserDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public UserDTO getUser(String id) {
        UserModel user = userRepository.findById(id).get();
        return mapper.map(user, UserDTO.class);
    }

    // TODO
    @Override
    public boolean deleteUser(UserDTO user) {
        return false;
    }

    @Override
    public UserDTO updateUser(UserDTO user) {
        UserModel createUserModel = mapper.map(user, UserModel.class);
        userRepository.save(createUserModel);

        return user;
    }
}
