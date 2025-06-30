package com.example.hr;

import jakarta.persistence.*;
import java.util.List;

public class EmployeeDAO {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("HR_PU");

    public void create(Employee emp) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(emp);
        em.getTransaction().commit();
        em.close();
    }

    public Employee read(int id) {
        EntityManager em = emf.createEntityManager();
        Employee emp = em.find(Employee.class, id);
        em.close();
        return emp;
    }

    public void update(Employee emp) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(emp);
        em.getTransaction().commit();
        em.close();
    }

    public void delete(int id) {
        EntityManager em = emf.createEntityManager();
        Employee emp = em.find(Employee.class, id);
        if (emp != null) {
            em.getTransaction().begin();
            em.remove(emp);
            em.getTransaction().commit();
        }
        em.close();
    }

    public List<Employee> listAll() {
        EntityManager em = emf.createEntityManager();
        List<Employee> list = em.createQuery("SELECT e FROM Employee e", Employee.class).getResultList();
        em.close();
        return list;
    }
}
