/**
 * Representa um Personagem Não-Jogável (NPC) no jogo.
 * Herda da classe abstrata Personagem.
 */
public class NPC extends Personagem {
    private PerfilNPC perfil;

    /**
     * Construtor da classe NPC.
     * @param nome O nome do NPC.
     * @param vida A vida do NPC.
     * @param perfil O perfil de comportamento do NPC.
     */
    public NPC(String nome, int vida, PerfilNPC perfil) {
        super(nome, vida);
        this.perfil = perfil;
    }

    /**
     * Retorna o perfil do NPC.
     * @return O perfil do NPC.
     */
    public PerfilNPC getPerfil() {
        return perfil;
    }

    /**
     * Implementação da habilidade especial do NPC.
     */
    @Override
    public void usarHabilidadeEspecial() {
        System.out.println("NPC usou sua habilidade.");
    }
}