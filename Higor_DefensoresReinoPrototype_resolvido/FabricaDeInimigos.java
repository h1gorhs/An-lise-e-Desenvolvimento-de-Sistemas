/**
 * Inicializa os protótipos uma vez e cria novos inimigos por clonagem.
 */
public class FabricaDeInimigos {
    private final RegistroDeInimigos registro = new RegistroDeInimigos();

    public FabricaDeInimigos() { registrarPrototipos(); }

    private void registrarPrototipos() {
        Sprite spriteGoblin = CarregadorDeRecursos.carregarSprite("sprites/goblin.png");
        Inimigo goblin = new Inimigo("Goblin", spriteGoblin, new Atributos(30, 6, 1, 3));
        goblin.aprenderHabilidade(new Habilidade("Facada", 6, 1));
        goblin.adicionarItem("Moeda de cobre");
        registro.registrar("goblin", goblin);

        Inimigo arqueiro = goblin.clonar();
        arqueiro.setNome("Goblin Arqueiro");
        arqueiro.getAtributos().setVidaMaxima(25);
        arqueiro.getAtributos().setAtaque(8);
        arqueiro.getAtributos().setDefesa(0);
        arqueiro.aprenderHabilidade(new Habilidade("Flechada", 9, 2));
        arqueiro.adicionarItem("Flecha");
        registro.registrar("goblin-arqueiro", arqueiro);

        Sprite spriteOrc = CarregadorDeRecursos.carregarSprite("sprites/orc.png");
        Inimigo orc = new Inimigo("Orc", spriteOrc, new Atributos(80, 12, 4, 2));
        orc.aprenderHabilidade(new Habilidade("Machadada", 12, 2));
        orc.adicionarItem("Moeda de prata");
        registro.registrar("orc", orc);

        Inimigo chefe = orc.clonar();
        chefe.setNome("Orc Chefe");
        chefe.getAtributos().setVidaMaxima(200);
        chefe.getAtributos().setAtaque(20);
        chefe.getAtributos().setDefesa(8);
        chefe.aprenderHabilidade(new Habilidade("Grito de guerra", 0, 10));
        chefe.adicionarItem("Elmo do chefe");
        registro.registrar("orc-chefe", chefe);

        Sprite spriteEsqueleto = CarregadorDeRecursos.carregarSprite("sprites/esqueleto.png");
        Inimigo esqueleto = new Inimigo("Esqueleto", spriteEsqueleto, new Atributos(45, 9, 2, 2));
        esqueleto.aprenderHabilidade(new Habilidade("Golpe de osso", 9, 1));
        esqueleto.adicionarItem("Osso");
        registro.registrar("esqueleto", esqueleto);

        Sprite spriteDragao = CarregadorDeRecursos.carregarSprite("sprites/dragao.png");
        Inimigo dragao = new Inimigo("Dragão", spriteDragao, new Atributos(600, 45, 15, 1));
        dragao.aprenderHabilidade(new Habilidade("Sopro de fogo", 45, 5));
        dragao.aprenderHabilidade(new Habilidade("Garra", 20, 1));
        dragao.adicionarItem("Escama de dragão");
        dragao.adicionarItem("Ouro");
        registro.registrar("dragao", dragao);
    }

    public Inimigo criar(String tipo) { return registro.criar(tipo); }
}
