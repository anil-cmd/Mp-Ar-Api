package in.anil.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.anil.entity.CitizenApplicationDetails;

public interface ApplicationRepo extends JpaRepository<CitizenApplicationDetails, Integer>{

}
