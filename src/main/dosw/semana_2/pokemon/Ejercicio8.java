package dosw.semana_2.pokemon;

import java.util.List;

public class Ejercicio8 {

    public static void main(String[] args) {

        List<PokemonEvolucion> pokemones = List.of(
                new PokemonEvolucion("Pikachu", true),
                new PokemonEvolucion("Raichu", false),
                new PokemonEvolucion("Charmander", true),
                new PokemonEvolucion("Charizard", false),
                new PokemonEvolucion("Squirtle", true),
                new PokemonEvolucion("Blastoise", false)
        );

        List<String> resultado = pokemones.stream()
                .filter(PokemonEvolucion::isPuedeEvolucionar)
                .map(PokemonEvolucion::getNombre)
                .toList();

        System.out.println(resultado);
    }
}