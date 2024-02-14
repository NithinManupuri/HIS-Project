package in.nithin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nithin.entity.PlanDetails;
import in.nithin.repo.PlanRepository;

@Service
public class PlanServiceImpl implements PlanService {

	@Autowired
	private PlanRepository repo;

	@Override
	public List<PlanDetails> allPlans() {
		return repo.findAll();
		
	}

	@Override
	public PlanDetails insert(PlanDetails p) {
		
	     PlanDetails plan=repo.save(p);
		return plan;
	}

	@Override
	public boolean update(PlanDetails p) {
		
		try{
			repo.save(p);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(PlanDetails p) {
		 try {
		        repo.delete(p);
		        return true;
		    } catch (Exception e) {
		        e.printStackTrace();
		        return false;
		    }
	}

}
