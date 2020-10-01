package org.launchcode.employeedirectory.controllers;


import org.launchcode.employeedirectory.data.EmployeeData;
import org.launchcode.employeedirectory.models.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("employees")
public class EmployeeController {

    @GetMapping
    public String displayAllEmployees(Model model) {
        model.addAttribute("title", "All Employees");
        model.addAttribute("employees", EmployeeData.getAll());
        return "employees/index";
    }

    @GetMapping("add")
    public String displayAddEmployeeForm(Model model) {
        model.addAttribute("title","Add Employee");
        model.addAttribute(new Employee());
        return "employees/add";
    }

    @PostMapping("add")
    public String processAddEmployeeForm(@ModelAttribute @Valid Employee newEmployee, Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("title","Add Employee");
            model.addAttribute("errorMsg","Missing or bad data. Please resubmit!");
            return "employees/add";
        }

        EmployeeData.add(newEmployee);
        return "redirect:";
    }

    @GetMapping("delete")
    public String displayDeleteEmployeeForm(Model model) {
        model.addAttribute("title","Delete Employee");
        model.addAttribute("employees", EmployeeData.getAll());
        return "employees/delete";
    }

    @PostMapping("delete")
    public String processDeleteEmployeeForm(@RequestParam (required = false) int[] employeeIds) {

        if (employeeIds != null) {
            for (int id : employeeIds) {
                EmployeeData.remove(id);
            }
        }
        return "redirect:";
    }

}
