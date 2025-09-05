public class PagamentoCartaoCredito implements Pagamento {
    
    private String numeroCartao = "1234567890123456"; 

    private boolean validarCartao() {
        System.out.println("Validando cartão de crédito...");
        return this.numeroCartao != null && this.numeroCartao.length() == 16;
    }

    @Override
    public String processarPagamento(double valor) {
        if (validarCartao()) {
            return "Pagamento de R$" + String.format("%.2f", valor) + " realizado com Cartão de Crédito.";
        } else {
            return "Erro: Número de cartão de crédito inválido.";
        }
    }
}