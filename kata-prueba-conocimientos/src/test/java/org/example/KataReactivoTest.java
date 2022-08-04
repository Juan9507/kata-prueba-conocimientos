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

    }

    //TODO realizar el test con StepVerifier
    @Test
    void monoHolaMundo() {
        var mono = kataReactivo.monoHolaMundo();

    }

    //TODO realizar el test con StepVerifier, recomendación usar consumeNextWith
    @Test
    void futbolistaEdadIgualAlValor() {
        var mono = kataReactivo.futbolistaEdadIgualAlValor(12);

    }

    //TODO realizar el test con StepVerifier
    @Test
    void sumarTodasLasCopasAmerica() {
        var kata = kataReactivo.sumarTodasLasCopasAmerica();

    }

    //TODO realizar el test con StepVerifier
    @Test
    void LosNombreDeLosFutbolistaConEdadMayorADoce() {
        var kata = kataReactivo.LosNombreDeLosFutbolistaConEdadMayorADoce();

    }

    //TODO realizar el test con StepVerifier
    @Test
    void combinarDosFlujosConZip() {
        var kata = kataReactivo.combinarDosFlujosConZip();

    }

    //TODO realizar el test con StepVerifier
    @Test
    void contarNumeroDeFlujos() {
        var kata = kataReactivo.contarNumeroDeFlujos();

    }
}