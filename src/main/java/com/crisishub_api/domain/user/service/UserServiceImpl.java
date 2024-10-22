package com.crisishub_api.domain.user.service;

import com.crisishub_api.domain.user.User;
import com.crisishub_api.domain.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> fetchUserList() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User updateUser(User user, Long userId) {
        User userDB = userRepository.findById(userId).get();

        if (Objects.nonNull(user.getUserName()) && !"".equalsIgnoreCase(user.getUserName())) {
            userDB.setUserName(user.getUserName());
        } else if (Objects.nonNull(user.getUserSurname()) && !"".equalsIgnoreCase(user.getUserSurname())) {
            userDB.setUserSurname(user.getUserSurname());
        } else if (user.getUserPhoneNumber()>0){
            userDB.setUserPhoneNumber(user.getUserPhoneNumber());
        } else if (Objects.nonNull(user.getUserAdress()) && !"".equalsIgnoreCase(user.getUserAdress())) {
            userDB.setUserAdress(user.getUserAdress());
        }

        return userDB;
    }

    @Override
    public void deleteUserById(Long userId) {
        userRepository.deleteById(userId);
    }
}
