package com.logtrack.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.logtrack.exception.EmptyReportException;
import com.logtrack.model.Maintenance;
import com.logtrack.model.Sector;

public class MaintenanceManager {
 private List<Maintenance> maintenanceList;
    public MaintenanceManager() {
        this.maintenanceList = new ArrayList<>();
    }

    public void addMaintenance(Maintenance maintenance) {
        this.maintenanceList.add(maintenance);
    }

    public double calculateTotalCost() {
        return this.maintenanceList.stream().mapToDouble(m -> m.calculateRepairCost()).sum();
    }

    public List<Maintenance> filterBySector(Sector sector) {
        return this.maintenanceList.stream().filter(m -> m.getSector() == sector).collect(Collectors.toList());
    }
    public long countUrgentMaintenances() {
        return this.maintenanceList.stream().filter(m -> m.isUrgent()).count();
    }
    public Maintenance getLongestCriticalStop() {
        return this.maintenanceList.stream().max(Comparator.comparingDouble(Maintenance:: calculateRepairCost)).orElseThrow(() -> new EmptyReportException("Sua mensagem aqui"));
    }
}
