package Builder_revisao;

public class Pedido {

    private int numero;
    private String cliente;
    private String enderecoEntrega;
    private String formaPagamento;
    private int cupomDesconto;
    private String observacao;

    private Pedido(){

    }

    @Override 
    public String toString(){
        return "Pedido: {\n" +
        "   Número: {" + numero + "}\n" +
        "   Cliente: {" + cliente + "}\n" +
        "   Endereço de Entrega: {" + enderecoEntrega + "}\n" +
        "   Forma de Pagamento: {" + formaPagamento + "}\n" +
        "   Cupom de Desconto: {" + cupomDesconto + "}\n" +
        "   Observação: {" + observacao + "}\n}"; 
    }

    public abstract class Builder {
    
        private int numero;
        private String cliente;
        private String enderecoEntrega;
        private String formaPagamento;
        private int cupomDesconto;
        private String observacao;
    }

    public  setNumero(int numero){
        this.numero = numero;
        return this;
    }

    public void setCliente(String cliente){
        this.cliente = cliente;
        return this;
    }

    public void setEndereco
}
