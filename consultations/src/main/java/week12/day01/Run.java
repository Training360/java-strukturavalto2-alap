package week12.day01;

import java.time.LocalDate;

public class Run {

    private double km;
    private LocalDate date;

    public Run(double km, LocalDate date) {
        this.km = km;
        this.date = date;
    }

    public double getKm() {
        return km;
    }

    public LocalDate getDate() {
        return date;
    }
}
