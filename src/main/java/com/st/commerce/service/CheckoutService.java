package com.st.commerce.service;

import com.st.commerce.dto.Purchase;
import com.st.commerce.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
