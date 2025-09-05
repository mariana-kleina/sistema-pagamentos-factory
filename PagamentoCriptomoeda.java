public class PagamentoCriptomoeda implements Pagamento {
    
    private double saldoCarteira = 500.00;

    private boolean verificarSaldo(double valor) {
        System.out.println("Verificando saldo da carteira de criptomoedas...");
        return this.saldoCarteira >= valor;
    }

    @Override
    public String processarPagamento(double valor) {
        if (verificarSaldo(valor)) {
            return "Pagamento de R$" + String.format("%.2f", valor) + " realizado com Criptomoedas.";
        } else {
            return "Erro: Saldo insuficiente na carteira de criptomoedas.";
        }
    }
}