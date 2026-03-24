package com.example.orders.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ErrorDTO {
	private LocalDate timestamp;
	private String message;
	private int status;
	
	public ErrorDTO() {
		// TODO Auto-generated constructor stub
	}

	public ErrorDTO(LocalDate timestamp, String message, int status) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.status = status;
	}

	public LocalDate getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDate timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
}
