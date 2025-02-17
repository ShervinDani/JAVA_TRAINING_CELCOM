package com.celcom.day10.railwayreservation;

import java.util.ArrayList;
import java.util.HashMap;

public class TicketManager {
	HashMap<String, ArrayList<Ticket>> trains = new HashMap();
	public TicketManager() {
		trains.put("120 CHENNAI EGMORE", null);
		trains.put("131 KOLLAM", null);
	}
	public void bookTicket() {
		
	}
}
