package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {
    public void notifyUser(User user) {
        System.out.println("A new user has been created: " + user.getName());
    }

    public void notifySortUsersByAge(List users) {
        for (Object i: users)
            System.out.println("Sort users by age: " + User.class.cast(i).getName() + " " + User.class.cast(i).getAge() + " " + User.class.cast(i).getEmail());
    }

    public void notifyFilterUsersByAge(List users) {
        for (Object i: users)
            System.out.println("Filter users by age: " + User.class.cast(i).getName() + " " + User.class.cast(i).getAge() + " " + User.class.cast(i).getEmail());
    }

    public void notifyCalculateAverageAge(Double age) {
        System.out.println("Average age: " + age);
    }
}
