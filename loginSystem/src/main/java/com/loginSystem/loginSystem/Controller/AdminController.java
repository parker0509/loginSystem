//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.loginSystem.loginSystem.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class AdminController {
    public AdminController() {
    }

    @GetMapping({"/admin"})
    public String adminP() {
        return "Admin Controller";
    }
}
