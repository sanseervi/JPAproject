package com.jsp.jpaproject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
        User u=new User();
        u.setId(8);
        u.setName("vishal");
        u.setJob("mca");
        
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
        EntityManager em= emf.createEntityManager();
        
//        User u=em.find(User.class,1); this line is used to fetch the data from the table
        em.getTransaction().begin();
        em.persist(u);
        em.getTransaction().commit();
        
        System.out.println(u);
    }
}
