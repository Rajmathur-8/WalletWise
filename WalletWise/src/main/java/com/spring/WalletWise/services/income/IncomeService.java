package com.spring.WalletWise.services.income;

import com.spring.WalletWise.dto.IncomeDTO;
import com.spring.WalletWise.entity.Income;

import java.util.List;

public interface IncomeService {
    Income postIncome(IncomeDTO incomeDTO);
    List<IncomeDTO> getAllIncome();
    Income updateIncome(Long id,IncomeDTO incomeDTO);
    IncomeDTO getIncomeById(Long id);
    void deleteIncome(Long id);
}
