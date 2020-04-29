package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Xia ShengSheng
 * @Date 2020/4/19 23:57
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
//前后端分离：传给前端参数，是否成功参数和消息
public class CommonResult<T> {
    private Integer code;//200
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}

