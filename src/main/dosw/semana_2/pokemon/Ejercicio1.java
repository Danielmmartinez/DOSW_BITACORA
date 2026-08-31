package dosw.semana_2.pokemon;

import java.util.List;

public class Ejercicio1 {

    public static void main(String[] args) {

        List<Pokemon> pokemons = List.of(
                new Pokemon(1L,"Pikachu","Electrico",45,320,"Kanto",false),
                new Pokemon(2L,"Charmander","Fuego",62,410,"Kanto",false),
                new Pokemon(3L,"Squirtle","Agua",38,210,"Kanto",false),
                new Pokemon(4L,"Vulpix","Fuego",40,330,"Kanto",false),
                new Pokemon(5L,"Flareon","Fuego",70,520,"Kanto",false)
        );

        pokemons.stream()
                .filter(p -> p.getTipo().equalsIgnoreCase("Fuego"))
                .map(Pokemon::getNombre)
                .forEach(System.out::println);
    }
}