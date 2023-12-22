package com.telecommunications.pojo.encode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BillingType {

    private int billingCode;

    private String billingTypeName;
}
