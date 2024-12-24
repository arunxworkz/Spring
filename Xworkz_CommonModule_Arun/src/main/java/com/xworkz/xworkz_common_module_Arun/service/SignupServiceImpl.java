package com.xworkz.xworkz_common_module_Arun.service;

import com.xworkz.xworkz_common_module_Arun.dto.SignUpDTO;
import com.xworkz.xworkz_common_module_Arun.entity.SignUpEntity;
import com.xworkz.xworkz_common_module_Arun.repository.SignUpRepo;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.security.SecureRandom;
import java.util.Properties;
import java.util.regex.Pattern;

@Service
public class SignupServiceImpl implements SignupService{

    public SignupServiceImpl(){
        System.out.println("This is service class");
    }

    private static final String PASSWORD_PATTERN =
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@!#&()\\-\\[\\]{}:;',?/*~$^+=<>]).{8,20}$";

    private final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);

    private BCryptPasswordEncoder bcEncoder = new BCryptPasswordEncoder();



    @Autowired
    private SignUpRepo signUpRepo;

    SignUpEntity signUpEntity = new SignUpEntity();

    private final static String characters = "ABCDEFHGIJKLMNOPQRSTUVWXYZ" +
            "abcdefghojklmnopqrstuvwxyz" +
            "012456789!" +
            "@#$%^&*?/";

    @Override
    public boolean onSave(SignUpDTO dto) {

        System.out.println("Dto from service"+dto);

        boolean isValid = false;

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
//                saveEmail(dto.getEmail(),stringBuilder.toString());
                signUpEntity.setPassword(stringBuilder.toString());
                isValid = true;
            }

            signUpEntity.setLogin_count(-1);
            if (isValid) {
                signUpRepo.save(signUpEntity);
            }
        }
        return isValid;
    }

    @Override
    public Long countName(String name) {

        Long count = signUpRepo.getCountName(name);
        return count;
    }

    @Override
    public long countEmail(String email) {

        long count = signUpRepo.getCountEmail(email);
        System.out.println("Count from Service: "+count);
        return count;
    }

    @Override
    public long countPhno(String phNo) {

        long count = signUpRepo.getCountPhnoNuumber(phNo);
        System.out.println("Ths count of phone from srvice: "+phNo);
        return count;
    }

    @Override
    public SignUpEntity onSignIn(String email, String password) {
        System.out.println("This is from Service for user existe or not");
        SignUpEntity entity = signUpRepo.onSignIn(email);
        System.out.println("entity is .."+entity);
        if(entity !=null && bcEncoder.matches(password, entity.getPassword())){
            return entity;
        }
        return null;
    }



    @Override
    public boolean onUpdate(String email, String newPasssword, String confirmPassword) {
        System.out.println("in service method..for update.."+email);

        if(newPasssword.equals(confirmPassword)) {
            SignUpEntity signUpEntity = signUpRepo.getData(email);
            System.out.println("in service method..for update.."+signUpEntity);
            if (signUpEntity != null) {

                signUpEntity.setPassword(bcEncoder.encode(newPasssword));
                signUpEntity.setLogin_count(0);
                return signUpRepo.onUpDate(signUpEntity);
            }
            System.out.println("No entiey found fro th provided eamil");
            return false;
        }
        System.out.println("Password do not matc");
        return false;
    }

//    @Override
//    public boolean saveEmail(String email, String password) {
//
//
//        final String username ="arunbelavadi30@gmail.com";
//        final String userPassword = "pofd piik gyqx nzxd";
//
//        Properties prop = new Properties();
//        prop.put("mail.smtp.host", "smtp.gmail.com");
//        prop.put("mail.smtp.port", "587");
//        prop.put("mail.smtp.auth", "true");
//        prop.put("mail.smtp.starttls.enable", "true"); //TLS
//
//        Session session = Session.getInstance(prop,
//                new javax.mail.Authenticator() {
//                    protected PasswordAuthentication getPasswordAuthentication() {
//                        return new PasswordAuthentication(username, userPassword);
//                    }
//                });
//
//        try {
//
//            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress(username));
//            message.setRecipients(
//                    Message.RecipientType.TO,
//                    InternetAddress.parse(email)
//            );
//            message.setSubject("Your password");
//            message.setText("your passwordd"+password);
//
//            Transport.send(message);
//
//            System.out.println("Done");
//
//        } catch (MessagingException e) {
//            e.printStackTrace();
//        }
//
//
//
//        return true;
//    }

//    @Override
//    public String anotherSignIn(String email, String password) {
//
//        System.out.println("Thi is from the onAnotherSignIn method: "+email);
//
//        SignUpEntity onSignIn = signUpRepo.getData(email);
//        System.out.println("Thi is on signIn fron aotherSignIn method after getting data: " + onSignIn);
//        if(onSignIn!=null){
//            if(bcEncoder.matches(password, onSignIn.getPassword())){
//                onSignIn.setLogin_count(-1);
//                return onSignIn.getName();
//            }
//            else{
//                System.out.println("Password missmatches for: "+email);
//                return null;
//            }
//        }
//        System.out.println("No user found fro emial: "+email);
//        return null;
//    }


}
