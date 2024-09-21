package com.gourav.scamReportApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Email {

    @Id
    private String email;
    private int reportCount;


    public Email() {
    }

    public Email(String email, int reportCount) {
        this.email = email;
        this.reportCount = reportCount;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getReportCount() {
        return reportCount;
    }

    public void setReportCount(int reportCount) {
        this.reportCount = reportCount;
    }

    @Override
    public String toString() {
        return "Email{" +
                "email='" + email + '\'' +
                ", reportCount=" + reportCount +
                '}';
    }
}
