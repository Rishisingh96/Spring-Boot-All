package com.rishi.orm.services.Impl;

import com.rishi.orm.entities.User;
import com.rishi.orm.repositories.UserRepository;
import com.rishi.orm.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Component
public class UserServiceImpl implements UserService {

    Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        User savedUser = userRepository.save(user);
        logger.info("User save: {}",savedUser.getId());
        return savedUser;
    }

    @Override
    public User updateUser(User user, int userId) {
       //1:user get database
        User oldUser = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User Id not found"));
        oldUser.setName(user.getName());
        oldUser.setCity(user.getCity());
        oldUser.setAge(user.getAge());
        //rest of the details also be updated

        //2.update user
        User useru = userRepository.save(oldUser);

        return useru;
    }

    @Override
    public void deleteUser(int userId) {
        User userDelete = userRepository.findById(3).orElseThrow(() -> new RuntimeException("Uer not Exist your database"));
        userRepository.delete(userDelete);
        //deleteAll
        logger.info("user Deleted");

    }

    @Override
    public List<User> getAllUser() {
        List<User> usersall = userRepository.findAll();
        return usersall;
    }

    @Override
    public User getUser(int userId) {
        Optional<User> userOptional = userRepository.findById(userId);
        User user = userOptional.orElseThrow(() -> new RuntimeException("User with given id not found."));
        return user;
    }
}
