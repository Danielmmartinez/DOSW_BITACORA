package dosw.semana_2.pokemon;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio14 {

    public static void main(String[] args) {

        List<Pokemon> pokemones = List.of(
                new Pokemon(1L,"Pikachu","Electrico",45,320,"Kanto",false),
                new Pokemon(2L,"Chikorita","Planta",40,250,"Johto",false),
                new Pokemon(3L,"Torchic","Fuego",42,275,"Hoenn",false),
                new Pokemon(4L,"Piplup","Agua",38,220,"Sinnoh",false),
                new Pokemon(5L,"Charmander","Fuego",45,300,"Kanto",false),
                new Pokemon(6L,"Totodile","Agua",44,260,"Johto",false)
        );

        Map<String, List<String>> agrupados = pokemones.stream()
                .collect(Collectors.groupingBy(
                        Pokemon::getRegion,
                        Collectors.mapping(
                                Pokemon::getNombre,
                                Collectors.toList()
                        )
                ));

        agrupados.forEach((region, lista) ->
                System.out.println(region + ": " + lista));
    }
}