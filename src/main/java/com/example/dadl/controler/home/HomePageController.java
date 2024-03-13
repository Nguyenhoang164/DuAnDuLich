package com.example.dadl.controler.home;

import com.example.dadl.model.Services.Service.Service;
import com.example.dadl.service.IAdminService;
import com.example.dadl.service.ICustomerService;
import com.example.dadl.service.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
    @Autowired
    private ICustomerService customerService;
    @Autowired
    private IAdminService adminService;
    @Autowired
    private ISupplierService supplierService;
    @Autowired
    private ISer
    @GetMapping("")
    public String showHomePage(Model model){
        Iterable<Service> serviceIterable =
    }
}
