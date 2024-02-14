package in.nithin.service;

import org.springframework.stereotype.Service;

import in.nithin.binding.LoginData;
import in.nithin.entity.CitizenData;

@Service
public interface CitizenService {
	public CitizenData checkLogin(LoginData data) ;
	public CitizenData registeration(CitizenData data) ;
	public boolean forgotPass(String email);


}
