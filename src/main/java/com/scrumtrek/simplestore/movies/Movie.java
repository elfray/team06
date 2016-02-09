package com.scrumtrek.simplestore.movies;

import com.scrumtrek.simplestore.PricePolicy;
import com.scrumtrek.simplestore.ReportStatement;

import java.beans.Statement;

public abstract class Movie
{
	private String title;
	private double price;

	public double getLongTermPrice() {
		return longTermPrice;
	}

	public void setLongTermPrice(double longTermPrice) {
		this.longTermPrice = longTermPrice;
	}

	private double longTermPrice;
	private int dayThreshold;

	public Movie(String title, double price, double longTermPrice, int dayThreshold) {
		this.title = title;
		this.price = price;
		this.longTermPrice = longTermPrice;
		this.dayThreshold = dayThreshold;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getDayThreshold() {
		return dayThreshold;
	}

	public void setDayThreshold(int dayThreshold) {
		this.dayThreshold = dayThreshold;
	}

	public abstract ReportStatement getStatement(int daysRented);
}

