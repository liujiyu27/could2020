package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;

/**
 * @author liujiyu
 * @since 2022-06-15 21:00
 */
public class MySelfRule {
    @Bean
    public IRule myRule()
    {
        return new RandomRule();//定义为随机
    }

}
