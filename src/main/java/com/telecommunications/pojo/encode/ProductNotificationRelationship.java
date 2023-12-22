package com.telecommunications.pojo.encode;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductNotificationRelationship {

    private int serialNumber;

    private int productCode;

    private String productName;

    private int notificationIncomeCode;

    private String notificationTypeName;
}