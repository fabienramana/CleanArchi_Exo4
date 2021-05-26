package com.company.use_case;

import com.company.model.User;
import com.company.model.UserRepository;

import java.util.HashMap;
import java.util.Map;

public class FakeUsers implements UserRepository {
    Map<Integer, User> users;
    
    public FakeUsers(){
        users = new HashMap<>();
        User user = new User();
        users.put(1, user);
    }

    @Override
    public User findById(int id) {
        return users.get(id);
    }
}
