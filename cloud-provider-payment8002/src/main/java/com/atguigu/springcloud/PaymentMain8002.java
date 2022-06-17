package com.atguigu.springcloud;

import org.hibernate.validator.internal.metadata.aggregated.rule.ReturnValueMayOnlyBeMarkedOnceAsCascadedPerHierarchyLine;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author liujiyu
 * @since 2022-06-10 15:15
 */

@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class,args);
    }
}
