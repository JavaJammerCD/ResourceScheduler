package com.bod.reservation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bod.desk.Desk;

@RestController
public class ReservationController {
	
	@Autowired
	private ReservationService reservationService;
	
	@RequestMapping("/reservations")
	public List<Reservation> getAllTopics() {
		return reservationService.findAllReservations();
	}
	
	@RequestMapping("/reservations/{deskId}")
	public List<Reservation> findAllReservationsForDesk(@PathVariable Long deskId){
		return reservationService.getAllReservationsForDesk(deskId);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/reservations")
	public void addDesk(@RequestBody Reservation reservation) {
		reservationService.addReservation(reservation);
	}
	
	

}
