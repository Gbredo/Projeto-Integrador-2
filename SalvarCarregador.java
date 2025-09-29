
import java.io.*;
import java.util.Arrays;
import java.util.List;

public class SalvarCarregador {

    public static void salvarJogador(Jogador jogador, String caminhoArquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            writer.write("nome=" + jogador.getNome());
            writer.newLine();
            writer.write("vida=" + jogador.getVida());
            writer.newLine();
            writer.write("vidaMaxima=" + jogador.getVidaMaxima());
            writer.newLine();
            writer.write("inventario=" + String.join(",", jogador.getInventario()));
            writer.newLine();
            System.out.println("✅ Progresso salvo com sucesso.");
        } catch (IOException e) {
            System.out.println("❌ Erro ao salvar progresso: " + e.getMessage());
        }
    }

    public static void carregarJogador(Jogador jogador, String caminhoArquivo) {
        File arquivo = new File(caminhoArquivo);
        if (!arquivo.exists()) {
            System.out.println("⚠️ Arquivo de progresso não encontrado.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                if (linha.startsWith("nome=")) {
                    jogador.setNome(linha.substring(5));
                } else if (linha.startsWith("vida=")) {
                    jogador.setVida(Integer.parseInt(linha.substring(5)));
                } else if (linha.startsWith("vidaMaxima=")) {
                    jogador.setVidaMaxima(Integer.parseInt(linha.substring(11)));
                } else if (linha.startsWith("inventario=")) {
                    List<String> itens = Arrays.asList(linha.substring(11).split(","));
                    jogador.getInventario().clear();
                    for (String item : itens) {
                        if (!item.isBlank()) {
                            jogador.getInventario().add(item.trim());
                        }
                    }
                }
            }
            System.out.println("✅ Progresso carregado com sucesso.");
        } catch (IOException | NumberFormatException e) {
            System.out.println("❌ Erro ao carregar progresso: " + e.getMessage());
        }
    }
}
