package com.logtrack.model;

public interface Maintenance {
    double calculateRepairCost();
    String getDescription();
    boolean isUrgent();
    Sector getSector();

}
