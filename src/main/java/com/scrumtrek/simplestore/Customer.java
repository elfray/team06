package com.scrumtrek.simplestore;

import com.scrumtrek.simplestore.movies.Movie;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public List<Rental> getMovieRentals() {
		return movieRentals;
	}

	public void setMovieRentals(List<Rental> movieRentals) {
		this.movieRentals = movieRentals;
	}

	private String customerName;
	private List<Rental> movieRentals = new ArrayList<>();

	public Customer(String customerName) {
		this.customerName = customerName;
	}

	public  ReportStatement getStatement() //todo extract into interface
	{
		ReportStatement stm = new ReportStatement("Customer:" + this.getCustomerName(),0);
		double rentAmount = 0;

		for (Rental m : movieRentals ) {
			ReportStatement ms = m.getStatement();
			rentAmount += ms.getAmount();
			stm.getChildren().add(ms);
		}
		stm.setAmount(rentAmount);

		return stm;
	}
}

