package com.celcom.day10.railwayreservation;

public class Train {
	public final int  MAX_UPPER = 5;
	public final int  MAX_MIDDLE = 5;
	public final int  MAX_LOWER = 5;
	private int current_upper = 0;
	private int current_lower = 0;
	private int current_middle = 0;
	public int getCurrent_upper() {
		return current_upper;
	}
	public void setCurrent_upper(int current_upper) {
		this.current_upper = current_upper;
	}
	public int getCurrent_lower() {
		return current_lower;
	}
	public void setCurrent_lower(int current_lower) {
		this.current_lower = current_lower;
	}
	public int getCurrent_middle() {
		return current_middle;
	}
	public void setCurrent_middle(int current_middle) {
		this.current_middle = current_middle;
	}
	
}
