package com.xworkz.requestmapping.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MatrimonyDTO {
    private String firstName;
    private String lastName;
    private String email;
    private Long phoneNo;
    private String dob;
    private String gender;
    private double weight;
    private double height;
    private double salary;
    private String address;
}
