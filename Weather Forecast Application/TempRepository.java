package com.cloud.compute;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;


public interface TempRepository extends JpaRepository<Temp, Long> {
     
	Collection<Temp> findByDate(String Date);

	

	List<Temp> deleteByDate(String date1);

	@Query(value = "SELECT * FROM temp_details td WHERE td.date BETWEEN  :Date1 AND DATE_ADD(:Date1, INTERVAL 6 DAY)", nativeQuery=true)
    public List<Temp> findForecast(@Param("Date1") String Date1);

	@Query(value ="SELECT * FROM temp_details WHERE Month(Date) = :month AND DAY(Date) = :day", nativeQuery=true)
	/*@Query(value ="SELECT * FROM temp_details td WHERE Month(td.date) = :month ", nativeQuery=true)*/
	public Collection<Temp> findFutureForecast(@Param("month")int month,@Param("day")int day);
	
}

