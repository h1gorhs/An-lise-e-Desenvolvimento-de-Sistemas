package Builder;

public class Main {
    public static void main(String[] args) { 
        // Criando uma máquina virtual com o Builder 
         VirtualMachine vm = new VirtualMachine.Builder() 
         // Chamamos diretamente já que é estático 
                .setOperatingSystem("Linux") 
                .setRam(16) 
                .setStorage(512) 
                .setGpu("NVIDIA RTX 3090") 
                .setCpu("Intel i9") 
                .setSSD(true) 
                .build(); 
   
         // Exibindo as configurações da máquina virtual 
         System.out.println(vm); 
    }
}