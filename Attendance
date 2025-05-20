package com.mycompany.employee;

import java.time.LocalTime;
import java.time.Duration;

public class Attendance {
    private double hrsWorked;
    private double lateMins;
    private LocalTime timeIn;
    private LocalTime timeOut;
    private static final LocalTime SCHEDULED_START = LocalTime.of(9, 0);// 9:00 AM as standard start time// Constructorpublic Attendance(LocalTime timeIn, LocalTime timeOut) {
        this.timeIn = timeIn;
        this.timeOut = timeOut;
        computeHours();
        computedLate();
    }

// Compute total hours workedpublic double computeHours() {
        if (timeIn != null && timeOut != null) {
            Duration duration = Duration.between(timeIn, timeOut);
            hrsWorked = duration.toMinutes() / 60.0;// Convert minutes to hoursreturn hrsWorked;
        }
        return 0.0;
    }

// Check if employee was latepublic boolean isLate() {
        return timeIn != null && timeIn.isAfter(SCHEDULED_START);
    }

// Compute late minutespublic void computedLate() {
        if (isLate()) {
            Duration lateDuration = Duration.between(SCHEDULED_START, timeIn);
            lateMins = lateDuration.toMinutes();
        } else {
            lateMins = 0.0;
        }
    }

// Getterspublic double getHrsWorked() {
        return hrsWorked;
    }

    public double getLateMins() {
        return lateMins;
    }

    public LocalTime getTimeIn() {
        return timeIn;
    }

    public LocalTime getTimeOut() {
        return timeOut;
    }

// Setterspublic void setTimeIn(LocalTime timeIn) {
        this.timeIn = timeIn;
        computeHours();
        computedLate();
    }

    public void setTimeOut(LocalTime timeOut) {
        this.timeOut = timeOut;
        computeHours();
        computedLate();
    }
}
