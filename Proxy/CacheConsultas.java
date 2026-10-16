// Objeto proxy
import java.util.HashMap;
import java.util.Map;
public class CacheConsultas implements IDatabase{

    private BaseDeDadosReal basedeDados;
    private Map<String, String> cache;

    public CacheConsultas(){
        this.basedeDados = new BaseDeDadosReal();
        this.cache = new HashMap<>();
    }

    @Override
    public String getData(String query) {
        if(cache.containsKey(query)){
            System.out.println("Retornando a consulta já realizada anteriormente...");
            return cache.get(query);
        }else{
            System.out.println("Consulta não está no cache.");
            String resultadoConsulta = basedeDados.getData(query);
            cache.put(query, resultadoConsulta);
            return resultadoConsulta;
        }
    }
    
}
