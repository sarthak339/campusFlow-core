package org.campusflow.sms.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import java.util.Optional;
import org.campusflow.sms.entity.SchoolEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;





@Repository
public interface SchoolRepository extends JpaRepository<SchoolEntity, Integer> {
	
	Optional<SchoolEntity> findByName(String name); 
    
}
