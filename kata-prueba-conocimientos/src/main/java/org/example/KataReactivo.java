package org.example;

import org.example.model.Copas;
import org.example.model.Futbolista;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

import java.util.List;

/**
 * Kata programación reactiva
 * Training ciclo 3 - programación de software
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
                new Futbolista("Jose", "Mendez", 17, List.of(
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
        return null;
    }

    //TODO retornar un Mono con el valor "Hola Mundo"
    Mono<String> monoHolaMundo() {
        return null;
    }

    /*TODO del flux futbolista retornar un Mono con el primer flujo encontrado que la edad sea mayor
        al valor entregado como parametro
     */
    Mono<Futbolista> futbolistaEdadIgualAlValor(Integer valor) {
        return null;
    }

    //TODO sumar todas las copas de los futbolistas usar flatmapIterable
    Mono<Integer> sumarTodasLasCopasAmerica() {
        return null;

    }

    //TODO retornar los nombres de los futbolistas que tengan la edad mayor a 12
    Flux<String> LosNombreDeLosFutbolistaConEdadMayorADoce() {
        return null;
    }

    //TODO combinar dos flujos Mono string, usar zip
    Flux<Tuple2<String, String>> combinarDosFlujosConZip() {
        var flujo01 = Mono.just("Luis");
        var flujo02 = Mono.just("Thomas");

        return null;

    }

    //TODO retornar la cuenta del numero de flujos emitidos del Flux futbolista
    Mono<Long> contarNumeroDeFlujos(){
        return null;
    }

}
