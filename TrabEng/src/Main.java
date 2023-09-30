import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<String> arquivo = new ArrayList<>();
        List<String> cache = new ArrayList<>();
        Scanner ler = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);
        String caminho = "filmes.txt";
        try (BufferedReader bf = new BufferedReader(new FileReader(caminho))) {
            String linha;
            linha = bf.readLine();
            while (linha != null) {
                arquivo.add(linha);
                linha = bf.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // String filmeProcurado ="Coringa";
        cache.add("Cisne Negro");
        cache.add("Parasita");
        cache.add("Tropa de Elite");
        cache.add("Argo");
        cache.add("1917");
        cache.add("O Quarto de Jack");
        cache.add("A Teoria de Tudo");
        cache.add("Gravidade");
        cache.add("A Origem");
        cache.add("Pulp Fiction");
        cache.add("O Senhor dos Anéis: A Sociedade do Anel");
        cache.add("O Silêncio dos Inocentes");
        cache.add("Aquarius");
        cache.add("Os Matadores");
        cache.add("O Céu de Suely");
        cache.add("Cidade de Deus");
        cache.add("O Discurso do Rei");

        String filmeProcurado = "O Discurso do Rei";

        long startTimeArq = System.currentTimeMillis();
        for (int i = 0; i < arquivo.size(); i++) {
            if (filmeProcurado.equalsIgnoreCase(arquivo.get(i))) {
                cache.add(arquivo.get(i));
                System.out.println("\n\nArquivo: \nFilme encontrado ! \nFilme: " + filmeProcurado + "\nPosição: " + i);
                break;
            }
        }
        long endTimeArq = System.currentTimeMillis();
        long tempoArq = endTimeArq - startTimeArq;
        System.out.println("Tempo gasto: " + tempoArq + " milisegundos");

        long startTimeCache = System.currentTimeMillis();
        for (int i = 0; i < cache.size(); i++) {
            if (filmeProcurado.equalsIgnoreCase(cache.get(i))) {
                System.out.println("\n\nCache: \nFilme encontrado ! \nFilme: " + filmeProcurado + "\nPosição: " + i);
                break;
            }
        }
        long endTimeCache = System.currentTimeMillis();
        long tempoCache = endTimeCache - startTimeCache;
        System.out.println("Tempo gasto: " + tempoCache + " milisegundos");


    }
}