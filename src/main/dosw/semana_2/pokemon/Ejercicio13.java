package dosw.semana_2.pokemon;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio13 {

    public static void main(String[] args) {

        List<Pokemon> pokemones = List.of(
                new Pokemon(1L,"Squirtle","Agua",38,210,"Kanto",false),
                new Pokemon(2L,"Psyduck","Agua",40,250,"Kanto",false),
                new Pokemon(3L,"Charmander","Fuego",45,300,"Kanto",false),
                new Pokemon(4L,"Vulpix","Fuego",50,320,"Kanto",false),
                new Pokemon(5L,"Bulbasaur","Planta",42,280,"Kanto",false)
        );

        Map<String, List<String>> agrupados = pokemones.stream()
                .collect(Collectors.groupingBy(
                        Pokemon::getTipo,
                        Collectors.mapping(
                                Pokemon::getNombre,
                                Collectors.toList()
                        )
                ));

        agrupados.forEach((tipo, lista) ->
                System.out.println(tipo + ": " + lista));
    }
}