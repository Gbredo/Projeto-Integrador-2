import java.util.ArrayList;
import java.util.List;

/**
 * Representa o personagem controlado pelo jogador.
 * Herda da classe abstrata Personagem.
 */
public class Jogador extends Personagem {
    private int vidaMaxima;
    private List<String> inventario;

    /**
     * Construtor da classe Jogador.
     * @param nome O nome do jogador.
     * @param vida A vida inicial do jogador.
     * @param vidaMaxima A vida máxima que o jogador pode ter.
     */
    public Jogador(String nome, int vida, int vidaMaxima) {
        super(nome, vida);
        this.vidaMaxima = vidaMaxima;
        this.inventario = new ArrayList<>();
    }

    /**
     * Retorna a vida máxima do jogador.
     * @return A vida máxima.
     */
    public int getVidaMaxima() {
        return vidaMaxima;
    }

    /**
     * Retorna o inventário do jogador.
     * @return Uma lista de strings representando os itens no inventário.
     */
    public List<String> getInventario() {
        return inventario;
    }

    /**
     * Implementação da habilidade especial do jogador.
     */
    @Override
    public void usarHabilidadeEspecial() {
        System.out.println("Jogador usou sua habilidade especial.");
    }
}