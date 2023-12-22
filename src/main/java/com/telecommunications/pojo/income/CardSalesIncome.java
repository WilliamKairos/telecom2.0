package com.telecommunications.pojo.income;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CardSalesIncome {

    private int id;

    private Date entryDate;

    private int cityCode;

    private int productCode;

    private int cardSalesQuantity;

    private double faceValueAmount;

    private double cardTotalAmount;

    private double discountedTotalAmount;

    private String auditStatus;
}
