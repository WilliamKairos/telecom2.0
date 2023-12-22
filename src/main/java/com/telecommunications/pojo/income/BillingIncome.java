package com.telecommunications.pojo.income;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BillingIncome {

    private int id;

    private Date entryMonth;

    private int cityCode;

    private int productCode;

    private int billingTypeCode;

    private double entryAmount;

    private String auditStatus;
}
