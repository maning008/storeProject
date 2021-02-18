package pl.walczakt.voucherstore.sales.payment;

import pl.walczakt.payment.payu.exceptions.PayUException;
import pl.walczakt.voucherstore.sales.ordering.Reservation;

public interface PaymentGateway {
    PaymentDetails registerFor(Reservation reservation) throws PayUException;

    boolean isTrusted(PaymentUpdateStatusRequest updateStatusRequest);
}
