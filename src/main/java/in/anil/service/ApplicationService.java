package in.anil.service;

import in.anil.binding.SsaRequestForm;
import in.anil.binding.SsaResponse;

public interface ApplicationService {
	
	SsaResponse getStateOfCitizen(SsaRequestForm ssaRequestForm);
	
	boolean checkValidApplication(SsaRequestForm ssaRequestForm);

}
