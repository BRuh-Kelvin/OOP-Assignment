package CKW.Assignment;

import java.time.LocalDate;

public class WaterUsageRecord {
    // private variables
    private WaterFixture fixture;
    private LocalDate date;
    private double litres;

    // WaterUsageRecord Object Constructor
    public WaterUsageRecord(WaterFixture fixture, LocalDate date, double litres) { // LocalDate Object String like "2026-11-13" in "format (YYYY-MM-DD)"
        setFixture(fixture);
        setDate(date);
        setLitres(litres);
    }

    // Getter for Recorded Fixture
    public WaterFixture getFixture() {
        return fixture;
    }

    // Setter for Recorded Fixture
    public void setFixture(WaterFixture newFixture) {
        // Exeception that should be caught in the main loop
        //if (newFixture == null){
        //    throw new IllegalArgumentException("Water fixture cannot be null.");
        // } Seemes like not needed
        this.fixture = newFixture;
    }

    // Getter for Record Date
    public LocalDate getDate() {
        return date;
    }

    // Setter for Record Date // how to ensure valid date or allow users to enter valid date
    public void setDate( LocalDate newDate) {
        // Exeception that should be caught in the main loop
        //if (newDate == null){
        //    throw new IllegalArgumentException("Date cannot be null.");
        //} seems like not needed
        this.date = newDate;
    }
    
    // Getter for recorded litres of water used
    public double getLitres() {
        return litres;
    }

    // Setter for recorded litres of water used
    public void setLitres(double newLitres) {
        // Exeception that should be caught in the main loop
        if (newLitres < 0) {
            throw new IllegalArgumentException("Litres of water used cannot be negative. Please try again with a valid amount of litres used (double)");
        }
        this.litres = newLitres;
    }

}
