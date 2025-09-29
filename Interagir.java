/**
 * Interface para definir objetos que podem interagir com o jogador.
 */
public interface Interagir {
    /**
     * Executa a lógica de interação principal.
     */
    void interagir();

    /**
     * Retorna uma string que descreve o resultado da interação.
     * @return Uma string com o resultado.
     */
    String obterRetornoInteracao();
}