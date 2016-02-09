package com.scrumtrek.simplestore.movies;

import com.scrumtrek.simplestore.PricePolicy;
import com.scrumtrek.simplestore.Rental;
import com.scrumtrek.simplestore.ReportStatement;

/**
 * Created by Admin on 08.02.2016.
 */
public class NewReleaseMovie extends Movie {


    public NewReleaseMovie(String title, double price, double longTermPrice, int dayThreshold) {
        super(title, price, longTermPrice, dayThreshold);
    }

    @Override
    public ReportStatement getStatement(int daysRented) {

        return new ReportStatement("MovieName:" + getTitle(), daysRented*getPrice());
    }
}
