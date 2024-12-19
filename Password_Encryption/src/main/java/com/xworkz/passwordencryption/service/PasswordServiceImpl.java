package com.xworkz.passwordencryption.service;

import com.xworkz.passwordencryption.dto.PasswordDTO;
import com.xworkz.passwordencryption.entity.PasswordEntity;
import com.xworkz.passwordencryption.repository.PasswordRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;


import org.mindrot.jbcrypt.BCrypt;
import org.springframework.web.multipart.support.StringMultipartFileEditor;

@Service
public class PasswordServiceImpl implements PasswordService {

    @Autowired
    private PasswordEncoder passwordEncoder;


    private static final String PASSWORD_PATTERN =
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@!#&()\\-\\[\\]{}:;',?/*~$^+=<>]).{8,20}$";

    private final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);

    private BCryptPasswordEncoder bcEncoder = new BCryptPasswordEncoder();

    String masg;

//    @Autowired
//    PasswordEntity entity;

    @Autowired
    PasswordRepository passwordRepository;

    @Override
    public String validateSave(PasswordDTO dto) {
        boolean saved = false;

        if (dto != null) {
            // Validate name
            String name = dto.getName();
            if (name != null) {
                System.out.println("Name is valid: " + name);

                // Validate email
                String email = dto.getEmail();
                if (email != null && email.contains("@") && email.endsWith("gmail.com")) {
                    System.out.println("The email is correct: " + email);

                    // Validate password
                    String password = dto.getPassword();
                    if (password != null && !password.isEmpty()) {
                        if (pattern.matcher(password).matches()) {
                            System.out.println("Password is valid: " + password);

                            // Validate confirm password
                            String confirmPassword = dto.getConfirmPassword();
                            if (confirmPassword != null && confirmPassword.equals(password)) {

                                System.out.println("Password and confirm password match.");
                                PasswordEntity entity = new PasswordEntity();

                                entity.setName(dto.getName());
                                entity.setEmail(dto.getEmail());
                                entity.setPassword(passwordEncoder.encode(dto.getPassword()));
//                                entity.setPassword(dto.getConfirmPassword());

                                saved = passwordRepository.save(entity);

                                System.out.println("Thi is servicew logic");
                                System.out.println("Saving entity: " + entity);
//                                saved = false;

                                if (saved) {
                                    System.out.println("Entity saved successfully.");
                                    masg = "Entity saved successfully";
                                } else {
                                    System.out.println("Failed to save the entity.");
                                    masg = "Data is not saved";
                                }
                            } else {
                                System.out.println("Password and confirm password do not match.");
                                masg = "Password and confirm password do not match";
                            }
                        } else {
                            System.out.println("Password does not meet the requirements.");
                            masg = "Password does not meet the requirements";
                        }
                    } else {
                        System.out.println("Password cannot be null or empty.");
                        masg = "Password cannot be null";
                    }
                } else {
                    System.out.println("The email is not correct.");
                    masg = "Email is not correct";
                }
            } else {
                System.out.println("Name is not valid.");
                masg = "Name is not valid";
            }
        } else {
            System.out.println("DTO cannot be null.");
            masg = "DTO cannot be null";
        }
        return masg;
    }

    @Override
    public String getNameByEmailAndPassword(String email, String password) {
        System.out.println("getNameByEmailAndPassword in PasswordServiceImpl");
        PasswordEntity name = passwordRepository.getName(email);
        if(name != null){
            if(bcEncoder.matches(password, name.getPassword())){
                return name.getName();
            }else{
                return "Invalid email or password";
            }
        }
        return "Invalid email or password";
    }

    @Override
    public PasswordDTO getUSerDetails(String email) {
        PasswordEntity entity =passwordRepository.getName(email);
        System.out.println(entity);
        if(entity!=null){
            PasswordDTO dto = new PasswordDTO();
            dto.setName(entity.getName());
            dto.setEmail(entity.getEmail());
            return dto;
        }
        return null;
    }



}
