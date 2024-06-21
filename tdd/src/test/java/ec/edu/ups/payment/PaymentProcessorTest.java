package ec.edu.ups.payment;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class PaymentProcessorTest {

    private IPaymentGateway gateway = null;
    PaymentProcessor paymentProcessor = null;

    @Before
    public void setUp(){
        gateway = Mockito.mock(IPaymentGateway.class);
        paymentProcessor = new PaymentProcessor(gateway);
    }

    @Test
    public void givePaymentWhenIsCorrectThenOk() {
        when(gateway.requestPayment(any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));
        assertTrue(paymentProcessor.makePayment(100));
    }

    @Test
    public void givePaymentWhenIsCorrectThenError() {
        when(gateway.requestPayment(any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));
        assertFalse(paymentProcessor.makePayment(100));
    }
}