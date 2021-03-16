package hu.nive.ujratervezes.zarovizsga.workhours;

import java.time.LocalDate;

public class Employee {

    private final String name;
    private final int hours;
    private final LocalDate date;

    public Employee(String name, int hours, LocalDate date) {
        this.name = name;
        this.hours = hours;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public int getHours() {
        return hours;
    }

    public LocalDate getDate() {
        return date;
    }

}
