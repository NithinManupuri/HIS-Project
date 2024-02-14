package in.nithin.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import in.spring.binding.Citizen;
import in.spring.binding.CitizenInfo;

@Service
public class AppServiceImpl implements AppService {
	
	
	/*RestTemplate rt=new RestTemplate();
    @Override
    public  String validApp(Citizen details) {
       

        String url="http://localhost:8080/get";
		
		ResponseEntity<CitizenInfo> t=rt.postForEntity(url,details, CitizenInfo.class);
		
		return t.getBody().getState();
		 
    }*/
	WebClient client=WebClient.create();

	@Override
	public String validApp(Citizen citizen) {
		String s= client.post().uri("http://localhost:8080/get").bodyValue(citizen).retrieve().bodyToMono(CitizenInfo.class).block().getState();
		System.out.println(s);
		return s;
	}
	
}
