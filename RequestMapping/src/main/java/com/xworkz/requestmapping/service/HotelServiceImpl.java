package com.xworkz.requestmapping.service;


import org.springframework.stereotype.Service;

@Service
public class HotelServiceImpl implements HotelInterface{

    @Override
    public boolean validateSave() {
        return true;
    }


}
