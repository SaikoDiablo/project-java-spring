package pl.edu.BMW.project_java_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

 @GetMapping("/")
    public String home() {
        return "home";}

        @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name",required=false, defaultValue = "Driver") String name, Model model){
        model.addAttribute("name", name);
        return "greeting";
    }
    //http://localhost:8080/greeting?name=BMW
}
