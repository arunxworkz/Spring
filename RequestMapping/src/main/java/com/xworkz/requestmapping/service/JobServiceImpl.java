package com.xworkz.requestmapping.service;


import org.springframework.stereotype.Service;

@Service
public class JobServiceImpl implements JobService{
    @Override
    public boolean validateSave() {
        return true;
    }
}
