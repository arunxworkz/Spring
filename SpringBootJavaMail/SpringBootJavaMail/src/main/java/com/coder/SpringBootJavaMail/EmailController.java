package com.coder.SpringBootJavaMail;

import jakarta.mail.MessageContext;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailMessage;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@RestController
public class EmailController {

    @Autowired
    private JavaMailSender javaMailSender;

    @RequestMapping("/sentEmail")
    public String sendEmail(){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("arunbelavadi30@gmail.com");
        simpleMailMessage.setTo("gsannapurna08@gmail.com");
        simpleMailMessage.setSubject("Simple mail sender");
        simpleMailMessage.setText("Today is a good day");

        javaMailSender.send(simpleMailMessage);
        return "success";
    }

    @RequestMapping("/emailWithAttachment")
     public String sendEmilWithAttachment(){

        MimeMessage mailMessage = javaMailSender.createMimeMessage();
        try {
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mailMessage, true);
            mimeMessageHelper.setFrom("arunbelavadi30@gmail.com");
            mimeMessageHelper.setTo("gsannapurna08@gmail.com");
            mimeMessageHelper.setSubject("Mail with attachment");
            mimeMessageHelper.setText("Go through the attachments");

            mimeMessageHelper.addAttachment("Arun_Belavadi_Resume.pdf", new File("C:\\Users\\arunb\\Desktop\\DEsktop\\REsume\\Arun_Belavadi_Resume.pdf"));

            javaMailSender.send(mailMessage);
        }catch(Exception e){
            e.printStackTrace();
        }

        return "Success";
     }

//     @RequestMapping("/sendMail")
//    public String sendEmailWithAttachments(@RequestParam("to") String to, @RequestParam("message") String message, @RequestParam("attachments")MultipartFile attachments){
//        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
//        try {
//             MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
//            mimeMessageHelper.setTo(to);
//            mimeMessageHelper.setText("Consider the attachments");
//            mimeMessageHelper.addAttachment(attachments.getOriginalFilename(), attachments);
//
//            javaMailSender.send(mimeMessage);
//            return "Mail sent Successfully";
//         }catch(MessagingException e){
//             e.printStackTrace();
//            return "Error in sending message";
//         }
//     }
}
