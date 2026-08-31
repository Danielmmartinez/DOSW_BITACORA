package dosw.semana_2.pokemon;

import java.util.Comparator;
import java.util.List;

public class Ejercicio19 {

    public static void main(String[] args) {

        List<Entrenador> entrenadores = List.of(
                new Entrenador(1L,"Gary",10,List.of(
                        new Pokemon(1L,"Dragonite","Dragon",80,2340,"Kanto",false)
                )),
                new Entrenador(2L,"Ash",8,List.of(
                        new Pokemon(2L,"Pikachu","Electrico",75,1850,"Kanto",false)
                )),
                new Entrenador(3L,"Dawn",7,List.of(
                        new Pokemon(3L,"Empoleon","Agua",78,2100,"Sinnoh",false)
                )),
                new Entrenador(4L,"Brock",6,List.of(
                        new Pokemon(4L,"Onix","Roca",60,1670,"Kanto",false)
                ))
        );

        List<Entrenador> top3 = entrenadores.stream()
                .sorted(
                        Comparator
                                .comparingInt(Entrenador::getMedallas)
                                .reversed()
                                .thenComparing(
                                        entrenador ->
                                                entrenador.getEquipo()
                                                        .stream()
                                                        .mapToDouble(Pokemon::getPoderCombate)
                                                        .sum(),
                                        Comparator.reverseOrder()
                                )
                                .thenComparing(Entrenador::getNombre)
                )
                .limit(3)
                .toList();

        top3.forEach(entrenador -> {

            double poderTotal =
                    entrenador.getEquipo()
                            .stream()
                            .mapToDouble(Pokemon::getPoderCombate)
                            .sum();

            System.out.println(
                    entrenador.getNombre()
                            + " - Medallas: "
                            + entrenador.getMedallas()
                            + " - PC: "
                            + poderTotal);
        });
    }
}