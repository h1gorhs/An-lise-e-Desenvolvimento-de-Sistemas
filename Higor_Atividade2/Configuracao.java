//Singleton
public final class Configuracao {
    private static Configuracao instancia;

    private String nomeAplicacao;
    private String ambiente;
    private String urlTransportadora;

    private Configuracao() {
        nomeAplicacao = "Sistema de Processamento de Pedidos";
        ambiente = "desenvolvimento";
        urlTransportadora = "https://api.transportadora.exemplo";
    }

    public static Configuracao getInstancia() {
        if (instancia == null) {
            instancia = new Configuracao();
        }
        return instancia;
    }

    public String getNomeAplicacao() { return nomeAplicacao; }
    public String getAmbiente() { return ambiente; }
    public String getUrlTransportadora() { return urlTransportadora; }

    public void setAmbiente(String ambiente) { this.ambiente = ambiente; }
    public void setUrlTransportadora(String urlTransportadora) { this.urlTransportadora = urlTransportadora; }
}
