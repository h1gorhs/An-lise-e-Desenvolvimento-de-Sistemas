# Relatório — Padrão Prototype
## 1. Antes x depois

Medições obtidas executando `java Jogo` antes e depois da refatoração nesta máquina. Os tempos podem variar conforme o computador.

| Métrica | Antes | Depois |
|---|---:|---:|
| Inimigos criados | 154 | 154 |
| Tempo total | 15.511 ms | 465 ms |
| Sprites lidos do disco | 154 | 4 |
| Sprites em memória | 154 objetos (2.464 KB) | 4 objetos (64 KB) |

Após a mudança, a criação dos inimigos ocorre por clonagem. Cada arquivo de sprite é carregado uma única vez na inicialização da fábrica e o mesmo objeto `Sprite` é reutilizado pelos clones. Os testes automáticos terminaram com **9 aprovados e 0 reprovados**.

## 2. Decisões de cópia

| Campo de `Inimigo` | Compartilhado ou copiado? | Por quê? |
|---|---|---|
| `nome` | Compartilhado (referência) | É uma `String`, que é imutável. A alteração do nome de um clone substitui sua referência e não modifica a string original. |
| `sprite` | Compartilhado | `Sprite` é imutável e caro de carregar; compartilhar evita leituras repetidas e economiza memória. |
| `atributos` | Copiado (cópia profunda) | É mutável: vida, ataque e defesa podem mudar. Cada inimigo precisa ter seus próprios atributos. |
| `habilidades` (a lista) | Copiada | A lista é mutável; aprender uma habilidade em um clone não pode alterar a lista de outro. |
| Cada `Habilidade` da lista | Compartilhada | `Habilidade` é um `record` imutável, então seus objetos podem ser reutilizados com segurança. |
| `inventario` | Copiado (incluindo a coleção interna) | O inventário pode receber itens durante a partida. Cada inimigo deve manter sua própria lista. Os itens são strings imutáveis. |
| `posicao` | Copiada | A posição é mutável; cada inimigo precisa se mover independentemente no mapa. |

## 3. Perguntas

**a) O que aconteceria com as posições dos inimigos se `posicao` fosse copiada de forma rasa? Por quê?**

Todos os clones que compartilhassem a mesma `Posicao` alterariam as coordenadas uns dos outros. Ao mover um inimigo, todos os que apontassem para aquele objeto apareceriam na mesma posição, pois `Posicao` é mutável.

**b) Por que é seguro compartilhar o `Sprite` entre todos os clones, mas não os `Atributos`?**

O `Sprite` é imutável: depois de criado, seus dados não mudam. Já `Atributos` muda durante o combate, por exemplo quando um inimigo recebe dano. Se fossem compartilhados, ferir um inimigo também alteraria a vida dos outros.

**c) Ao criar o `orc-chefe` clonando o `orc`, o que acontece com o protótipo do `orc` se a cópia de `atributos` for rasa?**

A alteração dos atributos para transformar o clone em chefe — como aumentar vida, ataque e defesa — também modificaria o protótipo do `orc`. Os próximos orcs comuns poderiam nascer com os atributos do chefe. A cópia profunda impede esse vazamento.

**d) Para adicionar um novo inimigo, o “Lobo”, quais classes você precisa alterar agora? E quais precisaria alterar no código original?**

Na solução refatorada, basta registrar o protótipo do Lobo na inicialização da `FabricaDeInimigos` (e carregar seu sprite, caso seja um recurso novo). Não é necessário criar uma subclasse nem alterar um `switch`; o método público `criar(String tipo)` e o `GeradorDeOnda` permanecem iguais. No código original, seria necessário acrescentar um novo `case` ao `switch` de `FabricaDeInimigos`, incluindo a criação do sprite, atributos, habilidades e itens. Se o Lobo também precisasse aparecer nas ondas, seria necessário ajustar `GeradorDeOnda` em ambas as versões.
