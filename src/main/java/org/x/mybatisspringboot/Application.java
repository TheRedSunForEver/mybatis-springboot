package org.x.mybatisspringboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.x.mybatisspringboot.dao.UserDao;
import org.x.mybatisspringboot.domain.User;

@SpringBootApplication
public class Application implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    private final UserDao userDao;

    public Application(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(userDao.countAll());
        User user = userDao.findUserById(10);
        System.out.println(user.getUsername());
    }
}
