package com.logtrack.model;

public class CriticalStop implements Maintenance{
    private String equipmentName;
    private int hoursDown;
    private Sector sector;

    public CriticalStop(String equipmentName, int hoursDown, Sector sector) {
        this.equipmentName = equipmentName;
        this.hoursDown = hoursDown;
        this.sector = sector;
    }

    @Override
    public double calculateRepairCost() {
        return hoursDown * sector.getHourlyRate();
    }

    @Override
    public String getDescription() {
        return "PARADA CRÍTICA: " + this.equipmentName + " paralisado por " + this.hoursDown + " horas.";
    }

    @Override
    public boolean isUrgent() {
        return true;
    }
    @Override
    public Sector getSector() {
        return this.sector;
    }
}