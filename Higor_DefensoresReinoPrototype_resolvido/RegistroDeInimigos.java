import java.util.HashMap;
import java.util.Map;
public class RegistroDeInimigos {
    private final Map<String, Inimigo> prototipos = new HashMap<>();
    public void registrar(String tipo, Inimigo prototipo) {
        if (tipo == null || prototipo == null) throw new IllegalArgumentException("Tipo e protótipo não podem ser nulos.");
        prototipos.put(tipo, prototipo);
    }
    public Inimigo criar(String tipo) {
        Inimigo prototipo = prototipos.get(tipo);
        if (prototipo == null) throw new IllegalArgumentException("Tipo de inimigo desconhecido: " + tipo);
        return prototipo.clonar();
    }
}
