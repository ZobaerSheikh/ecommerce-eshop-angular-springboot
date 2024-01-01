package com.eshopzobaer.ecommerce.controller;

import com.eshopzobaer.ecommerce.dto.PaymentInfo;
import com.eshopzobaer.ecommerce.dto.Purchase;
import com.eshopzobaer.ecommerce.dto.PurchaseResponse;
import com.eshopzobaer.ecommerce.service.CheckoutService;
import com.stripe.exception.StripeException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {

        return checkoutService.placeOrder(purchase);
    }

    @PostMapping("/payment-intent")
    public ResponseEntity<String> createPaymentIntent(@RequestBody PaymentInfo paymentInfo) throws StripeException {

        var paymentIntent = checkoutService.createPaymentIntent(paymentInfo);
        var paymentStr = paymentIntent.toJson();

        return new ResponseEntity<>(paymentStr, HttpStatus.OK);
    }
}

