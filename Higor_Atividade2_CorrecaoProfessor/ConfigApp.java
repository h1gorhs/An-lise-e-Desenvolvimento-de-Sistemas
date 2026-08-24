// Singleton da configuração do ambiente

public class ConfigApp {
    
    private String name="Frete++";

    private static ConfigApp configuracaoApp;

    private ConfigApp(){
        System.out.println("Criando instância única da configuração.");
    }

    public static ConfigApp getConfiguracao(){

        if(configuracaoApp==null){
            configuracaoApp = new ConfigApp();
        }
        return configuracaoApp;

    }

    public String getName(){
        return this.name;
    }

}
