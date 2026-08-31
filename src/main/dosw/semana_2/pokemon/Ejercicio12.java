package dosw.semana_2.pokemon;

import java.util.Comparator;
import java.util.List;

public class Ejercicio12 {

    public static void main(String[] args) {

        List<Pokemon> pokemones = List.of(
                new Pokemon(1L,"Pikachu","Electrico",45,320,"Kanto",false),
                new Pokemon(2L,"Mewtwo","Psiquico",88,680,"Kanto",true),
                new Pokemon(3L,"Dragonite","Dragon",82,530,"Kanto",false),
                new Pokemon(4L,"Charizard","Fuego",85,610,"Kanto",false)
        );

        pokemones.stream()
                .max(Comparator.comparingDouble(Pokemon::getPoderCombate))
                .ifPresent(pokemon ->
                        System.out.println(
                                "Campeon: "
                                        + pokemon.getNombre()
                                        + " con PC: "
                                        + pokemon.getPoderCombate()));
    }
}