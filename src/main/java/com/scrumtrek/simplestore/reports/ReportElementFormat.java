package com.scrumtrek.simplestore.reports;

import java.util.LinkedList;

/**
 * Created by elfray on 09.02.16.
 */
public class ReportElementFormat {
    private boolean needHeader;
    private boolean needBody;
    private boolean  needFooter;
    private ReportElementFormat childFormat = null;

    public boolean isNeedHeader() {
        return needHeader;
    }

    public void setNeedHeader(boolean needHeader) {
        this.needHeader = needHeader;
    }

    public boolean isNeedBody() {
        return needBody;
    }

    public void setNeedBody(boolean needBody) {
        this.needBody = needBody;
    }

    public boolean isNeedFooter() {
        return needFooter;
    }

    public void setNeedFooter(boolean needFooter) {
        this.needFooter = needFooter;
    }

    public ReportElementFormat getChildFormat() {
        return childFormat;
    }

    public void setChildFormat(ReportElementFormat childFormat) {
        this.childFormat = childFormat;
    }
}
