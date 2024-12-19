package com.xworkz.passwordencryption.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Runner {
    public static void main(String[] args) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String encode = bCryptPasswordEncoder.encode("123456");
        System.out.println(encode);
        System.err.println();

    }
}
