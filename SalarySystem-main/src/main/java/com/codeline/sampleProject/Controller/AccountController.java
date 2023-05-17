package com.codeline.sampleProject.Controller;

import com.codeline.sampleProject.GetEmployeeResponse.GetAccountResponse;
import com.codeline.sampleProject.GetEmployeeResponse.GetEmployeeResponse;
import com.codeline.sampleProject.Models.Account;

import com.codeline.sampleProject.Models.Employee;
import com.codeline.sampleProject.RequestObjects.GetAccountRequestObject;
import com.codeline.sampleProject.RequestObjects.GetEmployeeRequestObject;
import com.codeline.sampleProject.Service.AccountService;
import com.codeline.sampleProject.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class AccountController {
    @Autowired
    AccountService accountService;

    @RequestMapping("account/create")
    public void saveAccount (@RequestBody GetAccountRequestObject accountRequestObject) {
        createAccount(accountRequestObject);
    }
    @RequestMapping("account/get")
    public List<Account> getAccount () {
        return accountService.getAccount();
    }
    @RequestMapping("account/get/{accountId}")
    public GetAccountResponse createAccount (@PathVariable Long accountId) {
        return accountService.getAccountById(accountId);
    }
    public void createAccount(GetAccountRequestObject accountRequestObject) {

        Account account = new Account();
        account.setBankName(accountRequestObject.getBankName());
        account.setAccountNumber(accountRequestObject.getAccountNumber());
        account.setBankBranch(accountRequestObject.getBankBranch());
        account.setSwiftCode(accountRequestObject.getSwiftCode());
        account.setAccountHolderName(accountRequestObject.getAccountHolderName());
        account.setAccountType("debit");
        account.setBranchCode(1132);
        account.setCreatedDate(new Date());
        account.setIsActive(true);
        accountService.saveAccount(account);

    }
}