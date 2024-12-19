package com.xworkz.passwordencryption.service;

import com.xworkz.passwordencryption.dto.PasswordDTO;
import org.springframework.web.multipart.support.StringMultipartFileEditor;

public interface PasswordService {
    String validateSave(PasswordDTO dto);

    String getNameByEmailAndPassword(String email, String password);


    PasswordDTO getUSerDetails(String email);

}
