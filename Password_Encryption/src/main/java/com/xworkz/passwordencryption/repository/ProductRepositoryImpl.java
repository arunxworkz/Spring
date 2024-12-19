package com.xworkz.passwordencryption.repository;

import com.xworkz.passwordencryption.entity.PasswordEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

@Repository
public class ProductRepositoryImpl implements PasswordRepository{



    public ProductRepositoryImpl(){
        System.out.println("This is repository");
    }

    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public boolean save(PasswordEntity entity) {

        EntityManager entityManager =  entityManagerFactory.createEntityManager();
        EntityTransaction et = entityManager.getTransaction();

        try{

            et.begin();
            entityManager.persist(entity);
            et.commit();

        }catch(Exception e){
            if(et.isActive())
                et.rollback();
        }finally{
            entityManager.close();

        }

        return true;
    }


    @Override
    public PasswordEntity getName(String email) {

        System.out.println("getName in ProductRepositoryImpl");
        EntityManager entityManager =  entityManagerFactory.createEntityManager();
        EntityTransaction et = entityManager.getTransaction();
        PasswordEntity singleResult =null;
        try{
            Query query = entityManager.createNamedQuery("getNameByEmail", PasswordEntity.class);
            query.setParameter("email", email);
             singleResult = (PasswordEntity) query.getSingleResult();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            entityManager.close();
        }
        return singleResult;
    }
}
