package com.codeline.sampleProject.Controller;

import com.codeline.sampleProject.Models.Account;
import com.codeline.sampleProject.Models.Salary;
import com.codeline.sampleProject.Service.AccountService;
import com.codeline.sampleProject.Service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class SalaryController {
    @Autowired
    SalaryService salaryService;

    @RequestMapping("salary/create")
    public void saveSalary() {
        createSalary();
    }
    @RequestMapping("salary/get")
    public List<Salary> getSalary () {
        return salaryService.getSalary();
    }

    public void createSalary() {

        Salary salary = new Salary();
        salary.setAmount(1500.6);
        salary.setCurrency("OMR");
        salary.setOverTimeAmount(1800.00);
        salary.setDeductions(5.0);
        salary.setHealthCareContribution(150.0);
        salary.setAllowances(200.0);
        salary.setBonus(250.0);
        salary.setPerDiem(23.6);
        salary.setCreatedDate(new Date());
        salary.setIsActive(true);
        salaryService.saveSalary(salary);

    }
}
