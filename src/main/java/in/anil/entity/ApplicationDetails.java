package in.anil.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ApplicationDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer applicationId;
	
	private String name;
	
	private String dob;
	
	private String ssn;

	public ApplicationDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ApplicationDetails(Integer applicationId, String name, String dob, String ssn) {
		super();
		this.applicationId = applicationId;
		this.name = name;
		this.dob = dob;
		this.ssn = ssn;
	}

	public Integer getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Integer applicationId) {
		this.applicationId = applicationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "ApplicationDetails [applicationId=" + applicationId + ", name=" + name + ", dob=" + dob + ", ssn=" + ssn
				+ "]";
	}
	
	
}
