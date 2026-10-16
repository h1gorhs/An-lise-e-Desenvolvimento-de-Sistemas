public class Main {
    
    public static void main(String[] args) {
        
        IDatabase banco = new CacheConsultas();

        String resultadoConsulta = banco.getData("SELECT * FROM users WHERE id = 1");
        System.out.println(resultadoConsulta);

        resultadoConsulta = banco.getData("SELECT * FROM users WHERE id = 1");
        System.out.println(resultadoConsulta);
        resultadoConsulta = banco.getData("SELECT * FROM users WHERE id = 1");
        System.out.println(resultadoConsulta);
        resultadoConsulta = banco.getData("SELECT * FROM users WHERE id = 1");
        System.out.println(resultadoConsulta);
        resultadoConsulta = banco.getData("SELECT * FROM users WHERE id = 1");
        System.out.println(resultadoConsulta);
        resultadoConsulta = banco.getData("SELECT * FROM users WHERE id = 1");
        System.out.println(resultadoConsulta);
        resultadoConsulta = banco.getData("SELECT * FROM users WHERE id = 1");
        System.out.println(resultadoConsulta);
        resultadoConsulta = banco.getData("SELECT * FROM users WHERE id = 1");
        System.out.println(resultadoConsulta);
        resultadoConsulta = banco.getData("SELECT * FROM users WHERE id = 1");
        System.out.println(resultadoConsulta);
        resultadoConsulta = banco.getData("SELECT * FROM users WHERE id = 1");
        System.out.println(resultadoConsulta);
        resultadoConsulta = banco.getData("SELECT * FROM users WHERE id = 1");
        System.out.println(resultadoConsulta);
        resultadoConsulta = banco.getData("SELECT * FROM users WHERE id = 1");
        System.out.println(resultadoConsulta);

    }

}
