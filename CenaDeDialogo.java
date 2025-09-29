/**
 * Representa uma cena que consiste principalmente em diálogo.
 * Herda da classe abstrata Cena.
 */
public class CenaDeDialogo extends Cena {
    private String dialogo;

    /**
     * Construtor para a CenaDeDialogo.
     * @param cenaDeFundo O descritivo do cenário de fundo.
     * @param musica O nome do arquivo de música para a cena.
     * @param dialogo O texto de diálogo para esta cena.
     */
    public CenaDeDialogo(String cenaDeFundo, String musica, String dialogo) {
        super(cenaDeFundo, musica);
        this.dialogo = dialogo;
    }

    /**
     * Ativa a cena, exibindo o diálogo no console.
     */
    @Override
    public void ativarCena() {
        System.out.println(dialogo);
    }
}