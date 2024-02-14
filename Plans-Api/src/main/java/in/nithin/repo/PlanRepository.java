package in.nithin.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.nithin.entity.PlanDetails;

@Repository
public interface PlanRepository extends JpaRepository<PlanDetails,Integer>{

}
