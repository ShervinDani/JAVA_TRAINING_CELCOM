package com.celcom.day10.railwayreservation;

public class Ticket {
	private Person[] person;
	private String trainName;
	private String seatNumber;
	public Ticket(Person[] person, String trainName, String seatNumber) {
		super();
		this.person = person;
		this.trainName = trainName;
		this.seatNumber = seatNumber;
	}
	public Person[] getPerson() {
		return person;
	}
	public void setPerson(Person[] person) {
		this.person = person;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}
	
}
