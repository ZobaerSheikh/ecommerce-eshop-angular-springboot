package com.eshopzobaer.ecommerce.service;

import com.eshopzobaer.ecommerce.dto.PaymentInfo;
import com.eshopzobaer.ecommerce.dto.Purchase;
import com.eshopzobaer.ecommerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
