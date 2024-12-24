package com.xworkz.xworkz_common_module_Arun.repository;

import com.xworkz.xworkz_common_module_Arun.entity.SignUpEntity;
import net.bytebuddy.implementation.bytecode.assign.TypeCasting;

import java.security.SecureRandom;

public interface SignUpRepo {

    public boolean save(SignUpEntity entity);

    public Long getCountName(String name);

    public long getCountEmail(String email);

    public long getCountPhnoNuumber(String phNo);

    SignUpEntity onSignIn(String email);

    SignUpEntity getData(String email);

    boolean onUpDate(SignUpEntity entity);



}
