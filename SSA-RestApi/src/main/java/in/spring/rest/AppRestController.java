package in.spring.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.spring.binding.Citizen;
import in.spring.binding.CitizenInfo;

@RestController
@RequestMapping("/get")

public class AppRestController {
	
	@PostMapping
	public CitizenInfo ssn(@RequestBody Citizen citizen) {
		CitizenInfo citizenInfo=new CitizenInfo();
		citizenInfo.setSsnId(citizen.getSsnId());
		long id=citizen.getSsnId();
	    String val=String.valueOf(id);
	
		if(val.startsWith("1")) {
			citizenInfo.setState("New Jersy");
		}else if(val.startsWith("2")) {
			citizenInfo.setState("Rodhe Island");
		}else if(val.startsWith("3")) {
			citizenInfo.setState("New Jersy2");
		}
		else if(val.startsWith("4")) {
			citizenInfo.setState("New Jersy3");
		}
		else if(val.startsWith("5")) {
			citizenInfo.setState("New Jersy4");
		}
		else if(val.startsWith("6")) {
			citizenInfo.setState("ConneCuit");
		}
		else if(val.startsWith("7")) {
			citizenInfo.setState("New York");
		}else if(val.startsWith("8")) {
			citizenInfo.setState("Virgina");
		}else if(val.startsWith("9")) {
			citizenInfo.setState("Ohino");
		}
		
		
		
		return citizenInfo;
		
		
	}

}
