import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        var garagem = new Garagem("1", Arrays.asList(
                new Veiculo("Ford", "Fiesta", 1000),
                new Veiculo("Ford", "Focus", 1200),
                new Veiculo("Ford", "Explorer", 2500),
                new Veiculo("Fiat", "Uno", 500),
                new Veiculo("Fiat", "Cronos", 1000),
                new Veiculo("Fiat", "Torino", 1250),
                new Veiculo("Chevrolet", "Aveo", 1250),
                new Veiculo("Chevrolet", "Spin", 2500),
                new Veiculo("Toyota", "Corola", 1200),
                new Veiculo("Toyota", "Fortuner", 3000),
                new Veiculo("Renault", "Logan", 950)
        ));

        garagem.getVeiculos().forEach(System.out::println);
        System.out.println();

        garagem.getVeiculos().sort((a, b) -> (int) (a.getPreco() - b.getPreco()));

        System.out.println("========== Exercício 3 ==========");

        garagem.getVeiculos().forEach(System.out::println);
        System.out.println();

        garagem.getVeiculos().sort(Comparator.comparing(Veiculo::getMarca));

        System.out.println("========== Exercício 4 ==========");
        garagem.getVeiculos().forEach(System.out::println);
        System.out.println();

        System.out.println("========== Exercício 5 ==========");

        System.out.println("========== Preços não superior a 1000 ==========");
        garagem.getVeiculos().stream().filter((v) -> v.getPreco() < 1000).forEach(System.out::println);

        System.out.println();
        System.out.println("========== Preços maiores ou iguais a 1000 ==========");
        garagem.getVeiculos().stream().filter((v) -> v.getPreco() >= 1000).forEach(System.out::println);

        System.out.println();
        System.out.printf("Preço médio total: %.2f",
                garagem.getVeiculos()
                        .stream()
                        .mapToDouble(Veiculo::getPreco).sum() / garagem.getVeiculos().size());
    }
}
