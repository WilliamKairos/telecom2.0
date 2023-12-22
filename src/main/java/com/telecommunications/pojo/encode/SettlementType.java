package com.telecommunications.pojo.encode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SettlementType {

    private int settlementCode;

    private String settlementName;
}
