package Clases;

import java.text.DecimalFormat;

public class Monedas {
	private double valor;
	private double result;
	private boolean tipo = false;
	private String monedaMx = " Pesos mexicanos ";
	private String otraMoneda;
	
	// CONTRUCTOR	
	public Monedas(String valor) {
		this.setValor(Double.parseDouble(valor));
	}

	// GETTERS AND SETTERS
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#.##");
        String formattedResult = df.format(this.result);
		
		if(!this.tipo) {
			return "La conversion de $" + this.valor + this.monedaMx + "a" + this.otraMoneda + "es de $" + formattedResult;
		}else {
			return "La conversion de $" + this.valor + this.otraMoneda + "a" + this.monedaMx + "es de $" + formattedResult;
		}
	}

	//METODOS
	private void convert(double rate) {
		if(!this.tipo) {
			this.result = this.valor/rate;			
		}else {
			this.result = this.valor*rate;
		}
	}
	
	 // Peso mexicano a dolar
    public void MxToDll() {
        double Dll = 16.99;
        this.otraMoneda = " Dolares estadounidenses ";
        convert(Dll);
        //return this.result;
    }

    // Peso mexicano a euros
    public double MxToEur() {
        double Eur = 18.91;
        this.otraMoneda = " Euros ";
        convert(Eur);
        return this.result;
    }

    // Peso mexicano a libras esterlinas
    public double MxToLibE() {
        double LibE = 21.84;
        this.otraMoneda = " Libras esterlinas ";
        convert(LibE);
        return this.result;
    }

    // Peso mexicano a yen japones
    public double MxToYen() {
        double Yen = 0.12;
        this.otraMoneda = " Yen japones ";
        convert(Yen);
        return this.result;
    }

    // Peso mexicano a won surcoreano
    public double MxToWonS() {
        double WonS = 0.013;
        this.otraMoneda = " won surcoreano ";
        convert(WonS);
        return this.result;
    }
}
