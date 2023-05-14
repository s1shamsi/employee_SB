package com.codeline.sampleProject.Repository;

import com.codeline.sampleProject.Models.Account;
import com.codeline.sampleProject.Models.Salary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryRepository extends JpaRepository<Salary, Long> {

}
