/**
 * Representa uma cena onde o jogador deve fazer uma escolha.
 * Herda da classe abstrata Cena.
 */
public class CenaDeEscolha extends Cena {
    private String descricao;
    private NPC npc;
    private String opcao1;
    private String opcao2;

    /**
     * Construtor para a CenaDeEscolha.
     * @param cenaDeFundo Descritivo do cenário.
     * @param musica Nome da música.
     * @param descricao Texto que descreve a situação da escolha.
     * @param npc O NPC envolvido na cena, pode ser null.
     * @param opcao1 Texto da primeira opção de escolha.
     * @param opcao2 Texto da segunda opção de escolha.
     */
    public CenaDeEscolha(String cenaDeFundo, String musica, String descricao, NPC npc, String opcao1, String opcao2) {
        super(cenaDeFundo, musica);
        this.descricao = descricao;
        this.npc = npc;
        this.opcao1 = opcao1;
        this.opcao2 = opcao2;
    }

    /**
     * Retorna o NPC associado a esta cena.
     * @return O objeto NPC.
     */
    public NPC getNpc() {
        return npc;
    }

    /**
     * Ativa a cena, exibindo a descrição e as opções para o jogador.
     */
    @Override
    public void ativarCena() {
        System.out.println("--------------------");
        System.out.println(descricao);
        System.out.println("Suas opções:");
        System.out.println("1. " + opcao1);
        System.out.println("2. " + opcao2);
        System.out.print("Escolha uma opção: ");
    }
}