/**
 * Classe abstrata que representa uma cena no jogo.
 * Define a estrutura básica de todas as cenas.
 */
public abstract class Cena {
    private String cenaDeFundo;
    private String musica;

    /**
     * Construtor para a classe Cena.
     * @param cenaDeFundo O descritivo do cenário de fundo.
     * @param musica O nome do arquivo de música para a cena.
     */
    public Cena(String cenaDeFundo, String musica) {
        this.cenaDeFundo = cenaDeFundo;
        this.musica = musica;
    }

    /**
     * Método abstrato que ativa a lógica da cena.
     * Será implementado pelas subclasses.
     */
    public abstract void ativarCena();
}