package in.anil.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CitizenApplicationDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer applicationNumber;
	
	private String fullName;
	
	private String dob;
	
	private String ssn;
	
	private String gender;
	
	private Integer userId;
	
	private Integer planId;
	
	@CreationTimestamp
	@Column(updatable = false)
	private LocalDateTime createdDate;
	
	@UpdateTimestamp
	@Column(insertable = false)
	private LocalDateTime updatedDate;

	public CitizenApplicationDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CitizenApplicationDetails(Integer applicationNumber, String fullName, String dob, String ssn, String gender,
			Integer userId, Integer planId, LocalDateTime createdDate, LocalDateTime updatedDate) {
		super();
		this.applicationNumber = applicationNumber;
		this.fullName = fullName;
		this.dob = dob;
		this.ssn = ssn;
		this.gender = gender;
		this.userId = userId;
		this.planId = planId;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

	public Integer getApplicationNumber() {
		return applicationNumber;
	}

	public void setApplicationNumber(Integer applicationNumber) {
		this.applicationNumber = applicationNumber;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getPlanId() {
		return planId;
	}

	public void setPlanId(Integer planId) {
		this.planId = planId;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "CitizenApplicationDetails [applicationNumber=" + applicationNumber + ", fullName=" + fullName + ", dob="
				+ dob + ", ssn=" + ssn + ", gender=" + gender + ", userId=" + userId + ", planId=" + planId
				+ ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
	}
	
}
