package com.xworkz.requestmapping.dto;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@ToString
public class HotelDTO {
    String name;
    int noOfPeople;
    String address;
}
