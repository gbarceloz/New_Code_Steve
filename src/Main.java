import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Picareta> picaretas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Fabricar picareta");
            System.out.println("2. Minerar blocos");
            System.out.println("3. Exibir status das picaretas");
            System.out.println("4. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o material da picareta (madeira, pedra, ferro, ouro, diamante): ");
                    String material = scanner.nextLine();
                    Picareta picareta = FabricarPicareta.fabricarPicareta(material);
                    if (picareta != null) {
                        picaretas.add(picareta);
                        System.out.println("Picareta de " + material + " fabricada com sucesso!");
                    }
                    break;
                case 2:
                    if (picaretas.isEmpty()) {
                        System.out.println("Não há picaretas disponíveis para minerar.");
                        break;
                    }
                    System.out.print("Escolha a picareta pelo índice (0 a " + (picaretas.size() - 1) + "): ");
                    int indice = scanner.nextInt();
                    if (indice < 0 || indice >= picaretas.size()) {
                        System.out.println("Índice inválido!");
                        break;
                    }
                    Picareta picaretaSelecionada = picaretas.get(indice);
                    System.out.print("Digite o número de blocos a minerar: ");
                    int blocos = scanner.nextInt();
                    int minerados = picaretaSelecionada.minerar(blocos);
                    System.out.println("Blocos minerados: " + minerados);
                    break;
                case 3:
                    if (picaretas.isEmpty()) {
                        System.out.println("Não há picaretas disponíveis.");
                        break;
                    }
                    for (int i = 0; i < picaretas.size(); i++) {
                        System.out.println("Picareta " + i + ":");
                        picaretas.get(i).exibirStatus();
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

}
