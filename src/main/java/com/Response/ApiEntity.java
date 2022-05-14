package com.Response;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.springframework.http.HttpStatus;

public class ApiEntity {
	
	private String date;
	private String status;
	private ArrayList<Object> stocks;
	
	public ApiEntity() {
		this.date = date;
		this.status = status;
		this.stocks = stocks;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public ArrayList<Object> getStocks() {
		return stocks;
	}

	public void setStocks(ArrayList<Object> stocks) {
		this.stocks = stocks;
	}	
	
}
