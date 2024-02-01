import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomesMasculinos = new ArrayList<>();
        List<String> nomesFemininos = new ArrayList<>();

        while (true) {
            System.out.print("Digite o nome e o sexo (M/F) separados por espaço (ou digite 'sair' para terminar): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("sair")) {
                break;
            }

            String[] parts = input.split(" ");
            if (parts.length != 2) {
                System.out.println("Entrada inválida. Por favor, insira nome e sexo separados por espaço.");
                continue;
            }

            String nome = parts[0];
            String sexo = parts[1].toUpperCase();

            if (!sexo.equals("M") && !sexo.equals("F")) {
                System.out.println("Sexo inválido. Por favor, insira 'M' para masculino ou 'F' para feminino.");
                continue;
            }

            if (sexo.equals("M")) {
                nomesMasculinos.add(nome);
            } else {
                nomesFemininos.add(nome);
            }
        }

        System.out.println("\n--- Grupos Masculinos ---");
        printNomes(nomesMasculinos);

        System.out.println("\n--- Grupos Femininos ---");
        printNomes(nomesFemininos);

        scanner.close();
    }

    private static void printNomes(List<String> nomes) {
        if (nomes.isEmpty()) {
            System.out.println("Nenhum nome encontrado para este grupo.");
        } else {
            for (String nome : nomes) {
                System.out.println(nome);
            }
        }
    }
}
