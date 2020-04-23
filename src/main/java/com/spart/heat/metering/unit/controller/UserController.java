package com.spart.heat.metering.unit.controller;

import com.spart.heat.metering.unit.controller.model.User;
import com.spart.heat.metering.unit.service.UserDetailsServiceImpl;
import com.spart.heat.metering.unit.service.UserRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/opros/user")
public class UserController {

    private final UserRegisterService userRegisterService;
    private final UserDetailsServiceImpl userDetailsServiceImpl;

    @Autowired
    public UserController(UserRegisterService userRegisterService, UserDetailsServiceImpl userDetailsServiceImpl) {
        this.userRegisterService = userRegisterService;
        this.userDetailsServiceImpl = userDetailsServiceImpl;
    }

    @PostMapping(value = "/add")
    public ResponseEntity<String> addUser(@RequestBody User user) {

            return ResponseEntity.ok().body(userRegisterService.register(user));
    }

    @GetMapping(value = "/getAll")
    public ResponseEntity<List<User>> getAllUsers(){
        return ResponseEntity
                .ok()
                .body(userDetailsServiceImpl.getAllUsers());
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable("id") int userId){
        userDetailsServiceImpl.deleteUser(userId);
        return ResponseEntity
                .ok().build();
    }

    @GetMapping(value = "/get/{login}")
    public ResponseEntity<User> getUser(@PathVariable("login") String login){
        return ResponseEntity
                .ok()
                .body(userDetailsServiceImpl.getUser(login));
    }


//    @PutMapping(value = "/update/{id}")
//    public ResponseEntity<Void> updateUser(@PathVariable("id") long id, @RequestBody User user){
//        userRegisterService.update(id,user);
//        return ResponseEntity.ok().build();
//    }
//
//    @GetMapping(value = "/get/{id}")
//    public ResponseEntity<User> getUser(@PathVariable("id") long id){
//        return ResponseEntity
//                .ok()
//                .body(userRegisterService.getUser(id));
//    }



//    @DeleteMapping(value = "/delete/{id}")
//    public ResponseEntity<Void> deleteUser(@PathVariable("id") long id) {
//        userRegisterService.deleteSecret(id);
//        return ResponseEntity.ok().build();
//    }

}
