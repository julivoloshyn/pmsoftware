package com.diploma.pmsoftware.controller;

import com.diploma.pmsoftware.dto.Filter;
import com.diploma.pmsoftware.dto.UserDTO;
import com.diploma.pmsoftware.service.impl.UserServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO user) {
        return ResponseEntity.ok(userService.createUser(user));
    }

    // TODO filter
    @GetMapping("/getAll")
    public ResponseEntity<List<UserDTO>> getAll(Filter filter) {
        return ResponseEntity.ok(userService.getAll(filter));
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<UserDTO> getUser(@PathVariable(name = "id") String id) {
        return ResponseEntity.ok(userService.getUser(id));
    }

    // TODO delete by id??
    @DeleteMapping("/delete")
    public void deleteUser(@RequestBody UserDTO user) {
        userService.deleteUser(user);
    }

    @PatchMapping("/update")
    public ResponseEntity<UserDTO> updateUser(@RequestBody UserDTO user){
        return ResponseEntity.ok(userService.updateUser(user));
    }
}
