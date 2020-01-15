package com.deloitte.exchangeservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.deloitte.exchangeservice.model.ExchangeRate;

public interface ExchangeRepo extends JpaRepository<ExchangeRate, Integer> {

	//@Query("from ExchangeRate where fromCur=:fromCur and toCur=:toCur")
	ExchangeRate findByFromCurAndToCur(String fromCur,String toCur); 
	
	
	
	
}
