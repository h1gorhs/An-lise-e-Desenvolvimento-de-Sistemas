/** Atributos de combate de um inimigo. É MUTÁVEL: a vida muda durante a partida. */
public class Atributos {

    private int vidaMaxima;
    private int vida;
    private int ataque;
    private int defesa;
    private int velocidade;

    public Atributos(int vidaMaxima, int ataque, int defesa, int velocidade) {
        this.vidaMaxima = vidaMaxima;
        this.vida = vidaMaxima;
        this.ataque = ataque;
        this.defesa = defesa;
        this.velocidade = velocidade;
    }

    public Atributos(Atributos origem) {
        this.vidaMaxima = origem.vidaMaxima;
        this.vida = origem.vida;
        this.ataque = origem.ataque;
        this.defesa = origem.defesa;
        this.velocidade = origem.velocidade;
    }

    /** Aplica o dano descontando a defesa. Todo golpe causa pelo menos 1 de dano. */
    public void receberDano(int dano) {
        int danoReal = Math.max(1, dano - defesa);
        vida = Math.max(0, vida - danoReal);
    }

    public boolean estaVivo() { return vida > 0; }

    public int getVidaMaxima() { return vidaMaxima; }
    public int getVida() { return vida; }
    public int getAtaque() { return ataque; }
    public int getDefesa() { return defesa; }
    public int getVelocidade() { return velocidade; }

    /** Define a vida máxima e restaura a vida atual para esse valor. */
    public void setVidaMaxima(int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
        this.vida = vidaMaxima;
    }

    public void setAtaque(int ataque) { this.ataque = ataque; }
    public void setDefesa(int defesa) { this.defesa = defesa; }
    public void setVelocidade(int velocidade) { this.velocidade = velocidade; }

    @Override
    public String toString() {
        return "vida " + vida + "/" + vidaMaxima + ", atq " + ataque + ", def " + defesa + ", vel " + velocidade;
    }
}
