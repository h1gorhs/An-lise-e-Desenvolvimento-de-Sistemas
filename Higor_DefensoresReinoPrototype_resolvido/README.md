# Atividade prática: padrão Prototype

## Defensores do Reino

### Contexto

O jogo **Defensores do Reino**, um *tower defense* possui ondas de inimigos (goblins, orcs, esqueletos e dragões) que atravessam o mapa, e o jogador constrói torres para impedi-los.

O jogo funciona, mas os testadores reclamaram de um problema sério:

> "Entre uma onda e outra o jogo congela. Na onda 10 fica quase 3 segundos parado. Em celular fraco é ainda pior."

Investigando, a equipe descobriu que **toda vez que um inimigo é criado, a imagem dele (o sprite) é lida do disco de novo**, e que a classe `FabricaDeInimigos` virou um grande `switch` cheio de código repetido. Sua tarefa é resolver isso aplicando o padrão **Prototype**.

### Como executar

Requisito: **Java 17 ou superior**.

```bash
javac -encoding UTF-8 *.java
java Jogo               # simula as 10 primeiras ondas e mede o tempo
java TesteDaAtividade   # roda os testes automáticos da atividade
```

> No Windows, se os acentos aparecerem quebrados no terminal, rode `chcp 65001` antes.

Rode os dois **antes de alterar qualquer coisa** e anote os números. Você vai ver que o jogo leva cerca de **15 segundos** e lê o disco **154 vezes** para só 4 imagens diferentes, e que 3 testes falham. Variações podem acontecer a depender da máquina.

### As classes do projeto

| Classe | O que é | Observação importante |
|---|---|---|
| `Inimigo` | Um inimigo do jogo | Possui todos os objetos abaixo |
| `Sprite` | A imagem do inimigo (16 KB) | **Imutável** e **cara de criar** |
| `Atributos` | Vida, ataque, defesa, velocidade | **Mutável**: a vida muda no combate |
| `Habilidade` | Ataques especiais (`record`) | **Imutável** |
| `Inventario` | Itens que o inimigo deixa cair | **Mutável** |
| `Posicao` | Coordenadas no mapa | **Mutável**: muda a cada movimento |
| `FabricaDeInimigos` | Cria inimigos a partir de um tipo (`"goblin"`, `"orc"`...) | **É aqui que está o problema** |
| `GeradorDeOnda` | Monta cada onda pedindo inimigos à fábrica | **Não altere** (é o cliente) |
| `CarregadorDeRecursos` | Simula a leitura lenta do disco | **Não altere** |
| `Jogo` | Programa principal | Pode alterar se quiser |
| `TesteDaAtividade` | Testes automáticos | **Não altere** |

### O que você deve fazer

**1. Aplicar o padrão Prototype**
- Crie uma interface `Prototipo` com o método `clonar()`.
- Faça `Inimigo` implementar essa interface.
- Implemente a cópia usando **construtores de cópia**. Se preferir usar `Cloneable`/`Object.clone()`, justifique a escolha no relatório.

**2. Criar um registro de protótipos**
- Crie a classe `RegistroDeInimigos`, com os métodos `registrar(String tipo, Inimigo prototipo)` e `criar(String tipo)`.
- O método `criar` deve devolver **um clone** do protótipo registrado, nunca o próprio protótipo.

**3. Refatorar a `FabricaDeInimigos`**
- Ela deve montar os protótipos **uma única vez** e depois só clonar.
- O `switch` deve desaparecer.
- A assinatura `public Inimigo criar(String tipo)` **não pode mudar**: o `GeradorDeOnda` precisa continuar funcionando sem nenhuma alteração.

**4. Criar as variantes por clonagem**
- `goblin-arqueiro` e `orc-chefe` são versões levemente diferentes de `goblin` e `orc`.
- Elas devem ser criadas **clonando o tipo base e ajustando só o que muda**, sem subclasses novas e sem ler o sprite do disco outra vez.

**5. Decidir a profundidade da cópia (a parte mais importante)**
- Para cada campo de `Inimigo`, decida se ele deve ser **compartilhado** entre os clones (cópia rasa) ou **copiado** (cópia profunda).
- Atenção: copiar tudo também está errado. Os testes verificam os dois lados.

### Relatório (arquivo `RELATORIO.md`)

Entregue junto com o código um relatório curto na raiz da pasta com nome RELATORIO.md. Nele deve conter:

1. **Antes x depois:** a saída do `java Jogo` antes e depois da refatoração (tempo total, leituras de disco e memória em sprites).
2. **Tabela de decisões de cópia**, preenchida e justificada:

   | Campo de `Inimigo` | Compartilhado ou copiado? | Por quê? |
   |---|---|---|
   | `nome` | | |
   | `sprite` | | |
   | `atributos` | | |
   | `habilidades` (a lista) | | |
   | cada `Habilidade` da lista | | |
   | `inventario` | | |
   | `posicao` | | |

3. **Perguntas:**
   - a) O que aconteceria com as posições dos inimigos se `posicao` fosse copiada de forma rasa? Por quê?
   - b) Por que é seguro compartilhar o `Sprite` entre todos os clones, mas não os `Atributos`?
   - c) Ao criar o `orc-chefe` clonando o `orc`, o que acontece com o protótipo do `orc` se a cópia de `atributos` for rasa?
   - d) Para adicionar um novo inimigo, o "Lobo", quais classes você precisa alterar agora? E quais precisaria alterar no código original?
