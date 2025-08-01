package com.ecom.OrderService.dao;

import com.ecom.OrderService.repository.*;
import com.ecom.OrderService.utils.RabbitMQProducer;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class MasterDao {

    @Autowired
    private OrderRepository orderRepo;

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private CartRepository cartRepo;

    @Autowired
    private ProductRepository productRepo;

    @Autowired
    private AddressRepository addressRepo;

//    @Autowired
//    private RabbitMQProducer rabbitMQProducer;

}
