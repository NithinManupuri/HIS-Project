package in.nithin.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.nithin.entity.AppDetails;
import in.nithin.service.AppService;
import in.spring.binding.Citizen;


@RestController
public class ApplicationRestController {

    @Autowired
    private AppService service;

    @PostMapping("/app")
    public  String registerApp(@RequestBody AppDetails details) {
        Citizen citizen = new Citizen();
        citizen.setName(details.getName());
        citizen.setSsnId(details.getSsn());
        citizen.setDob(details.getDob());
        String str=service.validApp(citizen);
         if(str.equals("Rodhe Island")) {
        	 return "Passed";
         }
		return "Not Passes";

        
    }
}
