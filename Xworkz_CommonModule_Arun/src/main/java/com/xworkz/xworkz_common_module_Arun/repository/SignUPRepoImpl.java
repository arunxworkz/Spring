package com.xworkz.xworkz_common_module_Arun.repository;

import com.xworkz.xworkz_common_module_Arun.entity.SignUpEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

@Repository
public class SignUPRepoImpl implements SignUpRepo{

    @Autowired
    private EntityManagerFactory entityManagerFactory;


    public SignUPRepoImpl(){
        System.out.println("this is repository implementation");
    }

    @Override
    public boolean save(SignUpEntity entity) {
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        System.out.println("This is from repository: "+entity);
        try{
            System.out.println(entity);
            entityTransaction.begin();
            entityManager.merge(entity);
            entityTransaction.commit();
            return true;
        }catch(Exception e){
            if(entityTransaction.isActive())
                entityTransaction.rollback();
            e.printStackTrace();
            return false;
        }finally {
            entityManager.close();
        }
    }

    @Override
    public Long getCountName(String name) {

        Long count = 0l;
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        try{
            Query query = entityManager.createNamedQuery("getNameCount");
            query.setParameter("name", name);
            count = (Long)query.getSingleResult();
            System.out.println("CountDownLatch is "+count);
        }catch (Exception e){
            if(entityTransaction.isActive()){
                entityTransaction.rollback();
            }
            e.printStackTrace();
        }finally {
            entityManager.close();
        }
        return count;
    }

    @Override
    public long getCountEmail(String email) {
        long count = 0l;
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        try{
            Query query = entityManager.createNamedQuery("getEmailCount");
            query.setParameter("email", email);
            count = (Long)query.getSingleResult();
            System.out.println("Count from Service: "+count);
        }catch(Exception e){
            if(entityTransaction.isActive())
                entityTransaction.rollback();
            e.printStackTrace();
        }finally{
            entityManager.close();
        }
        return count;
    }


    public long getCountPhnoNuumber(String phNo){

        long count = 0L;
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        try{
            Query query = entityManager.createNamedQuery("getPhnoCount");
            query.setParameter("getPhnoCount", phNo);
            count = (Long)query.getSingleResult();
            System.out.println("The ohno count is: "+count);
            return count;
        }catch(Exception e){
            if(entityTransaction.isActive())
                entityTransaction.rollback();
            e.printStackTrace();
            return 0;
        }finally{
            entityManager.close();
        }
    }


    @Override
    public SignUpEntity onSignIn(String email) {
        System.out.println("Thi si from sigin Respository");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        SignUpEntity entity = null;
        try {
            Query query = entityManager.createNamedQuery("getName");
            query.setParameter("setEamil", email);

            entity = (SignUpEntity) query.getSingleResult();
            System.out.println("Entity from repository "+entity);
            return entity;
        }catch (Exception e){
            e.getStackTrace();
            return null;
        }finally {
            entityManager.close();
        }
    }

    @Override
    public SignUpEntity getData(String email) {
        System.out.println("This email from get data of repository: "+email);
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        try{
            entityTransaction.begin();
            Query query = entityManager.createNamedQuery("getDataa");
            query.setParameter("getEmail", email);
            System.out.println("emasil is inn method of repo.."+email);
            Object singleResult = query.getSingleResult(); // will throw single object
            return (SignUpEntity) singleResult;
        }catch (Exception e){
            if(entityTransaction.isActive())
                entityTransaction.rollback();
            e.printStackTrace();
            return null;
        }finally {
            entityManager.close();
        }
    }

    @Override
    public boolean onUpDate(SignUpEntity entity) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        try{
            entityTransaction.begin();
            entityManager.merge(entity);
            entityTransaction.commit();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }finally {
            entityManager.close();
        }
    }
}
