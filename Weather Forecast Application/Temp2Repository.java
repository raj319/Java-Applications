package com.cloud.compute;
import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface Temp2Repository extends JpaRepository<Temp2, Long> {
     
	Collection<Temp> findByDate(String Date);

	



	@Query(value = "SELECT * FROM temp_details", nativeQuery=true)
    public List<Temp2> finddates();
}