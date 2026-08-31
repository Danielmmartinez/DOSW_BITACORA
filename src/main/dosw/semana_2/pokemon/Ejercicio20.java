package dosw.semana_2.pokemon;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio20 {

    public static void main(String[] args) {

        List<Pokemon> pokemones = List.of(
                new Pokemon(1L,"Pikachu","Electrico",45,320,"Kanto",false),
                new Pokemon(2L,"Mewtwo","Psiquico",88,680,"Kanto",true),
                new Pokemon(3L,"Dragonite","Dragon",82,530,"Kanto",false),
                new Pokemon(4L,"Squirtle","Agua",38,210,"Kanto",false),
                new Pokemon(5L,"Gengar","Fantasma",70,495,"Kanto",false),
                new Pokemon(6L,"Charizard","Fuego",85,610,"Kanto",false),
                new Pokemon(7L,"Mew","Psiquico",90,670,"Kanto",true)
        );

        Map<String, Long> porTipo = pokemones.stream()
                .collect(Collectors.groupingBy(
                        Pokemon::getTipo,
                        Collectors.counting()
                ));

        Map<String, Long> porRegion = pokemones.stream()
                .collect(Collectors.groupingBy(
                        Pokemon::getRegion,
                        Collectors.counting()
                ));

        long legendarios = pokemones.stream()
                .filter(Pokemon::isLegendario)
                .count();

        double promedioNivel = pokemones.stream()
                .mapToInt(Pokemon::getNivel)
                .average()
                .orElse(0);

        Pokemon masFuerte = pokemones.stream()
                .max(Comparator.comparingDouble(
                        Pokemon::getPoderCombate))
                .orElse(null);

        System.out.println("Por tipo: " + porTipo);
        System.out.println("Por region: " + porRegion);
        System.out.println("Legendarios: " + legendarios);
        System.out.println("Promedio nivel: " + promedioNivel);

        if (masFuerte != null) {
            System.out.println(
                    "Mas fuerte: "
                            + masFuerte.getNombre()
                            + " PC: "
                            + masFuerte.getPoderCombate());
        }
    }
}