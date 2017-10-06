package com.syj.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = DemoApplication.class)
public class MailTest {



        @Autowired
        private JavaMailSender mailSender;

        @Test
        public void sendSimpleMail() throws Exception {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom("3159174338@qq.com");
            message.setTo("2388386839@qq.com");
            message.setSubject("主题：简单邮件");
            message.setText("测试邮件内容");

            mailSender.send(message);
        }


}
