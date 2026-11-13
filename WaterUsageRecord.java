package Assignment;

import java.time.LocalDate;

public class WaterUsageRecord {
    // private variables
    private WaterFixture fixture;
    private LocalDate date;
    private Double litres;

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
        this.fixture = newFixture;
    }

    // Getter for Record Date
    public LocalDate getDate() {
        return date;
    }

    // Setter for Record Date
    public void setDate( LocalDate newDate) {
        this.date = newDate;
    }
    
    // Getter for recorded litres of water used
    public double getLitres() {
        return litres;
    }

    // Setter for recorded litres of water used
    public void setLitres(Double newLitres) {
        this.litres = newLitres;
    }
}
