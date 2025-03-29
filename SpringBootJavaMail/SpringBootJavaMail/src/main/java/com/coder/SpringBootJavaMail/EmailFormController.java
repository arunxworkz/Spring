package com.coder.SpringBootJavaMail;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/")
public class EmailFormController {

    @Autowired
    JavaMailSender javaMailSender;

    @GetMapping("/getIndex")
    public String getIndexPage(){
        System.out.println("This is email form controller");
        return "index";
    }

    @PostMapping("/email/sendMail")
    public String sendEmailWithAttachments(@RequestParam("to") String to, @RequestParam("message") String message, @RequestParam("attachments") MultipartFile attachments, Model model){
        System.out.println("This is from method");
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        try {
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
            mimeMessageHelper.setTo(to);
            mimeMessageHelper.setText(message);
            mimeMessageHelper.addAttachment(attachments.getOriginalFilename(), attachments);

            javaMailSender.send(mimeMessage);
            model.addAttribute("responseMessage", "Email sent successfully!");
            model.addAttribute("messageColor", "green");
            return "index.html";
        }catch(MessagingException e){
            e.printStackTrace();
            model.addAttribute("responseMessage", "Error in sending Mail");
            model.addAttribute("messageColor", "red");
            return "Error";
        }
    }
}
