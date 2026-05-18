package com.logtrack.model;

public class PreventiveMaintenance implements Maintenance {
    private String equipmentName;
    private double partsCost;
    private Sector sector;

    public PreventiveMaintenance(String equipmentName, double partsCost, Sector sector) {
        this.equipmentName = equipmentName;
        this.partsCost = partsCost;
        this.sector = sector;
    }
    @Override
    public double calculateRepairCost() {
        return this.partsCost;
    }
    @Override
    public String getDescription() {
        return "Manutenção preventiva programada no equipamento: " + this.equipmentName;
    }
    @Override
    public boolean isUrgent() {
        return false;
    }
    @Override
    public Sector getSector() {
        return this.sector;
    }
}