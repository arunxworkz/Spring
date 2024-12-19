package com.xworkz.passwordencryption.repository;

import com.xworkz.passwordencryption.entity.PasswordEntity;

public interface PasswordRepository {

    boolean save(PasswordEntity entity);

    PasswordEntity getName(String email);
}
