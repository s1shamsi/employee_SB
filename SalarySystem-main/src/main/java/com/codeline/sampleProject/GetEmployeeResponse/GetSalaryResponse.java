package com.codeline.sampleProject.GetEmployeeResponse;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetSalaryResponse {
    Double amount;

    String currency;
    Double allowances;

}
