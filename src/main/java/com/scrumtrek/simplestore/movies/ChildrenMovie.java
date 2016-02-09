package com.scrumtrek.simplestore.movies;

import com.scrumtrek.simplestore.ReportStatement;

/**
 * Created by Admin on 08.02.2016.
 */
public class ChildrenMovie extends Movie {

    public ChildrenMovie(String title, double price, double longTermPrice, int dayThreshold) {
        super(title, price, longTermPrice, dayThreshold);
    }

    @Override
    public ReportStatement getStatement(int daysRented) {
        double thisAmount = getPrice();
        if (daysRented > getDayThreshold()) {
            thisAmount = (daysRented - getDayThreshold()) * getPrice();
        }

        return new ReportStatement("MovieName:" + this.getTitle(), thisAmount);
    }
}
