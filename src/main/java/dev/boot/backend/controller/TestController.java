package dev.boot.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestController {
    @GetMapping("/myview")
    public String myview(HttpServletRequest request, Model model){
        String id = request.getParameter("id");
        model.addAttribute("id", id);
        return "myview";
    }
}
