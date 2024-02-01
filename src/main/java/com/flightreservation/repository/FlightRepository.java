package com.flightreservation.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.flightreservation.entity.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
////	@Query("from Flight where departureCity=:departureCity and arrivalCity=:arrivalCity and dateOfDeparture=:dateOfDeparture")
	
//	  List<Flight> findByFlights(@Param("departureCity") String
//	  from, @Param("arrivalCity") String to);
	 

List<Flight> findByDateOfDeparture(Date dateOfDeparture);

}
