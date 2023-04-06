package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.model.ExpenseLedger;
import com.tencent.wxcloudrun.service.ExpenseLedgerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
public class ExpenseLedgerController {

    @Resource
    private ExpenseLedgerService expenseLedgerService;

    @GetMapping(value = "/api/expense/expense-ledger-list")
    public ApiResponse queryExpenseLedgerList() {
        log.info("/api/expense/expense-ledger-list get request");

        List<ExpenseLedger> expenseLedgerList = expenseLedgerService.queryExpenseLedgerList();
        return ApiResponse.ok(expenseLedgerList);
    }

}
