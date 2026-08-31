package dosw.semana_2.pokemon;

import java.util.List;

public class Ejercicio2 {

    public static void main(String[] args) {

        List<String> pokemons =
                List.of("Pikachu","Charmander","Squirtle","Bulbasaur");

        pokemons.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}