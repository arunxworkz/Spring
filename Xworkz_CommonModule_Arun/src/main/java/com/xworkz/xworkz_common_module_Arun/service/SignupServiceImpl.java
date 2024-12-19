package com.xworkz.xworkz_common_module_Arun.service;

import com.ibm.jvm.dtfjview.commands.helpers.StateToString;
import com.xworkz.xworkz_common_module_Arun.dto.SignUpDTO;
import com.xworkz.xworkz_common_module_Arun.entity.SignUpEntity;
import com.xworkz.xworkz_common_module_Arun.repository.SignUpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.Random;

@Service
public class SignupServiceImpl implements SignupService{

    public SignupServiceImpl(){
        System.out.println("This is service class");
    }

    @Autowired
    private SignUpRepo signUpRepo;

    SignUpEntity signUpEntity = new SignUpEntity();

    private final static String characters = "ABCDEFHGIJKLMNOPQRSTUVWXYZ" +
            "abcdefghojklmnopqrstuvwxyz" +
            "012456789!" +
            "@#$%^&*?/";

    boolean isValid = false;

    @Override
    public boolean onSave(SignUpDTO dto) {

        System.out.println("Dto from service"+dto);


        if(dto!=null) {
            if (dto.getName() != null) {
                signUpEntity.setName(dto.getName());
                isValid = true;
            }

            if (dto.getEmail() != null) {
                signUpEntity.setEmail(dto.getEmail());
                isValid = true;
            }

            if (dto.getAlternetEmail() != null) {
                signUpEntity.setAlternetEmail(dto.getAlternetEmail());
                isValid = true;
            }

            if (dto.getPhNo() != null) {
                signUpEntity.setPhNo(dto.getPhNo());
                isValid = true;
            }

            if (dto.getAlPhNo() != null) {
                signUpEntity.setAlPhNo(dto.getAlPhNo());
                isValid = true;
            }

            if (dto.getEmail() != null) {
                StringBuilder stringBuilder = new StringBuilder();
                SecureRandom secureRandom = new SecureRandom();
                for (int i = 0; i < 9; i++) {
                    int index = secureRandom.nextInt(characters.length());
                    stringBuilder = stringBuilder.append(characters.charAt(index));
                }
                System.out.println(stringBuilder.toString());
                signUpEntity.setPassword(stringBuilder.toString());
                isValid = true;
            }
            if (isValid) {
                signUpRepo.save(signUpEntity);
            }
        }
        return isValid;
    }
}
