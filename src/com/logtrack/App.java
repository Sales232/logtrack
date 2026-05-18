package com.logtrack;

import com.logtrack.exception.EmptyReportException;
import com.logtrack.model.CriticalStop;
import com.logtrack.model.Maintenance;
import com.logtrack.model.PreventiveMaintenance;
import com.logtrack.model.Sector;
import com.logtrack.service.MaintenanceManager;

public class App {
    public static void main(String[] args) throws Exception {
        MaintenanceManager manager = new MaintenanceManager();
        try {
            manager.getLongestCriticalStop();
        } catch (EmptyReportException e) {
            System.out.println("Mensagem de erro: " + e.getMessage());
        }

        PreventiveMaintenance pm1 = new PreventiveMaintenance("Bomba de Água", 500.0,Sector.LOGISTICS);
        PreventiveMaintenance pm2 = new PreventiveMaintenance("Motor", 600.0, Sector.REFINERY);
        manager.addMaintenance(pm1);
        manager.addMaintenance(pm2);

        CriticalStop cs1 = new CriticalStop("Falha no motor", 3, Sector.REFINERY);
        CriticalStop cs2 = new CriticalStop("Vazamento na tubulação", 5, Sector.LOGISTICS);
        manager.addMaintenance(cs1);
        manager.addMaintenance(cs2);
        
        System.out.println("Custo total de manutenção: " + manager.calculateTotalCost());
        System.out.println("A quantidade de manutenções urgentes foram: " + manager.countUrgentMaintenances());

        Maintenance BiggestStop = manager.getLongestCriticalStop();
        System.out.println("O maior custo de manutenção crítica é: " + BiggestStop.getDescription());
    }
}