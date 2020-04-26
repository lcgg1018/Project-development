package com.code.controller;

import com.code.entity.CashStatement;
import com.code.service.Finance_CashStatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("finance")
public class Finance_CashStatementController {
    @Autowired
    Finance_CashStatementService financeCashStatementService;
    public String getAllCashStatement(Model model, String date1, String date2, String dealings, @RequestParam(defaultValue = "1") int pageNum,@RequestParam(defaultValue = "4") int pageSize){
        int income=0;
        int disburse=0;
        int accountBalance=0;
        List<CashStatement> cash_StatementS = financeCashStatementService.getCash_Statement(date1, date2, dealings);
        model.addAttribute("cash_StatementS", cash_StatementS);
        for (CashStatement cash_statement : cash_StatementS) {
            income+=cash_statement.getIncome();
            disburse+=cash_statement.getDisburse();
            accountBalance+=cash_statement.getAccountBalance();
        }
        model.addAttribute("income", income);
        model.addAttribute("disburse", disburse);
        model.addAttribute("accountBalance", accountBalance);
        return "";
    }
}
