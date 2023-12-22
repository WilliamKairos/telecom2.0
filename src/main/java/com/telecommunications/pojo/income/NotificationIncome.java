package com.telecommunications.pojo.income;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationIncome {

    private int id;

    private Date businessReceiptDate;

    private int cityCode;

    private int productCode;

    private int notificationIncomeCode;

    private double businessIncomeAmount;

    private String auditStatus;
}
