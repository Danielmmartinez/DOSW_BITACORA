package dosw.semana_2.pokemon;

import java.util.Comparator;
import java.util.List;

public class Ejercicio17 {

    public static void main(String[] args) {

        Entrenador ash = new Entrenador(
                1L,
                "Ash",
                8,
                List.of(
                        new Pokemon(1L,"Pikachu","Electrico",50,600,"Kanto",false),
                        new Pokemon(2L,"Charizard","Fuego",80,650,"Kanto",false),
                        new Pokemon(3L,"Snorlax","Normal",75,600,"Kanto",false)
                )
        );

        Entrenador gary = new Entrenador(
                2L,
                "Gary",
                10,
                List.of(
                        new Pokemon(4L,"Blastoise","Agua",80,800,"Kanto",false),
                        new Pokemon(5L,"Arcanine","Fuego",75,750,"Kanto",false),
                        new Pokemon(6L,"Dragonite","Dragon",85,790,"Kanto",false)
                )
        );

        Entrenador brock = new Entrenador(
                3L,
                "Brock",
                6,
                List.of(
                        new Pokemon(7L,"Onix","Roca",60,500,"Kanto",false),
                        new Pokemon(8L,"Golem","Roca",70,570,"Kanto",false),
                        new Pokemon(9L,"Steelix","Acero",80,600,"Johto",false)
                )
        );

        List<Entrenador> entrenadores =
                List.of(ash, gary, brock);

        entrenadores.stream()
                .max(Comparator.comparingDouble(
                        entrenador -> entrenador.getEquipo()
                                .stream()
                                .mapToDouble(Pokemon::getPoderCombate)
                                .sum()
                ))
                .ifPresent(entrenador -> {

                    double total = entrenador.getEquipo()
                            .stream()
                            .mapToDouble(Pokemon::getPoderCombate)
                            .sum();

                    System.out.println(
                            "Entrenador mas poderoso: "
                                    + entrenador.getNombre());

                    System.out.println(
                            "Poder acumulado: "
                                    + total);
                });
    }
}