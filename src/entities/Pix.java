package entities;

import services.PaymentService;

public class Pix extends PaymentService {

    @Override
    protected void pay() {
        System.out.println("O pagamento foi feito por PIX!");
    }
}
