package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Создать два сервиса - "UserService" и "NotificationService". UserService должен содержать метод
// createUser(Stringname, int age, String email), который создает пользователя и возвращает его.
// NotificationService должен иметь метод notifyUser(User user), который просто печатает сообщение
// о том, что пользователь был создан. Ваша задача - использовать @Autowired в UserService для внедрения
// NotificationService и вызвать метод notifyUserпосле создания нового пользователя.

@Service
public class UserService {
    private final NotificationService notificationService;

    @Autowired
    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public User createUser(String name, int age, String email) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setEmail(email);

        notificationService.notifyUser(user);

        return user;
    }
}
