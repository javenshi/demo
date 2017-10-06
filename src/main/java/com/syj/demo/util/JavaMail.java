package com.syj.demo.util;

import com.sun.mail.smtp.SMTPAddressFailedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailSendException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;


@Component
public class JavaMail {
    @Autowired
    private  JavaMailSender mailSender;
    @Value("${spring.mail.username}")
    private String username;
    public  String sendRigisterMail(String email) throws MyException {
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < 6; i++) {
            str.append((int)(Math.random() * 10));
        }
       // System.out.println(str.toString());
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(username);
        message.setTo(email);
        message.setSubject("SYJ博客注册邮件");
        message.setText("此验证码为您注册SYJ博客所需的验证码："+str.toString()+"。");
       // System.out.println(mailSender);
        try{
            mailSender.send(message);
        }catch (MailSendException e){
            throw new MyException("邮箱格式不正确");
        }

        return str.toString();
    }
}
