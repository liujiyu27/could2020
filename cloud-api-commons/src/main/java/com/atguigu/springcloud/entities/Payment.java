package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author liujiyu
 * @since 2022-06-14 10:23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

        private Long id;
        private String serial;
}

