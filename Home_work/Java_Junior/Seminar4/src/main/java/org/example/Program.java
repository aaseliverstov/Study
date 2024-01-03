package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.sql.*;

public class Program {

    /**
     * Задание
     * =======
     * Создайте базу данных (например, SchoolDB).
     * В этой базе данных создайте таблицу Courses с полями id (ключ), title, и duration.
     * Настройте Hibernate для работы с вашей базой данных.
     * Создайте Java-класс Course, соответствующий таблице Courses, с необходимыми аннотациями Hibernate.
     * Используя Hibernate, напишите код для вставки, чтения, обновления и удаления данных в таблице Courses.
     * Убедитесь, что каждая операция выполняется в отдельной транзакции.
     */

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String password = "password";

        // Подключение к базе данных
        try(Connection connection = DriverManager.getConnection(url, user, password)){

            // Создание базы данных
            createDatabase(connection);
            System.out.println("Database created successfully");

            // Использование базы данных
            useDatabase(connection);
            System.out.println("Use database successfully");

            // Создание таблицы
            createTable(connection);
            System.out.println("Create table successfully");

            // Закрытие соединения
            connection.close();
            System.out.println("Database connection close successfully");
        }
        catch (SQLException e){
            e.printStackTrace();
        }

        try(SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Courses.class)
                .buildSessionFactory()){

            // Создание сессии
            Session session = sessionFactory.getCurrentSession();

            // Начало транзакции
            session.beginTransaction();

            // Создание объекта
            Courses student = Courses.create();
            session.save(student);
            System.out.println("Object course save successfully");

            // Чтение объекта из базы данных
            Courses retrievedStudent = session.get(Courses.class, student.getId());
            System.out.println("Object course retrieved successfully");
            System.out.println("Retrieved course object: " + retrievedStudent);

            // Обновление объекта
            retrievedStudent.updateName();
            retrievedStudent.updateAge();
            session.update(retrievedStudent);
            System.out.println("Object course update successfully");

            // Удаление объекта
            session.delete(retrievedStudent);
            System.out.println("Object course delete successfully");

            session.getTransaction().commit();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void createDatabase(Connection connection) throws SQLException {
        String createDatabaseSQL =  "CREATE DATABASE IF NOT EXISTS schoolDB;";
        try (PreparedStatement statement = connection.prepareStatement(createDatabaseSQL)) {
            statement.execute();
        }
    }

    private static void useDatabase(Connection connection) throws SQLException {
        String useDatabaseSQL =  "USE schoolDB;";
        try (PreparedStatement statement = connection.prepareStatement(useDatabaseSQL)) {
            statement.execute();
        }
    }

    private static void createTable(Connection connection) throws SQLException {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS courses (id INT AUTO_INCREMENT PRIMARY KEY, title VARCHAR(255), duration INT);";
        try (PreparedStatement statement = connection.prepareStatement(createTableSQL)) {
            statement.execute();
        }
    }
}
