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
}
