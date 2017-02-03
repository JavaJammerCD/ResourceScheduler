package com.bod.reservation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {
	
	@Autowired
	private ReservationRepository rr;

	public List <Reservation> getAllReservations(Long deskId){
		List <Reservation> reservations = new ArrayList<>();
		rr.findByDeskId(deskId).forEach(reservations::add);
		return reservations;
	}
}
