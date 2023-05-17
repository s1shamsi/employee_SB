package com.codeline.sampleProject.Service;

import com.codeline.sampleProject.GetEmployeeResponse.GetAccountResponse;
import com.codeline.sampleProject.GetEmployeeResponse.GetEmployeeResponse;
import com.codeline.sampleProject.Models.Account;
import com.codeline.sampleProject.Models.Employee;
import com.codeline.sampleProject.Repository.AccountRepository;
import com.codeline.sampleProject.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {

    @Autowired
AccountRepository AccountRepository;

    public void saveAccount(Account account) {
        AccountRepository.save(account);
    }

    public List<Account> getAccount() {
        return AccountRepository.findAll();
    }

    public GetAccountResponse getAccountById(Long accountId) {
        Optional<Account> optionalAccount =  AccountRepository.findById(accountId);
        if(!optionalAccount.isEmpty())
        {
            Account account =  optionalAccount.get();
            GetAccountResponse accountResponse = new GetAccountResponse(account.getBankName(), account.getAccountNumber(), account.getBankBranch(), account.getAccountHolderName(),account.getSwiftCode());
            return accountResponse;
        }

        return null;

    }
}
