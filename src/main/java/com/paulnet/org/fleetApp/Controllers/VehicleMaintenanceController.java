package com.paulnet.org.fleetApp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleMaintenanceController {
    @GetMapping("/vehiclemaintenances")
    public String getVehicleMaintenance(){
        return "vehiclemaintenance";
    }
}
