package com.example.demo;

// Создать сервис "RegistrationService", который принимает на вход данные о пользователе (имя, возраст, email),
// создает пользователя с помощью UserService, затем использует DataProcessingService для добавления пользователя
// в список и выполнения операций над этим списком. После выполнения каждой операции, использовать NotificationService
// для вывода информации о выполненной операции.

//Строка вызова POST http://localhost:8080/registration?name=Ivan18&age=18&email=qfr@mail.ru

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class RegistrationService {
    private final UserService userService;
    private final DataProcessingService dataProcessingService;
    private final NotificationService notificationService;
    private static String name;
    private static int age;
    private static String email;
    private List<User> users = new ArrayList<>();

    public RegistrationService(UserService userService, DataProcessingService dataProcessingService, NotificationService notificationService) {
        this.userService = userService;
        this.dataProcessingService = dataProcessingService;
        this.notificationService = notificationService;
    }

    public Collection<User> Registration(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;

        users.add(userService.createUser(name,age,email));

        notificationService.notifySortUsersByAge(dataProcessingService.sortUsersByAge(users));
        notificationService.notifyFilterUsersByAge(dataProcessingService.filterUsersByAge(users, 9));
        notificationService.notifyCalculateAverageAge(dataProcessingService.calculateAverageAge(users));

        return users;
    }
}
