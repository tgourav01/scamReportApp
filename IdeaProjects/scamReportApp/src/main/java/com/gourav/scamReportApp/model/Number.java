package com.gourav.scamReportApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Number {

    @Id
    private long number;
    private int reportCount;

    public Number() {
    }

    public Number(long number, int reportCount) {
        this.number = number;
        this.reportCount = reportCount;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public int getReportCount() {
        return reportCount;
    }

    public void setReportCount(int reportCount) {
        this.reportCount = reportCount;
    }

    @Override
    public String toString() {
        return "Number{" +
                "number=" + number +
                ", reportCount=" + reportCount +
                '}';
    }
}
