/**
 * Classe abstrata que representa um personagem no jogo.
 * Define os atributos e comportamentos básicos de todos os personagens.
 */
public abstract class Personagem {
    private String nome;
    private int vida;

    /**
     * Construtor para a classe Personagem.
     * @param nome O nome do personagem.
     * @param vida A quantidade de vida inicial do personagem.
     */
    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    /**
     * Retorna o nome do personagem.
     * @return O nome do personagem.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Retorna a vida atual do personagem.
     * @return A vida atual.
     */
    public int getVida() {
        return vida;
    }

    /**
     * Método abstrato para a habilidade especial de cada personagem.
     * A implementação será específica para cada subclasse.
     */
    public abstract void usarHabilidadeEspecial();
}