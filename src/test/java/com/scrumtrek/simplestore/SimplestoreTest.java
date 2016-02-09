package com.scrumtrek.simplestore;

import com.scrumtrek.simplestore.movies.XXXMovie;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Admin on 08.02.2016.
 */

public class SimplestoreTest {

    final String MOVIE_TITLE = "movie_name";
    @org.junit.Test
    public void testXXXMovie() {
        XXXMovie m = new XXXMovie("XXX");
        Customer c = new Customer("Cust");
        c.addRental(new Rental(m,4));

        String stm = c.printStatement(Customer.ReportFormat.PLAIN);

        assertEquals("Movie price codes are not equal", "Rental record for Cust\n" +
                "\tXXX\t3.00\n" +
                "Amount owed is 3.00\n" +
                "You earned 1 frequent renter points.", stm);
        //assertEquals("Movie titles are not equal", MOVIE_TITLE, movie.getTitle());
    }

    @org.junit.Test
    public void testXXXMovie2() {
        XXXMovie m = new XXXMovie("XXX");
        Customer c = new Customer("Cust");
        c.addRental(new Rental(m,6));

        String stm = c.printStatement(Customer.ReportFormat.PLAIN);

        assertEquals("Movie price codes are not equal", "Rental record for Cust\n" +
                "\tXXX\t2.40\n" +
                "Amount owed is 2.40\n" +
                "You earned 1 frequent renter points.", stm);
        //assertEquals("Movie titles are not equal", MOVIE_TITLE, movie.getTitle());
    }
//todo - исправить тесты
//    @org.junit.Test
//    public void testMovieGetters() {
//        Movie movie = new Movie(MOVIE_TITLE, MOVIE_PRICE_CODE);
//        assertEquals("Movie price codes are not equal", MOVIE_PRICE_CODE, movie.getPriceCode());
//        assertEquals("Movie titles are not equal", MOVIE_TITLE, movie.getTitle());
//    }
//
//    @org.junit.Test
//    public void testMovieSetter() {
//        Movie movie = new Movie(MOVIE_TITLE, MOVIE_PRICE_CODE);
//        final PriceCodes NEW_PRICE_CODE = PriceCodes.NEW_RELEASE;
//        movie.setPriceCode(NEW_PRICE_CODE);
//        assertTrue(NEW_PRICE_CODE.equals(movie.getPriceCode()));
//    }
//
//    @org.junit.Test
//    public void testRentalGetters() {
//        Movie movie = new Movie(MOVIE_TITLE, MOVIE_PRICE_CODE);
//        final int DAYS_RENTAL = 7;
//        Rental rental = new Rental(movie, DAYS_RENTAL);
//        assertEquals(DAYS_RENTAL, rental.getDaysRented());
//        assertEquals("Movie price codes are not equal", MOVIE_PRICE_CODE, rental.getMovie().getPriceCode());
//        assertEquals("Movie titles are not equal", MOVIE_TITLE, rental.getMovie().getTitle());
//    }
//
//    @org.junit.Test
//    public void testChildrenLessThenLimit() {
//        final String CUSTOMER_NAME = "PIG";
//        final int RENTAL_DAYS = 2;
//        final String MOVIE_NAME = "Cinderella";
//        Customer customer = new Customer(CUSTOMER_NAME);
//        final PriceCodes CINDERELLA_CODE = PriceCodes.CHILDRENS;
//        Movie movCinderella = new Movie(MOVIE_NAME, CINDERELLA_CODE);
//        Rental rental1 = new Rental(movCinderella, RENTAL_DAYS);
//        customer.addRental(rental1);
//
//        double expectedAmount = evaluateChildren(RENTAL_DAYS);
//
//        String expectedResult = "Rental record for PIG\n" +
//                "\t" + MOVIE_NAME + "\t" + expectedAmount + "\nAmount owed is " + expectedAmount + "\nYou earned "
//                + eveluateFrequentRenterPoints(CINDERELLA_CODE, RENTAL_DAYS) + " frequent renter points.";
//        assertEquals(expectedResult, customer.printStatement());
//    }
//
//    @org.junit.Test
//    public void testChildrenMoreThenLimit() {
//        final String CUSTOMER_NAME = "PIG";
//        final int RENTAL_DAYS = 5;
//        final String MOVIE_NAME = "Cinderella";
//        Customer customer = new Customer(CUSTOMER_NAME);
//        final PriceCodes CINDERELLA_CODE = PriceCodes.CHILDRENS;
//        Movie movCinderella = new Movie(MOVIE_NAME, CINDERELLA_CODE);
//        Rental rental1 = new Rental(movCinderella, RENTAL_DAYS);
//        customer.addRental(rental1);
//
//        double expectedAmount = evaluateChildren(RENTAL_DAYS);
//
//        String expectedResult = "Rental record for PIG\n" +
//                "\t" + MOVIE_NAME + "\t" + expectedAmount + "\nAmount owed is " + expectedAmount + "\nYou earned "
//                + eveluateFrequentRenterPoints(CINDERELLA_CODE, RENTAL_DAYS) + " frequent renter points.";
//        assertEquals(expectedResult, customer.printStatement());
//    }
//
//    @org.junit.Test
//    public void testRegularMoreThenLimit() {
//        final String CUSTOMER_NAME = "PIG";
//        final int RENTAL_DAYS = 5;
//        final String MOVIE_NAME = "Cinderella";
//        Customer customer = new Customer(CUSTOMER_NAME);
//        final PriceCodes CINDERELLA_CODE = PriceCodes.REGULAR;
//        Movie movCinderella = new Movie(MOVIE_NAME, CINDERELLA_CODE);
//        Rental rental1 = new Rental(movCinderella, RENTAL_DAYS);
//        customer.addRental(rental1);
//
//        double expectedAmount = evaluateRegular(RENTAL_DAYS);
//
//        String expectedResult = "Rental record for PIG\n" +
//                "\t" + MOVIE_NAME + "\t" + expectedAmount + "\nAmount owed is " + expectedAmount + "\nYou earned "
//                + eveluateFrequentRenterPoints(CINDERELLA_CODE, RENTAL_DAYS) + " frequent renter points.";
//        assertEquals(expectedResult, customer.printStatement());
//    }
//
//    @org.junit.Test
//    public void testRegularLessThenLimit() {
//        final String CUSTOMER_NAME = "PIG";
//        final int RENTAL_DAYS = 1;
//        final String MOVIE_NAME = "Cinderella";
//        Customer customer = new Customer(CUSTOMER_NAME);
//        final PriceCodes CINDERELLA_CODE = PriceCodes.REGULAR;
//        Movie movCinderella = new Movie(MOVIE_NAME, CINDERELLA_CODE);
//        Rental rental1 = new Rental(movCinderella, RENTAL_DAYS);
//        customer.addRental(rental1);
//
//        double expectedAmount = evaluateRegular(RENTAL_DAYS);
//
//        String expectedResult = "Rental record for PIG\n" +
//                "\t" + MOVIE_NAME + "\t" + expectedAmount + "\nAmount owed is " + expectedAmount + "\nYou earned "
//                + eveluateFrequentRenterPoints(CINDERELLA_CODE, RENTAL_DAYS) + " frequent renter points.";
//        assertEquals(expectedResult, customer.printStatement());
//    }
//
//    @org.junit.Test
//    public void testNewRelease() {
//        final String CUSTOMER_NAME = "PIG";
//        final int RENTAL_DAYS = 1;
//        final String MOVIE_NAME = "Cinderella";
//        Customer customer = new Customer(CUSTOMER_NAME);
//        final PriceCodes CINDERELLA_CODE = PriceCodes.NEW_RELEASE;
//        Movie movCinderella = new Movie(MOVIE_NAME, CINDERELLA_CODE);
//        Rental rental1 = new Rental(movCinderella, RENTAL_DAYS);
//        customer.addRental(rental1);
//
//        double expectedAmount = evaluateNewRelease(RENTAL_DAYS);
//
//        String expectedResult = "Rental record for PIG\n" +
//                "\t" + MOVIE_NAME + "\t" + expectedAmount + "\nAmount owed is " + expectedAmount + "\nYou earned "
//                + eveluateFrequentRenterPoints(CINDERELLA_CODE, RENTAL_DAYS) + " frequent renter points.";
//        assertEquals(expectedResult, customer.printStatement());
//    }
//
//    private double evaluateChildren(int days) {
//        double thisAmount = 0;
//        thisAmount += 1.5;
//        if (days > 3) {
//            thisAmount = (days - 3) * 1.5;
//        }
//        return thisAmount;
//    }
//
//    private double evaluateRegular(int days) {
//        double thisAmount = 2;
//        if (days > 2) {
//            thisAmount += (days - 2) * 1.5;
//        }
//        return thisAmount;
//    }
//
//    private double evaluateNewRelease(int days) {
//        return days * 3;
//    }


    private int eveluateFrequentRenterPoints(PriceCodes codes, int days) {
        // Add bonus for a two-day new-release rental
        int frequentRenterPoints = 1;
        if ((codes == PriceCodes.NEW_RELEASE) && (days > 1))
        {
            frequentRenterPoints ++;
        }
        return frequentRenterPoints;
    }
}
