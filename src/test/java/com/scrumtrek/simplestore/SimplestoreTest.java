package com.scrumtrek.simplestore;

import com.scrumtrek.simplestore.movies.NewReleaseMovie;
import com.scrumtrek.simplestore.movies.XXXMovie;
import com.scrumtrek.simplestore.reports.PlainReportView;
import com.scrumtrek.simplestore.reports.ReportElementFormat;
import junit.framework.Assert;

import java.util.LinkedList;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;

public class SimplestoreTest {

    @org.junit.Test
    public void letsRock()
    {
        Customer c = new Customer("testCustomer");
        Rental r = new Rental(new LinkedList<>(), 5);
        NewReleaseMovie m2 = new NewReleaseMovie("NewRelease",5,3,3);
        XXXMovie m = new XXXMovie("XXX", 5,3,3);
        r.getMovies().add(m);
        r.getMovies().add(m2);
        c.getMovieRentals().add(r);

        ReportElementFormat cr = new ReportElementFormat();
        cr.setNeedFooter(false);
        cr.setNeedHeader(true);
        cr.setNeedBody(true);

        ReportElementFormat rr = new ReportElementFormat();
        rr.setNeedFooter(true);
        rr.setNeedHeader(true);
        rr.setNeedBody(true);
        cr.setChildFormat(rr);

        ReportElementFormat mr = new ReportElementFormat();
        mr.setNeedFooter(false);
        mr.setNeedHeader(true);
        mr.setNeedBody(false);
        rr.setChildFormat(mr);


        PlainReportView pv = new PlainReportView();
        String rep = pv.getReport(c.getStatement(),cr);

        assertEquals("123", rep);
    }
}
