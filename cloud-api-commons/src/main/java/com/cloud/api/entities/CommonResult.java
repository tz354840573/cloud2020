package com.cloud.api.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor //全参数构造
@NoArgsConstructor  //空参数构造
public class CommonResult {
    private Integer code;
    private String message;
    private Object data;

    public CommonResult(Integer code, String message) {
        this.code = code;
        this.message = message;
        this.data = null;
    }

}
