package com.telecommunications.pojo.income;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrepaidConversionIncome {

    private int id;

    private Date billingDate;

    private int cityCode;

    private int productCode;

    private String cancellationTypeCode;

    private double billingAmount;

    private String auditStatus;
}

