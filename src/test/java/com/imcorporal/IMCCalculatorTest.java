package com.imcorporal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class IMCCalculatorTest {

    @Test
    public void testCalcularIMC() {
        Persona persona = new Persona(70.0, 1.75);
        IMCCalculator calculadora = new IMCCalculator(persona);
        assertThat(calculadora.calcularIMC(), is(closeTo(22.86, 0.01)));
    }

    @Test
    public void testDeterminarCategoriaIMC() {
        IMCService imcService = new IMCService();
        Persona persona = new Persona(70.0, 1.75);
        IMCCalculator calculadora = new IMCCalculator(persona);
        assertThat(imcService.determinarCategoriaIMC(calculadora.calcularIMC()), is("Peso normal"));

        persona.setPeso(50.0);
        assertThat(imcService.determinarCategoriaIMC(calculadora.calcularIMC()), is("Delgadez moderada"));

        persona.setPeso(80.0);
        assertThat(imcService.determinarCategoriaIMC(calculadora.calcularIMC()), is("Sobrepeso"));

        persona.setPeso(95.0);
        assertThat(imcService.determinarCategoriaIMC(calculadora.calcularIMC()), is("Obesidad leve"));
    }

    @Test
    public void testValoresConDecimales() {
        Persona persona = new Persona(70.567, 1.755);
        assertThat(persona.getPeso(), is(closeTo(70.57, 0.01)));
        assertThat(persona.getEstatura(), is(closeTo(1.76, 0.01)));
    }
}
