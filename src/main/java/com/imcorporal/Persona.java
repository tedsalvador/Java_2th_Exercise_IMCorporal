package com.imcorporal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Persona {
    private double peso;
    private double estatura;

    public Persona(double peso, double estatura) {
        this.peso = round(peso, 2);
        this.estatura = round(estatura, 2);
    }

    public double getPeso() {
        return peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setPeso(double peso) {
        this.peso = round(peso, 2);
    }

    public void setEstatura(double estatura) {
        this.estatura = round(estatura, 2);
    }

    private double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
