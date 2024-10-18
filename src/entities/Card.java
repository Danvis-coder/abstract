package entities;

import services.PaymentService;

public class Card extends PaymentService {
    private String numeroCartao;
    private String validade;

    public Card(double valor, String numeroCartao, String validade) {
        super(valor);
        this.numeroCartao = numeroCartao;
        this.validade = validade;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento com cartão de crédito no valor de R$ " + valor);
        System.out.println("Número do cartão: " + numeroCartao);
        System.out.println("Validade: " + validade);
    }
}
