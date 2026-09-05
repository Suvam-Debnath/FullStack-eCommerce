package com.suvam.ecom.service;

import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import com.suvam.ecom.payload.StripePaymentDto;

public interface StripeService {
    PaymentIntent paymentIntent(StripePaymentDto stripePaymentDto) throws StripeException;
}
