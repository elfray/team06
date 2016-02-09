package com.scrumtrek.simplestore.movies;

import com.scrumtrek.simplestore.PricePolicy;
import com.scrumtrek.simplestore.Rental;
import com.scrumtrek.simplestore.ReportStatement;

/**
 * Created by elfray on 09.02.16.
 */
public class XXXMovie extends Movie {


    public XXXMovie(String title, double price, double longTermPrice, int dayThreshold) {
        super(title, price, longTermPrice, dayThreshold);
    }

    @Override
    public ReportStatement getStatement(int daysRented) {
        return new ReportStatement("MovieName:" + getTitle(), daysRented > getDayThreshold() ? getLongTermPrice() : getPrice());
    }
}
