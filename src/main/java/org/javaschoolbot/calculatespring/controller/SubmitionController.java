
package org.javaschoolbot.calculatespring.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
@Scope("session")
public class SubmitionController {

    @GetMapping("/sub")
    public String div(@RequestParam("num1") double num1, @RequestParam("num2") double num2, Model model) {
        double result = num1 - num2;
        model.addAttribute("result", result);
        return "calculator";
    }
}
