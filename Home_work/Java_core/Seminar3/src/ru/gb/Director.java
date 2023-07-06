package ru.gb;

public class Director extends Employee{

    public Director(String firstName, String lastName, int salary, int age, String phone) {
        super(firstName, lastName, salary, age, phone);
        setPosition("Director");
    }

    public static void salaryUp(Employee[] employees, int addSalary){
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getPosition() != "Director"){
                employees[i].setSalary(employees[i].getSalary() + addSalary);
            }
        }
    }
}
