package services;

public abstract class PaymentService {
    protected double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public abstract void processarPagamento();

    public void exibirValor() {
        System.out.println("Valor a ser pago: R$ " + valor);
    }
}
