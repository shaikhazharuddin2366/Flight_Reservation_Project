package com.flightreservation.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flightreservation.entity.Flight;
import com.flightreservation.repository.FlightRepository;

@Controller
public class FlightController {
	@Autowired
	FlightRepository flightRepository;

	@RequestMapping("/findFlight")
	public String findFlight(@RequestParam("from") String from, @RequestParam("to") String to,
			@RequestParam("departureDate") @DateTimeFormat(pattern = "yyyy-MM-dd") String date, ModelMap modelMap)
			throws ParseException {
		System.out.println(from + "" + to + "" + "" + date);
		Date departureDate = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).parse(date);
		List<Flight> flights = flightRepository.findByDateOfDeparture(departureDate);
		System.out.println(flights);
//		System.out.println(flights);
//		for (Flight f : flights) {
//			System.out.println(f.getArrivalCity());
//		}
		modelMap.addAttribute("flights", flights);
		return "displayflight";
	}
	
	
	@RequestMapping("/registerflight")
	public String showFlight() {		
		return "registerflight";
		
	}
	
	
	@RequestMapping("/saveflight")
	public String registerFlight(@ModelAttribute("flight") Flight flight) {
		
		flightRepository.save(flight);
		
		return "registerflight";
	}
}
