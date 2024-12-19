package com.xworkz.xworkz_common_module_Arun.repository;

import com.xworkz.xworkz_common_module_Arun.entity.SignUpEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.context.Theme;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

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

            entityTransaction.begin();
            entityManager.persist(entity);
            entityTransaction.commit();

        }catch(Exception e){
            if(entityTransaction.isActive())
                entityTransaction.rollback();
            e.printStackTrace();
        }finally {
            entityManager.close();
        }


        return true;
    }
}
