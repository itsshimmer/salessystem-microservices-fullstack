package com.inventoryms.InventoryMs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/inventory")
public class InventoryController {

    @GetMapping
    public String getInventory() {
        return "Inventory MS is working. #usguri venceu";
    }
}
