package com.bod.reservation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationController {
	
	@Autowired
	private ReservationService reservationService;
	
	@RequestMapping("/reservations/{deskId}")
	public List<Reservation> findAllReservations(@PathVariable Long deskId){
		return reservationService.getAllReservations(deskId);
	}
	
	

}
