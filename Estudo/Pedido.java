public class Pedido {

    private int numero;
    private String cliente;
    private String enderecoEntrega;
    private String formaPagamento;
    private int cupomDesconto;
    private String observacao;

    private Pedido(Builder builder) {
        this.numero = builder.numero;
        this.cliente = builder.cliente;
        this.enderecoEntrega = builder.enderecoEntrega;
        this.formaPagamento = builder.formaPagamento;
        this.cupomDesconto = builder.cupomDesconto;
        this.observacao = builder.observacao;
    }

    @Override
    public String toString() {
        return "Pedido {\n" +
                "   Numero: " + numero + "\n" +
                "   Cliente: " + cliente + "\n" +
                "   EnderecoEntrega: " + enderecoEntrega + "\n" +
                "   Forma de Pagamento: " + formaPagamento + "\n" +
                "   Cupom de Desconto: " + cupomDesconto + "\n" +
                "   Observação: " + observacao + "\n}\n";
    }

    public static class Builder{
        private int numero;
        private String cliente;
        private String enderecoEntrega;
        private String formaPagamento;
        private int cupomDesconto;
        private String observacao;

        public Builder setNumero(int numero) {
            this.numero = numero;
            return this;
        }

        public Builder setCliente(String cliente) {
            this.cliente = cliente;
            return this;
        }

        public Builder setEnderecoEntrega(String enderecoEntrega) {
            this.enderecoEntrega = enderecoEntrega;
            return this;
        }

        public Builder setFormaPagamento(String formaPagamento) {
            this.formaPagamento = formaPagamento;
            return this;
        }

        public Builder setCupomDesconto(int cupomDesconto) {
            this.cupomDesconto = cupomDesconto;
            return this;
        }

        public Builder setObservacao(String observacao) {
            this.observacao = observacao;
            return this;
        }

        public Pedido build() {
            if (numero <= 0) {
                throw new IllegalArgumentException("O número do Pedido deve ser maior que zero!");
            }

            if (cliente == null) {
                throw new IllegalArgumentException("O nome do cliente não pode estar vazio!");
            }

            if (formaPagamento == null) {
                setFormaPagamento("Dinheiro");
            }
            return new Pedido(this);

        }
    }
}