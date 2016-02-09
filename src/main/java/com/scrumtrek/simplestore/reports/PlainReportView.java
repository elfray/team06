package com.scrumtrek.simplestore.reports;

import com.scrumtrek.simplestore.ReportStatement;

/**
 * Created by elfray on 09.02.16.
 */
public class PlainReportView extends ReportView {

    @Override
    public String getReport(ReportStatement stm, ReportElementFormat format) {

        String report = (format == null || format.isNeedHeader()) ? stm.getTitle() : "";
        report += "\n";

        if(format == null || format.isNeedBody()) {
            for (ReportStatement s : stm.getChildren()) {
                report += "\t" + this.getReport(s, (format != null ? format.getChildFormat() : null));
            }
        }

        report += (format == null || format.isNeedFooter()) ? stm.getAmount() : "";
        report += "\n";
        return report;
    }
}
