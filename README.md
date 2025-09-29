# PBL 09 - Documento de Objetos com Encapsulamento e Composição

**N1**

**Link do Repositório:** [https://github.com/Gbredo/Projeto-Integrador-2](https://github.com/Gbredo/Projeto-Integrador-2)

## Compatibilidade do Projeto

O projeto atual consiste em um sistema de jogo baseado em texto com estrutura de classes bem definida. A arquitetura apresentada neste documento é **totalmente compatível** com a estrutura do repositório, que contém:

- Sistema de personagens (Jogador, NPC) com herança de classe abstrata
- Sistema de cenas (Diálogo, Escolha) para narrativa interativa  
- Interfaces para interação e persistência de dados
- Encapsulamento adequado de atributos e comportamentos

A estrutura modular permite fácil expansão e manutenção do código, sendo ideal para um projeto de jogo narrativo.

## Instruções

### 1. REVISÃO DAS CLASSES E INTERFACES DO PROJETO DE JOGO

**Classes abstratas:**

- `Personagem` (classe abstrata)
- `Cena` (classe abstrata)

**Classes concretas:**

- `Jogador` (subclasse de Personagem)
- `NPC` (subclasse de Personagem)
- `CenaDeDialogo` (subclasse de Cena)
- `CenaDeEscolha` (subclasse de Cena)

**Interfaces:**

- `Interagir` (interface para objetos interativos)
- `GuardarProgresso` (interface para persistência de dados)

**Enumeração:**

- `PerfilNPC` (define tipos de comportamento para NPCs)

### 2. ENCAPSULAMENTO: ATRIBUTOS PRIVADOS E MÉTODOS DE ACESSO

**Classe: Personagem**

Atributos privados:

- `String nome`
- `int vida`

Métodos públicos:

- `getNome()` - retorna o nome do personagem
- `getVida()` - retorna a vida atual do personagem
- `usarHabilidadeEspecial()` - método abstrato implementado pelas subclasses

**Comentário:** Atributos privados garantem que o nome e vida não sejam manipulados diretamente, mantendo a integridade dos dados do personagem.

**Classe: Jogador**

Atributos privados:

- `int vidaMaxima`
- `List<String> inventario`

Métodos públicos:

- `getVidaMaxima()` - retorna a vida máxima do jogador
- `getInventario()` - retorna a lista de itens do inventário
- `usarHabilidadeEspecial()` - implementação específica do jogador

**Comentário:** O inventário encapsulado previne adição/remoção indevida de itens, enquanto a vida máxima protege contra alterações que quebrariam a lógica do jogo.

**Classe: Cena**

Atributos privados:

- `String cenaDeFundo`
- `String musica`

Métodos públicos:

- `ativarCena()` - método abstrato para executar a lógica da cena

**Comentário:** Atributos de ambiente (fundo e música) são protegidos para manter consistência visual e sonora das cenas.

### 3. COMPOSIÇÃO: RELAÇÕES ENTRE OBJETOS

**Classe: Jogador**

- Possui: `List<String> inventario` (composição de itens)

**Classe: NPC**

- Possui: `PerfilNPC perfil` (composição com enumeração de comportamento)

**Classe: CenaDeEscolha**

- Possui: `NPC npc` (composição opcional com NPC)
- Possui: `String opcao1`, `String opcao2` (opções de escolha)

**Classe: CenaDeDialogo**

- Possui: `String dialogo` (conteúdo textual da cena)

### 4. JUSTIFICATIVAS TÉCNICAS

O encapsulamento protege contra alterações inválidas (ex: vida negativa, inventário manipulado externamente). A composição permite que personagens tenham comportamentos específicos (Jogador com inventário, NPC com perfil), e cenas interativas possam conter NPCs. Esta estrutura modular facilita a expansão do jogo com novos tipos de personagens, cenas e mecânicas de interação, além de possibilitar futuras integrações como sistema de save/load através da interface `GuardarProgresso`.

### 5. DIAGRAMA UML SIMPLIFICADO

```
Personagem (abstrata)
 ├─ Jogador
 │   └─ List<String> inventario
 └─ NPC
     └─ PerfilNPC perfil

Cena (abstrata)
 ├─ CenaDeDialogo
 │   └─ String dialogo
 └─ CenaDeEscolha
     ├─ NPC npc
     ├─ String opcao1
     └─ String opcao2

Interfaces:
- Interagir
- GuardarProgresso

Enumeração:
- PerfilNPC (INTELIGENTE, SOCIAL, BRUTO)
```

### 6. TABELA DE RELAÇÕES DE COMPOSIÇÃO

| Classe Principal | Composição           | Multiplicidade   |
| ---------------- | -------------------- | ---------------- |
| Jogador          | String (inventario)  | 0..n             |
| NPC              | PerfilNPC            | 1 (obrigatória)  |
| CenaDeEscolha    | NPC                  | 0..1 (opcional)  |
| CenaDeEscolha    | String (opções)      | 2 (obrigatórias) |
| CenaDeDialogo    | String (dialogo)     | 1 (obrigatória)  |
| Cena             | String (cenaDeFundo) | 1 (obrigatória)  |
| Cena             | String (musica)      | 1 (obrigatória)  |

### 7. CHECKLIST DE ENTREGA

- [x] Atributos identificados e encapsulados
- [x] Justificativas técnicas claras
- [x] Composição entre objetos descrita
- [x] Diagrama ou rascunho de estrutura de objetos
- [x] Clareza conceitual do projeto

### 8. ANÁLISE DETALHADA DAS INTERFACES

**Interface Interagir:**

- Define contratos para objetos que podem interagir com o jogador
- Métodos: `interagir()` e `obterRetornoInteracao()`
- Permite polimorfismo para diferentes tipos de interação

**Interface GuardarProgresso:**

- Define contratos para persistência de dados
- Métodos: `salvarProgresso()` e `carregarProgresso()`
- Fundamental para sistema de save/load do jogo

### 9. HERANÇA E POLIMORFISMO

**Hierarquia Personagem:**

- Classe abstrata `Personagem` define estrutura básica
- `Jogador` e `NPC` implementam `usarHabilidadeEspecial()` de forma específica
- Permite tratamento polimórfico de todos os personagens

**Hierarquia Cena:**

- Classe abstrata `Cena` define estrutura básica de cenas
- `CenaDeDialogo` e `CenaDeEscolha` implementam `ativarCena()` diferentemente
- Facilita adição de novos tipos de cena no futuro
