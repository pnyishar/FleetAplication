package com.paulnet.org.fleetApp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InvoiceStatusController {
    @GetMapping("/invoicestatuses")
    public String getInvoiceStatus(){
        return "invoicestatus";
    }
}
