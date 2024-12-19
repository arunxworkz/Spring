package com.xworkz.passwordencryption.entity;

import lombok.Data;
import org.springframework.context.annotation.ComponentScan;

import javax.persistence.*;


@Entity
@Table(name = "details_tables")
@Data

@NamedQuery(name = "getNameByEmail", query =  "select pe from PasswordEntity pe where pe.email =: email ")
public class PasswordEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "name")
    String name;

    @Column(name = "email")
    String email;

    @Column(name = "password")
    String password;


}
