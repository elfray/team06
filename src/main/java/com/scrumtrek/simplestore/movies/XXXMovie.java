package com.scrumtrek.simplestore.movies;

import com.scrumtrek.simplestore.PricePolicy;
import com.scrumtrek.simplestore.Rental;

/**
 * Created by elfray on 09.02.16.
 */
public class XXXMovie extends Movie {
    public static final int XXX_PRICE = 3;

    public XXXMovie(String title) {
        super(title, new PricePolicy(5, XXX_PRICE));
    }

    @Override
    public double evaluateAmount(Rental rental) {
        return rental.getDaysRented() > getDaysLimit() ? XXX_PRICE * 0.8 : XXX_PRICE;
    }
}
