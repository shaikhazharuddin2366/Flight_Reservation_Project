package com.flightreservation.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flightreservation.service.ReservationService;
import com.flightreservation.dto.ReservationRequest;
import com.flightreservation.entity.Flight;
import com.flightreservation.entity.Reservation;
import com.flightreservation.repository.FlightRepository;

@Controller
public class Reservationcontroller {
	@Autowired
	FlightRepository flightRepository;
	@Autowired
	ReservationService reservationService;
	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId") Long flightId, ModelMap modelMap) {
		
		  Flight flight = flightRepository.findById(flightId).get();
		  modelMap.addAttribute("flight", flight);
		  
		  return "completeReservation";
		 

	}
	@RequestMapping(value = "/completeReservation")
	public String completeReservation(ReservationRequest request, ModelMap modelMap) {
		Reservation reservation = reservationService.bookFlight(request);
		modelMap.addAttribute("msg", "Reservation created successfully and the id is " + reservation.getId());
		return "reservationconfiguration";

	}	}

