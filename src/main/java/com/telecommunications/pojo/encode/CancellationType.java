package com.telecommunications.pojo.encode;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CancellationType {

    private String cancellationCode;

    private String cancellationName;
}
