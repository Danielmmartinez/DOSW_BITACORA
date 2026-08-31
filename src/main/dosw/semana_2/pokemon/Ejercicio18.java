package dosw.semana_2.pokemon;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Ejercicio18 {

    public static void main(String[] args) {

        List<Pokemon> pokemones = List.of(
                new Pokemon(1L, "Pikachu", "Electrico", 45, 320, "Kanto", false),
                new Pokemon(2L, "Mewtwo", "Psiquico", 88, 680, "Kanto", true),
                new Pokemon(3L, "Dragonite", "Dragon", 82, 530, "Kanto", false),
                new Pokemon(4L, "Gengar", "Fantasma", 70, 495, "Kanto", false),
                new Pokemon(5L, "Charizard", "Fuego", 85, 610, "Kanto", false),
                new Pokemon(6L, "Blastoise", "Agua", 80, 500, "Kanto", false)
        );

        List<Pokemon> top5 = pokemones.stream()
                .sorted(
                        Comparator.comparingDouble(Pokemon::getPoderCombate)
                                .reversed()
                )
                .limit(5)
                .toList();

        IntStream.range(0, top5.size())
                .forEach(i -> System.out.println(
                        "#" + (i + 1) + " "
                                + top5.get(i).getNombre()
                                + " - PC: "
                                + top5.get(i).getPoderCombate()
                ));
    }
}