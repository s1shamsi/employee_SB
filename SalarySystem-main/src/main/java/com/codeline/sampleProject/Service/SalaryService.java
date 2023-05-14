package com.codeline.sampleProject.Service;

import com.codeline.sampleProject.Models.Account;
import com.codeline.sampleProject.Models.Salary;
import com.codeline.sampleProject.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryService {

    @Autowired
    com.codeline.sampleProject.Repository.SalaryRepository SalaryRepository;

    public void saveSalary(Salary salary) {
        SalaryRepository.save(salary);
    }
    public List<Salary> getSalary() {
        return SalaryRepository.findAll();
    }
}
