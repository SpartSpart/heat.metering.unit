package com.spart.heat.metering.unit.service;

import com.spart.heat.metering.unit.controller.model.User;
import com.spart.heat.metering.unit.repository.UserDataRepository;
import com.spart.heat.metering.unit.repository.UserUnitDataRepository;
import com.spart.heat.metering.unit.repository.model.UserData;
import com.spart.heat.metering.unit.repository.model.UserUnitData;
import com.spart.heat.metering.unit.service.model.UserDetailsImpl;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private final String MESSAGE = "Success";
    private final String USER_ALREADY_EXISTS = "User already exists";

    private final UserDataRepository userDataRepository;
    private final UserUnitDataRepository userUnitDataRepository;


    public UserDetailsServiceImpl(UserDataRepository userDataRepository, UserUnitDataRepository userUnitDataRepository) {
        this.userDataRepository = userDataRepository;
        this.userUnitDataRepository = userUnitDataRepository;
    }

    @Transactional
    public String add(UserDetailsImpl userDetails) {


        String message = MESSAGE;

        int idIncrement = getIncrement();
        if (!userDataRepository.findByLogin(userDetails.getUsername()).isPresent()) {

            UserData newUser = new UserData();
            newUser.setId(idIncrement);
            newUser.setLogin(userDetails.getUsername());
            newUser.setPassword(userDetails.getPassword());
            newUser.setEmail(userDetails.getUseremail());
            newUser.setPermission(0);
            userDataRepository.saveAndFlush(newUser);
        }
        else
            message = USER_ALREADY_EXISTS;

        return message;
    }

    private int getIncrement(){
        List<UserData> allUsers = userDataRepository.findAll();
        int[] allUserId = new int[allUsers.size()];
        if (allUsers.isEmpty())
            return 1;
        else {
            for (int i = 0;i<allUsers.size(); i++){
                allUserId[i] = allUsers.get(i).getId();
            }
            return Arrays.stream(allUserId).max().getAsInt()+1;
        }
    }

    @Transactional
    public List<User> getAllUsers() {
        List<User> allUsers = new ArrayList<>();
        List<UserData> allUsersData = userDataRepository.findAll();

        for (UserData user : allUsersData) {
            User newUser = new User();
            newUser.setId(user.getId());
            newUser.setEmail(user.getEmail());
            newUser.setLogin(user.getLogin());
            allUsers.add(newUser);
        }

        return allUsers;
    }

    @Transactional
    public void deleteUser(int userId) {
        List<UserData> allUsersData = userDataRepository.findAll();
        List<UserUnitData> allUserUnitData = userUnitDataRepository.findAll();

        for (UserData user : allUsersData) {
            if (user.getId() == userId) {
                userDataRepository.deleteById(userId);

            for (UserUnitData userUnitData : allUserUnitData)
                if (userUnitData.getUserId() == userId)
                    userUnitDataRepository.deleteById(userUnitData.getId());
            }
        }
    }

    public User getUser(String login) {
        UserData userData = userDataRepository.findByLogin(login).orElseThrow(() -> new UsernameNotFoundException("User not found"));
        User user = new User();
        user.setId(userData.getId());
        user.setLogin(userData.getLogin());
        user.setPermission(userData.getPermission());
        return user;
    }

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        UserData userData = userDataRepository.findByLogin(login).orElseThrow(() -> new UsernameNotFoundException("User not found"));
        UserDetails userDetails = new UserDetailsImpl(login, userData.getPassword(), userData.getEmail());
        return userDetails;
    }

    public UserDetails getCurrent() {
        return (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }



    //    public void update(long id, User user) {
//        Optional<UserData> newUser = userDataRepository.findById(id);
//
//        newUser.get().setPassword(user.getPassword());
//        newUser.get().setLogin(user.getLogin());
//
//        userDataRepository.saveAndFlush(newUser.get());
//    }

//    public User getUser(String login) {
//        Optional<UserData> userData = ;
//        User user = new User();
//
//        user.setId(userData.get().getId());
//        user.setLogin(userData.get().getLogin());
//        user.setPassword(userData.get().getPassword());
//
//        return user;
//    }


//    public void deleteUser(long id) {
//        userDataRepository.deleteById(id);
//    }
//
//
//    public UserDetails getCurrent() {
//        return (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//    }
//
//    public boolean isUser(String login){
//        if(!userDataRepository.findByLogin(login).equals(null))
//            return true;
//        return false;
//    }


}