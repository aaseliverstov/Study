package ru.gb;

public class Employee {
    private String firstName;
    private String lastName;
    private String position;
    private int salary;
    private int age;
    private String phone;

    public Employee(String firstName, String lastName, int salary, int age, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = "Manager";
        this.salary = salary;
        this.age = age;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return String.format("Firstname: %s Lastname: %s Position: %s Salary: %d Age: %d Phone: %s",
                this.firstName, this.lastName, this.position, this.salary, this.age, this.phone);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String change() {
        return firstName;
    }
}
