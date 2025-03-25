package org.campusflow.sms.repository;

import org.campusflow.sms.entity.ManagementEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ManagementRepository extends JpaRepository<ManagementEntity, Integer>   {

	
	
}
