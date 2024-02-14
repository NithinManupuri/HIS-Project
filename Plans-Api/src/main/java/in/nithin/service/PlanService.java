package in.nithin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.nithin.entity.PlanDetails;


@Service
public interface PlanService {
	public List<PlanDetails> allPlans();
	public PlanDetails insert(PlanDetails p);
	public boolean update(PlanDetails p);
	public boolean delete(PlanDetails p);

}
