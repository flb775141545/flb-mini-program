package com.tencent.wxcloudrun.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class ExpenseLedger implements Serializable {

  private Long id;

  private LocalDateTime createdDate;

  private LocalDateTime updatedDate;

  private Integer type;

  private Integer subType;
  private String expenseName;

  private BigDecimal amount;

  private LocalDateTime expenseDate;

}
