package org.example;

import javax.persistence.*;
import java.util.Random;

@Entity
@Table(name = "courses")
public class Courses {

    private static final String[] courses = new String[] { "Аналитика", "Разработка", "Тестирование"};
    private static final Random random = new Random();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private int duration;

    public Courses() {

    }

    public Courses(int id, String title, int duration) {
        this.id = id;
        this.title = title;
        this.duration = duration;
    }

    public Courses(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public static Courses create(){
        return new Courses(courses[random.nextInt(courses.length)], random.nextInt(20, 100));
    }

    public void updateAge(){
        duration = random.nextInt(20, 100);
    }

    public void updateName(){
        title = courses[random.nextInt(courses.length)];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
