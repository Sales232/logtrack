package com.logtrack.model;

public enum Sector {
    PRODUCTION(500.00),
    LOGISTICS(400.00),
    REFINERY(600.00);

    private final double hourlyRate;
    Sector(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return this.hourlyRate;
    }
}
