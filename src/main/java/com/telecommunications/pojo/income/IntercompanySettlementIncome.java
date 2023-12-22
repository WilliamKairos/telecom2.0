package com.telecommunications.pojo.income;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IntercompanySettlementIncome {

    private int id;

    private Date settlementMonth;

    private int cityCode;

    private int productCode;

    private int settlementOperatorCode;

    private int settlementTypeCode;

    private double settlementAmount;

    private String auditStatus;
}
