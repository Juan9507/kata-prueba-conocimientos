package org.example;

import org.example.model.Usuario;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Programación reactiva flujo con Mono
 * Training ciclo 3 - programacion de software
 * @author Juan David Rrivera
 * @version [1.0.0]
 * @since  [1.0.0]
 */
public class Part01Mono {

    //TODO retornar un Mono emty
    Mono<String> emtyMono(){
        return Mono.empty();
    }

    //TODO retornar un Mono con los valores "Hola Mundo"
    Mono<String> monoHolaMundo(){
        return Mono.just("Hola Mundo");
    }

    //TODO de un flux de usuarios retornar el usuario mayor de edad como un mono, utilice filter
    Mono<Usuario> monoUsuario(){
        var usuarios = Flux.just(
                new Usuario("Pepito","Suarez", 18,"pepe@gmail.com"),
                new Usuario("Jose","Mendez", 17,"jose@gmail.com"),
                new Usuario("lorito","polo", 12,"loro@gmail.com")
        );
        return usuarios
                .filter(usuario -> usuario.getEdad() >= 18)
                .next();
    }

}
