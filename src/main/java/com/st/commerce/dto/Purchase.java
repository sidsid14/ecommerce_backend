package com.st.commerce.dto;

import com.st.commerce.entity.Address;
import com.st.commerce.entity.Customer;
import com.st.commerce.entity.Order;
import com.st.commerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {
    private Customer customer;
    private Address address;
    private Order order;
    private Set<OrderItem> orderItems;
}
