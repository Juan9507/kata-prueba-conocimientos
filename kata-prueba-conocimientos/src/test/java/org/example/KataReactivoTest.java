package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import reactor.test.StepVerifier;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(MockitoExtension.class)
class KataReactivoTest {

    @InjectMocks
    KataReactivo kataReactivo;

    //TODO realizar el test con StepVerifier
    @Test
    void monoEmty() {
        var mono = kataReactivo.emtyMono();
        StepVerifier.create(mono).verifyComplete();
    }

    //TODO realizar el test con StepVerifier
    @Test
    void monoHolaMundo(){
        var mono = kataReactivo.monoHolaMundo();
        StepVerifier
                .create(mono)
                .expectNext("Hola Mundo")
                .verifyComplete();
    }

    //TODO realizar el test con StepVerifier, recomendación usar consumeNextWith
    @Test
    void futbolistaEdadIgualAlValor(){
        var mono = kataReactivo.futbolistaEdadIgualAlValor(12);
        StepVerifier.create(mono).consumeNextWith(futbolista -> {
            Assertions.assertEquals(18, futbolista.getEdad().intValue());
        }).verifyComplete();
    }

    //TODO realizar el test con StepVerifier
    @Test
    void sumarTodasLasCopasAmerica(){
        var kata = kataReactivo.sumarTodasLasCopasAmerica();
        StepVerifier
                .create(kata)
                .expectNext(17)
                .verifyComplete();
    }

    //TODO realizar el test con StepVerifier
    @Test
    void LosNombreDeLosFutbolistaConEdadMayorADoce(){
        var kata = kataReactivo.LosNombreDeLosFutbolistaConEdadMayorADoce();
        StepVerifier
                .create(kata)
                .expectNext("Pepito")
                .expectNext("Jose")
                .verifyComplete();
    }

    //TODO realizar el test con StepVerifier
    @Test
    void combinarDosFlujosConZip(){
        var kata = kataReactivo.combinarDosFlujosConZip();
        StepVerifier.create(kata)
                .assertNext(res -> {
                    assertThat(res.getT1()).isEqualTo("Luis");
                    assertThat(res.getT2()).isEqualTo("Thomas");
                })
                .verifyComplete();
    }

    //TODO realizar el test con StepVerifier
    @Test
    void contarNumeroDeFlujos(){
        var kata = kataReactivo.contarNumeroDeFlujos();
        StepVerifier.create(kata)
                .expectNext(3L)
                .verifyComplete();
    }
}