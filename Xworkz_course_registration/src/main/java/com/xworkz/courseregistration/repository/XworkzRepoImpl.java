package com.xworkz.courseregistration.repository;

import com.xworkz.courseregistration.entity.XworkzEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Repository
public class XworkzRepoImpl implements XworkzRepository{

    public XworkzRepoImpl(){
        System.out.println("This is repository implmenetation");
    }

    @Autowired
    EntityManagerFactory entityManagerFactory;
    @Override
    public boolean onSave(XworkzEntity entity) {

        EntityManager entityManager =  entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        try{
            entityTransaction.begin();
            entityManager.persist(entity);
            entityTransaction.commit();

        }catch(Exception e){
            if(entityTransaction.isActive())
                entityTransaction.rollback();
        }finally{
            entityManager.close();
            entityManagerFactory.close();
        }
        return true;
    }

    @Override
    public String getNameByEmailAndPassword(String email, String password) {

        EntityManager entityManager =  entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        String name = "";
        try {
            Query query = entityManager.createNamedQuery("getNameByEmailAndPassword");
            query.setParameter("email", email);
            query.setParameter("password", password);
            name = (String) query.getSingleResult();
            System.out.println("Name is from repository:" + name);
        } catch (NoResultException e) {
            // Handle case when no result is found (invalid credentials)
            System.out.println("Invalid credentials: No matching email or password.");
            name = "Invalid password"; // Return error message
        }catch(Exception e){
            e.printStackTrace();
            name = "Error occured in credientials";
        }finally {
        // Ensure the entity manager is closed
        entityManager.close();
    }

        return name;
    }
}
