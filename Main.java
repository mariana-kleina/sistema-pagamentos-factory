public class Main {
    public static void main(String[] args) {
        PagamentoService service = new PagamentoService();

        System.out.println("Iniciando pagamento com Cartão de Crédito...");
        service.processarPagamento(new FactoryCartaoCredito(), 150.00);

        System.out.println("Iniciando pagamento com PayPal...");
        service.processarPagamento(new FactoryPayPal(), 75.50);

        System.out.println("Iniciando pagamento com Criptomoeda (saldo suficiente)...");
        service.processarPagamento(new FactoryCriptomoeda(), 300.00);
        
        System.out.println("Iniciando pagamento com Criptomoeda (saldo insuficiente)...");
        service.processarPagamento(new FactoryCriptomoeda(), 600.00);

        System.out.println("Iniciando pagamento com Apple Pay...");
        service.processarPagamento(new FactoryApplePay(), 99.90);
    }
}