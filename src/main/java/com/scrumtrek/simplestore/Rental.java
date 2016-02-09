package com.scrumtrek.simplestore;

import com.scrumtrek.simplestore.movies.Movie;

import java.beans.Statement;
import java.util.LinkedList;
import java.util.List;

public class Rental {
	private List<Movie> m_Movies = new LinkedList<Movie>();
	private int m_DaysRented;

	public Rental(List<Movie> movie, int daysRented) {
		m_Movies.addAll(movie);
		m_DaysRented = daysRented;
	}

	public int getDaysRented() {
		return m_DaysRented;
	}

	public List<Movie> getMovies() {
		return m_Movies;
	}

	public ReportStatement getStatement()
	{
		ReportStatement stm = new ReportStatement("Rental:", 0);
		double rentAmount = 0;
		for (Movie m : m_Movies ) {
			ReportStatement ms = m.getStatement(m_DaysRented);
			rentAmount += ms.getAmount();
			stm.getChildren().add(ms);
		}
		stm.setAmount(rentAmount);

		return stm;
	}
}

