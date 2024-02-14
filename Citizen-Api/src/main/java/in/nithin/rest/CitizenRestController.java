package in.nithin.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.nithin.binding.LoginData;
import in.nithin.entity.CitizenData;
import in.nithin.service.CitizenService;

@RestController
public class CitizenRestController {
	
	@Autowired
	private CitizenService service;
	
	@GetMapping("/login")
	public String Login(@RequestBody LoginData data) 
	{  
		CitizenData c=service.checkLogin(data);
		if(c!=null) {
			return "logined";
			
		}
		return "failed";
		
	}
	@PostMapping("/register")
	public String register(@RequestBody CitizenData data) {
		CitizenData c=service.registeration(data);
		if(c!=null) {
			return "registerd";
		}
		return "Failed";
		
	}
	@GetMapping("/mail")
	public String forgotPass(@RequestBody String email) {
		System.out.println(email);
		boolean flag=service.forgotPass(email);
		if(flag) {
			return "pass send to mail";
		}
		return "Enter the registered mail";
	}

	
	
}
