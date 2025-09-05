public class PagamentoApplePay implements Pagamento {

    private boolean validarDispositivo() {
        System.out.println("Validando dispositivo Apple...");
        return true;
    }

    @Override
    public String processarPagamento(double valor) {
        if (validarDispositivo()) {
            return "Pagamento de R$" + String.format("%.2f", valor) + " realizado com Apple Pay.";
        } else {
            return "Erro: Dispositivo não compatível com Apple Pay.";
        }
    }
}