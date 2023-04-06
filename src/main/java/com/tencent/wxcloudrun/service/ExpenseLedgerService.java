package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.model.Counter;
import com.tencent.wxcloudrun.model.ExpenseLedger;

import java.util.List;
import java.util.Optional;

public interface ExpenseLedgerService {

  List<ExpenseLedger> queryExpenseLedgerList();

}
