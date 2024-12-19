package com.xworkz.requestmapping.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Organdto {

    public class OrganDonationDTO {
        private String fullName;
        private long phoneNumber;
        private int age;
        private String permanentAddress;
        private String presentAddress;
        private String bloodGroup;
        private long aadhaarNo;
        private double height;
        private double weight;
        private String organ;}
}


