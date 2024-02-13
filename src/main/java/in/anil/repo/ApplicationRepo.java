package in.anil.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.anil.entity.ApplicationDetails;

public interface ApplicationRepo extends JpaRepository<ApplicationDetails, Integer>{

}
