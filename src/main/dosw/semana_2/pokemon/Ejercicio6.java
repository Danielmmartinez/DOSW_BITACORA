package dosw.semana_2.pokemon;

import java.util.List;

public class Ejercicio6 {

    public static void main(String[] args) {

        List<String> pokemons = List.of(
                "Pikachu",
                "Charmander",
                "Pikachu",
                "Squirtle",
                "Charmander",
                "Mewtwo"
        );

        pokemons.stream()
                .distinct()
                .forEach(System.out::println);
    }
}