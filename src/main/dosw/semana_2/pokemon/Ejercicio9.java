package dosw.semana_2.pokemon;

import java.util.List;

public class Ejercicio9 {

    public static void main(String[] args) {

        List<Pokemon> equipo = List.of(
                new Pokemon(1L,"Pikachu","Electrico",45,320,"Kanto",false),
                new Pokemon(2L,"Mewtwo","Psiquico",88,680,"Kanto",true),
                new Pokemon(3L,"Dragonite","Dragon",82,530,"Kanto",false),
                new Pokemon(4L,"Squirtle","Agua",38,210,"Kanto",false),
                new Pokemon(5L,"Gengar","Fantasma",70,495,"Kanto",false),
                new Pokemon(6L,"Charizard","Fuego",85,610,"Kanto",false)
        );

        List<Pokemon> resultado = equipo.stream()
                .filter(pokemon -> pokemon.getPoderCombate() > 500)
                .toList();

        System.out.println(resultado);
    }
}