package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author liujiyu
 * @since 2022-06-14 11:04
 */
@Service
public class PaymentServiceImpl implements PaymentService{


    @Resource
    private PaymentDao paymentDao;


    public int create(Payment payment) {
        return paymentDao.create(payment);
    }


    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
