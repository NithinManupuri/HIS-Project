package in.nithin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nithin.binding.LoginData;
import in.nithin.entity.CitizenData;
import in.nithin.repo.CitizenRepository;
import in.nithin.utils.MailUtils;

@Service
public class CitizenServiceImpl implements CitizenService {
	
@Autowired
	private CitizenRepository repo;
   @Autowired
	private MailUtils mailUtils;
	
	@Override
	public CitizenData registeration(CitizenData data) {
		  return  repo.save(data);	
	}


	@Override
	public CitizenData checkLogin(LoginData data) {
		  return repo.findByEmailAndPassword(data.getEmail(),data.getPassword());
	
	}


	@Override
	public boolean forgotPass(String mail) {
	    System.out.println(mail);
	    CitizenData data=repo.findByEmail(mail);
	    System.out.println(data);

	   if(data!=null) {
		   return mailUtils.sendMail(data.getEmail(), data.getPassword());
	   }
	    return false;
	}




}
