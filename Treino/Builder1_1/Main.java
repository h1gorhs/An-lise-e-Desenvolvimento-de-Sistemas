package Builder1_1;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro.Builder()
            .setMarca("Toyota")
            .setModelo("Supra MK5")
            .setAno(2026)
            .setCor("Azul")
            .build();

        Carro carro2 = new Carro.Builder()
            .setMarca("Nissan")
            .setModelo("GT-R R35")
            .setAno(2025)
            .setCor("Roxo")
            .build();

        System.out.println(carro1);
        System.out.println(carro2);
    }
}
