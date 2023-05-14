package com.codeline.sampleProject.Controller;

import com.codeline.sampleProject.Models.Account;

import com.codeline.sampleProject.Models.Employee;
import com.codeline.sampleProject.Service.AccountService;
import com.codeline.sampleProject.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class AccountController {
    @Autowired
    AccountService accountService;

    @RequestMapping("account/create")
    public void saveAccount() {
        createAccount();
    }
    @RequestMapping("account/get")
    public List<Account> getAccount () {
        return accountService.getAccount();
    }

    public void createAccount() {

        Account account = new Account();
        account.setBankName("bankMuscat");
        account.setAccountNumber("0303041523650015");
        account.setBankBranch("ALKHOD");
        account.setSwiftCode("BMOM110");
        account.setAccountHolderName("mohammed");
        account.setAccountType("debit");
        account.setBranchCode(1132);
        account.setCreatedDate(new Date());
        account.setIsActive(true);
        accountService.saveAccount(account);

    }
}