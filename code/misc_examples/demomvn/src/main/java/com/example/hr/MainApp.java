package com.example.hr;

public class MainApp {
    public static void main(String[] args) {
        EmployeeDAO dao = new EmployeeDAO();

        Employee emp = new Employee();
        emp.setId(9999);
        emp.setFirstName("Rajeev");
        emp.setLastName("Gupta");
        emp.setEmail("rajeev@example.com");

        dao.create(emp);
//        System.out.println("Employee inserted: " + dao.read(9999));
//
//        emp.setEmail("newemail@example.com");
//        dao.update(emp);
//        System.out.println("Updated: " + dao.read(9999));
//
//        dao.delete(9999);
//        System.out.println("Deleted. Now: " + dao.read(9999));
    }
}
