package com.xworkz.xworkz_common_module_Arun.entity;

import lombok.Data;
import org.dom4j.tree.BaseElement;

import javax.persistence.*;

@Entity
@Data
@Table(name = "commondetails")

@NamedQuery(name = "getNameCount", query = "select count(se.name) from SignUpEntity se where se.name = :name")
@NamedQuery(name = "getEmailCount", query = "select count (se.email) from SignUpEntity se where se.email= :email")
@NamedQuery(name = "getPhnoCount", query = "select count(se.phNo) from SignUpEntity se where se.phNo = : phNo")
@NamedQuery(name = "getNameByEmailAndPassword", query = "select se.name from SignUpEntity se where se.email= :email and password= :password")
@NamedQuery(name = "getDataa", query = "select see from SignUpEntity see where see.email =: getEmail") //required for update operation
@NamedQuery(name = "getName", query = "select se from SignUpEntity se where se.email = : setEamil")

//@NamedQuery(name = "updatePassword", query = "update SignUpEntity se set se.password = :newPassword where se.email = :email")
public class SignUpEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    String email;
    String alternetEmail;
    String phNo;
    String alPhNo;
    String location;
    String password;
    int login_count;

}
