package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.ExpenseLedger;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ExpenseLedgerMapper {

  List<ExpenseLedger> queryExpenseLedgerList();

}
