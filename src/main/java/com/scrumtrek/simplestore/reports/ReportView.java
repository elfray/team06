package com.scrumtrek.simplestore.reports;

import com.scrumtrek.simplestore.ReportStatement;

/**
 * Created by elfray on 09.02.16.
 */
public abstract class ReportView {
    public abstract String getReport(ReportStatement stm, ReportElementFormat format);
}
