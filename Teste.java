public class Teste {

    /**
     * Verifica se o resultado obtido é igual ao esperado.
     *
     * @param descricao Descrição do teste.
     * @param obtido    Valor retornado pelo método.
     * @param esperado  Valor esperado.
     */
    public static void verificar(String descricao, Object obtido, Object esperado) {
        if ((obtido == null && esperado == null) || (obtido != null && obtido.equals(esperado))) {
            System.out.println("✅ SUCESSO: " + descricao);
        } else {
            System.out.println("❌ FALHA: " + descricao);
            System.out.println("   Esperado: " + esperado);
            System.out.println("   Obtido:   " + obtido);
        }
    }
}
