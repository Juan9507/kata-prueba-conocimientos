package org.example;

import org.example.model.Copas;
import org.example.model.Futbolista;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

import java.util.List;

/**
 * Programación reactiva flujo con Mono
 * Training ciclo 3 - programacion de software
 *
 * @author Juan David Rrivera
 * @version [1.0.0]
 * @since [1.0.0]
 */
public class KataReactivo {

    private Flux<Futbolista> futbolista;

    public KataReactivo() {
        futbolista = Flux.just(
                new Futbolista("Pepito", "Suarez", 18, List.of(
                        new Copas("uefa", 3),
                        new Copas("America", 2)
                )),
                new Futbolista("Jose", "Mendez", 17,  List.of(
                        new Copas("uefa", 6),
                        new Copas("America", 1)
                )),
                new Futbolista("lorito", "polo", 12, List.of(
                        new Copas("uefa", 4),
                        new Copas("America", 1)
                ))
        );
    }

    //TODO retornar un Mono emty
    Mono<String> emtyMono() {
        return Mono.empty();
    }

    //TODO retornar un Mono con el valor "Hola Mundo"
    Mono<String> monoHolaMundo() {
        return Mono.just("Hola Mundo");
    }

    //TODO de un flux de usuarios retornar el usuario que su edad sea igual a 18 como un mono, utilice filter
    Mono<Futbolista> monoUsuario() {
        return futbolista
                .filter(usuario -> usuario.getEdad() == 18)
                .next();
    }

    //TODO sumar todas las copas de los jugadores usar flatmapIterable
    Mono<Integer> sumarTodasLasCopasAmerica() {
        return futbolista
                .map(Futbolista::getCopas)
                .flatMapIterable(copas -> copas)
                .map(Copas::getNumero)
                .reduce(Integer::sum);

    }

    //TODO retornar los nombres de los futbolistas que tengan la edad mayor a 12
    Flux<String> LosNombreDeLosFutbolistaConEdadMayorADoce(){
        return futbolista
                .filter(futbolista1 -> futbolista1.getEdad() > 12)
                .map(futbolista1 -> futbolista1.getNombre());
    }

    //TODO combinar dos flujos Mono string, usar zip
    Flux<Tuple2<String, String>> combinarDosFlujosConZip(){
        var flujo01 = Mono.just("Luis");
        var flujo02 = Mono.just("Thomas");

        return Flux.zip(flujo01,flujo02);

    }





}
