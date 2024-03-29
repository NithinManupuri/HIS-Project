package in.nithin.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;

import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import jakarta.mail.internet.MimeMessage;

@Component
public class MailUtils {
	@Autowired
	private JavaMailSender mailSender;
	
	   public boolean sendMail(String to,String body) {
	  	
		try {
			MimeMessage mailMessage=mailSender.createMimeMessage();
			MimeMessageHelper m=new MimeMessageHelper(mailMessage);
			m.setText(body);
			m.setTo(to);
			mailSender.send(mailMessage);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	    }
	
}
