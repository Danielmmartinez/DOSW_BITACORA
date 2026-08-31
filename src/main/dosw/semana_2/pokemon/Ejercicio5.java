package dosw.semana_2.pokemon;

import java.util.List;

public class Ejercicio5 {

    public static void main(String[] args) {

        List<Pokemon> equipo = List.of(
                new Pokemon(1L,"Pikachu","Electrico",45,320,"Kanto",false),
                new Pokemon(2L,"Mewtwo","Psiquico",88,680,"Kanto",true),
                new Pokemon(3L,"Dragonite","Dragon",82,530,"Kanto",false),
                new Pokemon(4L,"Mew","Psiquico",85,650,"Kanto",true),
                new Pokemon(5L,"Squirtle","Agua",38,210,"Kanto",false)
        );

        long total =
                equipo.stream()
                        .filter(p -> p.getNivel() > 80)
                        .count();

        System.out.println(total);
    }
}