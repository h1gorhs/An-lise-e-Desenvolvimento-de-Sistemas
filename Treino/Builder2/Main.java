package Builder2;

public class Main {
    public static void main(String[] args) {
        Usuario user1 = new Usuario.Builder()
            .setNome("Higor")
            .setEmail("higor@gmail.com")
            .build();   

        Usuario user2 = new Usuario.Builder()
            .setNome("Stéfani")
            .setEmail("stefani@gmail.com")
            .setCidade("Patos de Minas")
            .build();
        
        Usuario user3 = new Usuario.Builder()
            .setNome("Hiago")
            .setEmail("hiago@gmail.com")
            .setIdade(15)
            .setTelefone(0)
            .setCidade("Patos de Minas")
            .build();
        
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
    }
}
