package com.eshopzobaer.ecommerce.dto;

import com.eshopzobaer.ecommerce.entity.Address;
import com.eshopzobaer.ecommerce.entity.Order;
import com.eshopzobaer.ecommerce.entity.OrderItem;
import com.eshopzobaer.ecommerce.entity.Customer;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;

    private Address shippingAddress;

    private Address billingAddress;

    private Order order;

    private Set<OrderItem> orderItems;
}
