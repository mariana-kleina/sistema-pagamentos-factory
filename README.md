# Sistema de Pagamentos com Factory Method

## Descrição do Projeto
Este é um projeto acadêmico desenvolvido para praticar e demonstrar o padrão de projeto criacional **Factory Method**. O sistema simula o processamento de pagamentos para uma plataforma de e-commerce, permitindo que novos métodos de pagamento sejam adicionados de forma flexível e desacoplada.

Foram aplicados conceitos como:
* **Factory Method**: Utilizado para delegar a responsabilidade de criação dos objetos de pagamento para subclasses (factories), permitindo que o sistema seja facilmente extensível sem modificar o código cliente.
* **Interfaces**: A interface `Pagamento` foi usada para definir um contrato comum, garantindo que todos os métodos de pagamento tenham a mesma forma de processar uma transação.
* **Polimorfismo**: Demonstrado na classe `PagamentoService`, que opera com objetos do tipo `Pagamento` de forma genérica, sem conhecer a implementação específica de cada um (Cartão de Crédito, PayPal, etc.).

## Tecnologias Utilizadas
* Java

## Como Executar o Projeto

1.  Certifique-se de que você tem o JDK (Java Development Kit) instalado.
2.  Clone ou baixe este repositório para o seu computador.
3.  Abra o terminal na pasta raiz do projeto.
4.  Compile todos os arquivos `.java` com o seguinte comando:
    ```bash
    javac *.java
    ```
5.  Execute a classe principal para iniciar o programa:
    ```bash
    java Main
    ```
