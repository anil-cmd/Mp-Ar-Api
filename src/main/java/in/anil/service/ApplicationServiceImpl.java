package in.anil.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.databind.ObjectMapper;
import in.anil.binding.SsaRequestForm;
import in.anil.binding.SsaResponse;
import in.anil.entity.ApplicationDetails;
import in.anil.repo.ApplicationRepo;

@Service
public class ApplicationServiceImpl implements ApplicationService {
	
	@Autowired
	private ApplicationRepo applicationRepo;

	@Override
	public SsaResponse getStateOfCitizen(SsaRequestForm ssaRequestForm) {
		
		String url = "http://localhost:8069/get-state";
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		Map<String, String> requestBody = new HashMap<>();
		requestBody.put("name", ssaRequestForm.getName());
		requestBody.put("dob", ssaRequestForm.getDob());
		requestBody.put("ssn", ssaRequestForm.getSsn());
		
		HttpEntity<Map<String, String>> requestEntity = new HttpEntity<>(requestBody, headers);
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> responseEntity = restTemplate.postForEntity(url, requestEntity, String.class);
		String body = responseEntity.getBody();
		
		ObjectMapper objectMapper = new ObjectMapper();
		SsaResponse ssaResponse = null;
		try {
			ssaResponse = objectMapper.readValue(body, SsaResponse.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ssaResponse;
		
	}

	@Override
	public boolean checkValidApplication(SsaRequestForm ssaRequestForm) {
		
		SsaResponse response = getStateOfCitizen(ssaRequestForm);
		if(response.getStateName().equalsIgnoreCase("Rhode Island")) {
			ApplicationDetails applicationDetails = new ApplicationDetails();
			BeanUtils.copyProperties(ssaRequestForm, applicationDetails);
			ApplicationDetails savedApplicationDetails = applicationRepo.save(applicationDetails);
			if(savedApplicationDetails.getSsn().equalsIgnoreCase(ssaRequestForm.getSsn())) {
				return true;
			}
		}
		return false;	
	}
	
	
}
