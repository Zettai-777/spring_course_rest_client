package ru.zettai.spring.rest;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.zettai.spring.rest.configs.MyConfig;
import ru.zettai.spring.rest.entities.Employee;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);
//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println("*************LIST OF EMPLOYEES*************");
//        allEmployees.forEach(System.out::println);
//        int id  = new Scanner(System.in).nextInt();
//        System.out.println("*************EMPLOYEE # " + id +"*************");
//        Employee employee = communication.getEmployee(id);
//        System.out.println(employee);
//        Employee employee = new Employee("Evgenia", "Hrustova", "IT", 1550);
//        employee.setId(11);
//        communication.saveEmployee(employee);
        communication.deleteEmployee(11);

    }
}
