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

    @Test
    void sumarTodasLasCopasAmerica(){
        var kata = kataReactivo.sumarTodasLasCopasAmerica();
        StepVerifier
                .create(kata)
                .expectNext(17)
                .verifyComplete();
    }

    @Test
    void LosNombreDeLosFutbolistaConEdadMayorADoce(){
        var kata = kataReactivo.LosNombreDeLosFutbolistaConEdadMayorADoce();
        StepVerifier
                .create(kata)
                .expectNext("Pepito")
                .expectNext("Jose")
                .verifyComplete();
    }

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
}