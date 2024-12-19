package com.xworkz.requestmapping.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class PassportDTO {



        private String applyAt; //
        private String passportOffice;
        private String givenName;
        private String surname;
        @DateTimeFormat(pattern = "yyyy-MM-dd")
        private LocalDate dob;
        private String email;
        private boolean sameEmailId;
        private String loginId;
        private String password;
        private String confirmPassword;
        private String hintQuestion;

}
