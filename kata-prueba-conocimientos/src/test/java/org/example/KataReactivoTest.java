package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import reactor.test.StepVerifier;

@ExtendWith(MockitoExtension.class)
class KataReactivoTest {

    @InjectMocks
    KataReactivo kataReactivo;

    @Test
    void monoEmty() {
        var mono = kataReactivo.emtyMono();
        StepVerifier.create(mono).verifyComplete();
    }

    @Test
    void monoHolaMundo(){
        var mono = kataReactivo.monoHolaMundo();
        StepVerifier
                .create(mono)
                .expectNext("Hola Mundo")
                .verifyComplete();
    }

    @Test
    void monoUsuario(){
        var mono = kataReactivo.monoUsuario();
        StepVerifier.create(mono).consumeNextWith(usuario -> {
            Assertions.assertEquals(18, usuario.getEdad().intValue());
        }).verifyComplete();
    }
}