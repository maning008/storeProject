package pl.walczakt.voucherstore.sales.payment;

import pl.walczakt.payment.payu.exceptions.PayUException;

public class PaymentException extends IllegalStateException {
    public PaymentException(PayUException e) {
        super(e);
    }
}
