package in.nithin.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.nithin.entity.PlanDetails;
import in.nithin.service.PlanServiceImpl;

@RestController
@RequestMapping("/plan")
public class PlanRestController {
	@Autowired
	private PlanServiceImpl service;
	
	@PostMapping
	public String Create(@RequestBody PlanDetails p) {
		     PlanDetails plan=service.insert(p);
		     if(plan!=null) {
		    	 return "Plan Inserted";
		     }
		
		return "Plan failed to insert";		
		
	}
	@PutMapping
	public String updated(@RequestBody PlanDetails p) {
		boolean flag=service.update(p);
		if(flag) {
			return "updated";
		}
		return "failed";
	}
	
	@DeleteMapping
	public String remove(@RequestBody PlanDetails p) {
		boolean flag=service.delete(p);
		if(flag) {
			return "Deleted";
		}
		return "failed";
	}
	
	@GetMapping
	public List<PlanDetails> getAll() {
	  return service.allPlans();
	}
	

}

