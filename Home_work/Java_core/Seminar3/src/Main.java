/* Опишите класс руководителя, наследник от сотрудника. Перенесите статический метод повышения зарплаты (сделать
статическим) в класс руководителя, модифицируйте метод таким образом, чтобы он мог поднять заработную плату всем,
кроме руководителей. В основной программе создайте руководителя и поместите его в общий массив сотрудников. Повысьте
зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась. */

import ru.gb.Director;
import ru.gb.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivanov", "Ivan",  100, 20, "79998884565");
        Employee employee2 = new Employee("Petrov", "Petr",  100, 45, "79998884565");
        Employee employee3 = new Employee("Sidorov", "Ivan",  100, 20, "79998884565");
        Director director = new Director("Petrov", "Petr", 100, 35, "79998884565");

        Employee[] employees = new Employee[] {employee1, employee2, employee3, director};

        Director.salaryUp(employees,900);

        for (Employee employee: employees) {
            System.out.println(employee.toString());
        }
    }
}