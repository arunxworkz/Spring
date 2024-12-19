package com.xworkz.xworkz_common_module_Arun.entity;

import lombok.Data;
import org.dom4j.tree.BaseElement;

import javax.persistence.*;

@Entity
@Data
@Table(name = "commondetails")
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

}
