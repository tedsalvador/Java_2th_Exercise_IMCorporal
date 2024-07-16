package com.imcorporal;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class IMCCalculator {
    private Persona persona;

    public IMCCalculator(Persona persona) {
        this.persona = persona;
    }

    public double calcularIMC() {
        double peso = persona.getPeso();
        double estatura = persona.getEstatura();
        return round(peso / Math.pow(estatura, 2), 2);
    }

    private double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
