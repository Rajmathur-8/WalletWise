package com.spring.WalletWise.dto;

import com.spring.WalletWise.entity.Expense;
import com.spring.WalletWise.entity.Income;
import lombok.Data;

import java.util.List;

@Data
public class GraphDTO {
    private List<Expense> expenseList;
    private List<Income> incomeList;
}
