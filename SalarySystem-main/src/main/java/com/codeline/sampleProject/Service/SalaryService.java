package com.codeline.sampleProject.Service;

import com.codeline.sampleProject.GetEmployeeResponse.GetAccountResponse;
import com.codeline.sampleProject.GetEmployeeResponse.GetSalaryResponse;
import com.codeline.sampleProject.Models.Account;
import com.codeline.sampleProject.Models.Salary;
import com.codeline.sampleProject.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public GetSalaryResponse getSalaryById(Long salaryId) {
        Optional<Salary> optionalSalary =  SalaryRepository.findById(salaryId);
        if(!optionalSalary.isEmpty())
        {
            Salary salary =  optionalSalary.get();
            GetSalaryResponse salaryResponse = new GetSalaryResponse(salary.getAmount(), salary.getCurrency());
            return salaryResponse;
        }

        return null;

    }
}
