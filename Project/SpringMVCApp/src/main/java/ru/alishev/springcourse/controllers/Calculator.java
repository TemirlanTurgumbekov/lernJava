package ru.alishev.springcourse.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class Calculator {
    @GetMapping("/calculator")
    public String calculator(HttpServletRequest request, Model model) {
        int num1 = Integer.parseInt(request.getParameter("n1"));
        int num2 = Integer.parseInt(request.getParameter("n2"));
        String action = request.getParameter("action");
        System.out.println(action + "!!!!!!!!!!!!!");
        if (action.equals("mul")) {
            model.addAttribute("answer","result = " + (num1 + num2));
        } else if (action.equals("sub")) {
            model.addAttribute("answer","result = " + (num1 - num2));
        } else if (action.equals("add")) {
            model.addAttribute("answer","result = " + (num1 * num2));
        } else if (action.equals("div")) {
            model.addAttribute("answer","result = " + (num1 / num2));
        } else {
            model.addAttribute("answer","Command action don't found!");
        }

        return "calculator/calc.html";
    }
}
