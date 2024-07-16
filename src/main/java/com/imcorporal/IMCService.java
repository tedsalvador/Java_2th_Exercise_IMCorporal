package com.imcorporal;

public class IMCService {
    public String determinarCategoriaIMC(double imc) {
        if (imc < 16) {
            return "Delgadez severa";
        } else if (imc >= 16 && imc < 17) {
            return "Delgadez moderada";
        } else if (imc >= 17 && imc < 18.5) {
            return "Delgadez leve";
        } else if (imc >= 18.5 && imc < 25) {
            return "Peso normal";
        } else if (imc >= 25 && imc < 30) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc < 35) {
            return "Obesidad leve";
        } else if (imc >= 35 && imc < 40) {
            return "Obesidad moderada";
        } else if (imc >= 40) {
            return "Obesidad morbida";
        } else {
            return "Error - fuera escala";
        }
    }
}
