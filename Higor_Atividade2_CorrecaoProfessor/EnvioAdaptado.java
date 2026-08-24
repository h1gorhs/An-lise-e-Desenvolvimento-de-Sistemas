// Adapter
public class EnvioAdaptado implements IEnvioPedido{

    private EnvioTransportadora envioLegado;
    
    public EnvioAdaptado(){
        this.envioLegado = new EnvioTransportadora();
    }

    public void enviarPedido(int quantidade, double valorFinal){

        if(quantidade >= 5 | valorFinal >= 500){
            System.out.println("Seguro obrigatório");
        }
        this.envioLegado.envioDePedido(quantidade);

    }

}
