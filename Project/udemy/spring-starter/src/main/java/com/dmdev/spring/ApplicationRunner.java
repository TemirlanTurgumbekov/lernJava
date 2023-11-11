package com.dmdev.spring;

import com.dmdev.spring.database.pool.ConnectionPool;
import com.dmdev.spring.database.repository.UserRepository;
import com.dmdev.spring.service.UserService;

public class ApplicationRunner {
    public static void main(String[] args) {
        var connectionPool = new ConnectionPool();
        var userRepository = new UserRepository(connectionPool);
        var userService = new UserService(userRepository);
        // TODO: 10.11.2023 userService
        
    }
}
