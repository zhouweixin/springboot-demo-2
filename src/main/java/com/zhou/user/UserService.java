package com.zhou.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User save(User user) {
        return userDao.save(user);
    }

    public List<User> findAll() {
        List<User> users = userDao.findAll();
        users.sort((user1, user2)->user2.getId()-user1.getId());
        return users;
    }

    public User findByName(String name) {
        return userDao.findTopByName(name);
    }
}
