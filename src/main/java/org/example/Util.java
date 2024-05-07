package org.example;

public class Util {

    public String getHelloWorld() {
        return "Hello world!";
    }

    public Employee createEmployee(String name, int age, double salary, String department) {
        return new Employee(name, age, salary, department);
    }

    public void updateEmployee(Employee employee, int age, double salary, String department) {
        employee.setAge(age);
        employee.setSalary(salary);
        employee.setDepartment(department);
    }
}
