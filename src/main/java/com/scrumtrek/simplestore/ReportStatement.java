package com.scrumtrek.simplestore;

import java.util.LinkedList;

/**
 * Created by elfray on 09.02.16.
 */
public class ReportStatement {
    LinkedList<ReportStatement> children = new LinkedList<>();

    private String title;
    private double amount;

    public LinkedList<ReportStatement> getChildren() {
        return children;
    }

    public void setChildren(LinkedList<ReportStatement> children) {
        this.children = children;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public ReportStatement(String title, double amount) {
        this.title = title;
        this.amount = amount;
    }
}
