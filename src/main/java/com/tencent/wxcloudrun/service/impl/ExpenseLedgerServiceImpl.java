package com.tencent.wxcloudrun.service.impl;

import com.tencent.wxcloudrun.dao.ExpenseLedgerMapper;
import com.tencent.wxcloudrun.model.ExpenseLedger;
import com.tencent.wxcloudrun.service.ExpenseLedgerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseLedgerServiceImpl implements ExpenseLedgerService {

    @Autowired
    private ExpenseLedgerMapper expenseLedgerMapper;

    @Override
    public List<ExpenseLedger> queryExpenseLedgerList() {
        return expenseLedgerMapper.queryExpenseLedgerList();
    }

}
