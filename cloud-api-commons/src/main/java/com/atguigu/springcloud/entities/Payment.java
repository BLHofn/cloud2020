package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author Xia ShengSheng
 * @Date 2020/4/19 23:52
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
//主实体类
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
