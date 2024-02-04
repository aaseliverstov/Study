package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Создать сервис "DataProcessingService". Этот сервис должен принимать на вход список объектов типа
// User (с полями "name", "age", "email"), и выполнять следующие операции: сортировка списка пользователей
// по возрасту, фильтрация списка по заданному критерию (например, возраст больше 18), рассчет среднего возраста
// ользователей.

@Service
public class DataProcessingService {
    public String getGreeting() {
        return "!!Hello, world!";
    }

    public List<User> sortUsersByAge(List<User> users) {
        return users.stream()
                .sorted(Comparator.comparing(User::getAge))
                .collect(Collectors.toList());
    }

    public List<User> filterUsersByAge(List<User> users, int age) {
        return users.stream()
                .filter(user -> user.getAge() > age)
                .collect(Collectors.toList());
    }

    public double calculateAverageAge(List<User> users) {
        return users.stream()
                .mapToInt(User::getAge)
                .average()
                .orElse(0);
    }
}
