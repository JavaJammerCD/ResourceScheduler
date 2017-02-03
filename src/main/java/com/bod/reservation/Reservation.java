package com.bod.reservation;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.bod.desk.Desk;

@Entity
public class Reservation {

	@Id
	private int reservation_id;
	private Date date;
	private double start_time;
	private double end_time;

	@ManyToOne
	private Desk desk;
	
	public Reservation(){
		
	}

	public Reservation(int id, Date date, double start_time, double end_time, Desk desk) {
		super();
		this.reservation_id = id;
		this.date = date;
		this.start_time = start_time;
		this.end_time = end_time;
		this.desk = desk;
	}

	public Date getDate() {
		return date;
	}

	public Desk getDesk() {
		return desk;
	}

	public double getEnd_time() {
		return end_time;
	}

	public int getId() {
		return reservation_id;
	}

	public double getStart_time() {
		return start_time;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setDesk(Desk desk) {
		this.desk = desk;
	}

	public void setEnd_time(double end_time) {
		this.end_time = end_time;
	}

	public void setId(int id) {
		this.reservation_id = id;
	}

	public void setStart_time(double start_time) {
		this.start_time = start_time;
	}

}
