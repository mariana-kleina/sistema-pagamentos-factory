public class PagamentoPayPal implements Pagamento {

    private String emailUsuario = "cliente@exemplo.com";

    private boolean validarContaPayPal() {
        System.out.println("Validando conta PayPal...");
        return this.emailUsuario != null && this.emailUsuario.contains("@");
    }

    @Override
    public String processarPagamento(double valor) {
        if (validarContaPayPal()) {
            return "Pagamento de R$" + String.format("%.2f", valor) + " realizado com PayPal.";
        } else {
            return "Erro: A conta PayPal não está vinculada a um e-mail válido.";
        }
    }
}