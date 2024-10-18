package entities;

import services.PaymentService;

public class Money extends PaymentService {

    public Money(double valor) {
        super(valor);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento em dinheiro no valor de R$ " + valor);
    }
}
