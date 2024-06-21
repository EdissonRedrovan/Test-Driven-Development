package ec.edu.ups.payment;

public class PaymentResponse {

    enum PaymentStatus {
        OK,ERROR
    }

    private PaymentStatus status;

    public PaymentStatus getStatus() {
        return status;
    }

    public PaymentResponse(PaymentStatus status) {
        this.status = status;
    }




}
