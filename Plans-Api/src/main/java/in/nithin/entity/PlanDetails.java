package in.nithin.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class PlanDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer pid;
	private String pname;
	private Date  sdate;
	private Date edate;
}