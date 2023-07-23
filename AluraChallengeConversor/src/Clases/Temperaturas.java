package Clases;

import java.text.DecimalFormat;

public class Temperaturas {
    private double valor;
    private double result;
    private UnidadTemperatura unidadOrigen;
    private UnidadTemperatura unidadDestino;

    public enum UnidadTemperatura {
        CELSIUS,
        KELVIN,
        FAHRENHEIT
    }

    public Temperaturas(double valor, UnidadTemperatura unidadOrigen) {
        this.valor = valor;
        this.unidadOrigen = unidadOrigen;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setUnidadOrigen(UnidadTemperatura unidadOrigen) {
        this.unidadOrigen = unidadOrigen;
    }

    public void setUnidadDestino(UnidadTemperatura unidadDestino) {
        this.unidadDestino = unidadDestino;
    }

    public void convert() {
        switch (unidadOrigen) {
            case CELSIUS:
                switch (unidadDestino) {
                    case KELVIN:
                        this.result = this.valor + 273.15;
                        break;
                    case FAHRENHEIT:
                        this.result = (this.valor * 9.0 / 5.0) + 32.0;
                        break;
                }
                break;
            case KELVIN:
                switch (unidadDestino) {
                    case CELSIUS:
                        this.result = this.valor - 273.15;
                        break;
                    case FAHRENHEIT:
                        this.result = (this.valor - 273.15) * 9.0 / 5.0 + 32.0;
                        break;
                }
                break;
            case FAHRENHEIT:
                switch (unidadDestino) {
                    case CELSIUS:
                        this.result = (this.valor - 32.0) * 5.0 / 9.0;
                        break;
                    case KELVIN:
                        this.result = (this.valor - 32.0) * 5.0 / 9.0 + 273.15;
                        break;
                }
                break;
        }
    }

    private String formatResult(double value) {
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(value);
    }

    public String getResultString() {
        return "La conversión de " + this.valor + " " + unidadOrigen + " a " + unidadDestino + " es " + formatResult(this.result);
    }
}
