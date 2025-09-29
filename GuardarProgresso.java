/**
 * Interface para objetos que precisam salvar e carregar seu estado.
 */
public interface GuardarProgresso {
    /**
     * Salva o estado atual do objeto.
     */
    void salvarProgresso();

    /**
     * Carrega o estado de um objeto a partir de uma fonte de dados.
     */
    void carregarProgresso();
}