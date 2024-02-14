package in.nithin.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.nithin.entity.CitizenData;

@Repository
public interface CitizenRepository extends JpaRepository<CitizenData,Integer>{
   public CitizenData findByEmailAndPassword(String email,String password);

   public CitizenData findByEmail(String mail);
}
