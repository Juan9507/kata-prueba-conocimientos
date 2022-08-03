package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import reactor.test.StepVerifier;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class Part01MonoTest {

    @InjectMocks
    Part01Mono part01Mono;

    @Test
    void monoEmty() {
        var mono = part01Mono.emtyMono();
        StepVerifier.create(mono).verifyComplete();
    }

    @Test
    void monoHolaMundo(){
        var mono = part01Mono.monoHolaMundo();
        StepVerifier
                .create(mono)
                .expectNext("Hola Mundo")
                .verifyComplete();
    }

    @Test
    void monoUsuario(){
        var mono = part01Mono.monoUsuario();
        StepVerifier.create(mono).consumeNextWith(usuario -> {
            Assertions.assertEquals(18, usuario.getEdad().intValue());
        }).verifyComplete();
    }
}