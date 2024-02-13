package in.anil.binding;

public class SsaResponse {
	
	private String ssn;
	
	private String stateName;

	public SsaResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	@Override
	public String toString() {
		return "CitizenResponse [ssn=" + ssn + ", stateName=" + stateName + "]";
	}
	
	

}
