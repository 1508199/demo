package demo.controller;

import demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Vorname Nachname (vorname.nachname@dataphone.at)
 * @since 17.12.2023
 */
@Controller
public class DemoController {

    @Autowired
    DemoService demoService;

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to Spring boot world";
    }

    @GetMapping
    public String getPeople(Model model) {
        model.addAttribute("message", "Hello from Thymeleaf!");
        model.addAttribute("people", demoService.createPersonList());
        return "people";
    }
}
