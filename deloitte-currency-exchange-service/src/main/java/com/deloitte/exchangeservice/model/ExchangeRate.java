package com.deloitte.exchangeservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name = "Exchangerate")
public class ExchangeRate {

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String fromCur;
	String toCur;
	float exchangeValue;
	int port;
	
	
	public ExchangeRate() {
		
		// TODO Auto-generated constructor stub
	}
	public ExchangeRate(String fromCur, String toCur, float exchangeValue, int port) {
		super();
		this.fromCur = fromCur;
		this.toCur = toCur;
		this.exchangeValue = exchangeValue;
		this.port = port;
	}
	public String getFromCur() {
		return fromCur;
	}
	public void setFromCur(String fromCur) {
		this.fromCur = fromCur;
	}
	public String getToCur() {
		return toCur;
	}
	public void setToCur(String toCur) {
		this.toCur = toCur;
	}
	public float getExchangeValue() {
		return exchangeValue;
	}
	public void setExchangeValue(float exchangeValue) {
		this.exchangeValue = exchangeValue;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public int getId() {
		return id;
	}
	
	
	
	
	
	
}