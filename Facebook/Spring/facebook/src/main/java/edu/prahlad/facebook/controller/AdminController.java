package edu.prahlad.facebook.controller;

import edu.prahlad.facebook.entity.actions.Page;
import edu.prahlad.facebook.entity.base.Member;
import edu.prahlad.facebook.service.AdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("account")
public class AdminController {
    Logger log = LoggerFactory.getLogger(AdminController.class);

    @Autowired
    private AdminService adminService;

    @PostMapping("blockUser")
    public boolean blockUser(@RequestBody Member customer){
        return this.adminService.blockUser(customer);
    }

    @PostMapping("unblockUser")
    public boolean unblockUser(@RequestBody Member customer){
        return this.adminService.unblockUser(customer);
    }

    @PostMapping("enablePage")
    public boolean enablePage(@RequestBody Page page){
        return this.adminService.enablePage(page);
    }

    @PostMapping("disablePage")
    public boolean disablePage(@RequestBody Page page){
        return this.adminService.disablePage(page);
    }


}
