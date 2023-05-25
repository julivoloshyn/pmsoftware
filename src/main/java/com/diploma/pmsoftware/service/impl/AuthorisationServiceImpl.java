package com.diploma.pmsoftware.service.impl;

import com.diploma.pmsoftware.dto.UserDTO;
import com.diploma.pmsoftware.handler.exception.UserAlreadyExistsException;
import com.diploma.pmsoftware.model.UserModel;
import com.diploma.pmsoftware.repository.UserRepository;
import com.diploma.pmsoftware.service.AuthorisationService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthorisationServiceImpl  implements AuthorisationService {

    @Autowired
    UserRepository userRepository;
    PasswordEncoder passwordEncoder;
    @Override
    public void register(UserDTO user) throws UserAlreadyExistsException {

        if(checkIfUserExist(user.getEmail())){
            throw new UserAlreadyExistsException();
        }

        UserModel userModel = new UserModel();
        BeanUtils.copyProperties(user, userModel);
        encodePassword(userModel, user);
        userRepository.save(userModel);
    }

    public boolean checkIfUserExist(String email) {
        return userRepository.findByEmail(email) != null;
    }

    private void encodePassword(UserModel userEntity, UserDTO user){
        userEntity.setPassword(passwordEncoder.encode(user.getPassword()));
    }

    @Override
    public void signIn() {

    }

    @Override
    public void logOut() {

    }
}
