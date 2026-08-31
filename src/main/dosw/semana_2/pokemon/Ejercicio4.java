package dosw.semana_2.pokemon;

import java.util.Comparator;
import java.util.List;

public class Ejercicio4 {

    public static void main(String[] args) {

        List<Pokemon> equipo = List.of(
                new Pokemon(1L,"Pikachu","Electrico",45,320,"Kanto",false),
                new Pokemon(2L,"Charmander","Fuego",62,410,"Kanto",false),
                new Pokemon(3L,"Squirtle","Agua",38,210,"Kanto",false),
                new Pokemon(4L,"Snorlax","Normal",90,600,"Kanto",false),
                new Pokemon(5L,"Mewtwo","Psiquico",88,680,"Kanto",true)
        );

        equipo.stream()
                .max(Comparator.comparingInt(Pokemon::getNivel))
                .ifPresent(System.out::println);
    }
}