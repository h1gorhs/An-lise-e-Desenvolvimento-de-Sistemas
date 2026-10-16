public class BaseDeDadosReal implements IDatabase{

    // Operação custosa
    @Override
    public String getData(String query) {
        try{
            System.out.println("Realizando consulta demorada...");
            Thread.sleep(7000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return "Resultado da consulta " + query;
    }
    
}
