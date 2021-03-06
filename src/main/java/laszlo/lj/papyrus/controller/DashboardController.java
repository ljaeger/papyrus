package laszlo.lj.papyrus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping(value={"/", "/index"})
    public String getHomePage(Model model) {
        return "index";
    }

    @GetMapping(value="/scroll")
    public String getSrollPage(Model model) {
        return "scroll";
    }

    @GetMapping(value="/login")
    public String getLoginPage(Model model){
        return "login";
    }
}
