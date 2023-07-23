/*
 * Programa realizao por: Luis Emmanuel Ramírez Fernández
 */

package MainProgram;

import javax.swing.JOptionPane;

import Clases.Monedas;
import Clases.Temperaturas;

public class Conversor {
    public static void main(String[] args) {
        int opcion = JOptionPane.showOptionDialog(
                null,
                "¿Qué tipo de conversión deseas realizar?",
                "Elige una opción",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new String[]{"Divisas", "Temperaturas"},
                "Divisas"
        );

        if (opcion == JOptionPane.YES_OPTION) {
            realizarConversionDivisas();
        } else if (opcion == JOptionPane.NO_OPTION) {
            realizarConversionTemperaturas();
        } else {
            // Cerramos el programa si el usuario no elige ninguna opción
            System.exit(0);
        }
    }

    public static void realizarConversionDivisas() {
        String inputValue = JOptionPane.showInputDialog(
                null,
                "Ingresa el valor a convertir:",
                "Conversor de Divisas",
                JOptionPane.QUESTION_MESSAGE
        );

        try {
        	if (inputValue != null && !inputValue.isEmpty()) {
                Monedas conversor = new Monedas(inputValue);

                String[] opciones = {
                        "Peso mexicano a dólares",
                        "Peso mexicano a euros",
                        "Peso mexicano a libras esterlinas",
                        "Peso mexicano a yen japonés",
                        "Peso mexicano a won surcoreano",
                        "Dólares a peso mexicano",
                        "Euros a peso mexicano",
                        "Libras esterlinas a peso mexicano",
                        "Yen japonés a peso mexicano",
                        "Won surcoreano a peso mexicano"
                };

                String selectedOption = (String) JOptionPane.showInputDialog(
                        null,
                        "Selecciona una opción de conversión:",
                        "Conversor de Divisas",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opciones,
                        opciones[0]
                );

                if (selectedOption != null) {
                    switch (selectedOption) {
                        case "Peso mexicano a dólares":
                            conversor.MxToDll();
                            break;
                        case "Peso mexicano a euros":
                            conversor.MxToEur();
                            break;
                        case "Peso mexicano a libras esterlinas":
                            conversor.MxToLibE();
                            break;
                        case "Peso mexicano a yen japonés":
                            conversor.MxToYen();
                            break;
                        case "Peso mexicano a won surcoreano":
                            conversor.MxToWonS();
                            break;
                        case "Dólares a peso mexicano":
                            conversor.setTipo(true); // Indicamos que es conversión inversa
                            conversor.MxToDll();
                            break;
                        case "Euros a peso mexicano":
                            conversor.setTipo(true);
                            conversor.MxToEur();
                            break;
                        case "Libras esterlinas a peso mexicano":
                            conversor.setTipo(true);
                            conversor.MxToLibE();
                            break;
                        case "Yen japonés a peso mexicano":
                            conversor.setTipo(true);
                            conversor.MxToYen();
                            break;
                        case "Won surcoreano a peso mexicano":
                            conversor.setTipo(true);
                            conversor.MxToWonS();
                            break;
                    }

                    JOptionPane.showMessageDialog(
                            null,
                            conversor.toString(),
                            "Resultado de la conversión",
                            JOptionPane.INFORMATION_MESSAGE
                    );

                }
            }
        }catch(NumberFormatException e) {
        	JOptionPane.showMessageDialog(
                    null,
                    "Error: Ingresa un valor numérico válido.",
                    "Error de entrada",
                    JOptionPane.ERROR_MESSAGE
            );
        	
        	int option = JOptionPane.showConfirmDialog(
                    null,
                    "¿Quieres continuar con el programa?",
                    "Continuar",
                    JOptionPane.YES_NO_OPTION
            );

            if (option == JOptionPane.YES_OPTION) {
                realizarConversionDivisas();
            }
        }
    }

    public static void realizarConversionTemperaturas() {
        String inputValue = JOptionPane.showInputDialog(
                null,
                "Ingresa el valor a convertir:",
                "Conversor de Temperaturas",
                JOptionPane.QUESTION_MESSAGE
        );

        if (inputValue != null && !inputValue.isEmpty()) {
            try {
                double valor = Double.parseDouble(inputValue);

                String[] opciones = {
                        "Celsius a Kelvin",
                        "Celsius a Fahrenheit",
                        "Kelvin a Celsius",
                        "Kelvin a Fahrenheit",
                        "Fahrenheit a Celsius",
                        "Fahrenheit a Kelvin"
                };

                String selectedOption = (String) JOptionPane.showInputDialog(
                        null,
                        "Selecciona una opción de conversión:",
                        "Conversor de Temperaturas",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opciones,
                        opciones[0]
                );

                if (selectedOption != null) {
                    Temperaturas.UnidadTemperatura unidadOrigen = Temperaturas.UnidadTemperatura.CELSIUS;
                    Temperaturas.UnidadTemperatura unidadDestino = Temperaturas.UnidadTemperatura.CELSIUS;

                    switch (selectedOption) {
                        case "Celsius a Kelvin":
                            unidadDestino = Temperaturas.UnidadTemperatura.KELVIN;
                            break;
                        case "Celsius a Fahrenheit":
                            unidadDestino = Temperaturas.UnidadTemperatura.FAHRENHEIT;
                            break;
                        case "Kelvin a Celsius":
                            unidadOrigen = Temperaturas.UnidadTemperatura.KELVIN;
                            break;
                        case "Kelvin a Fahrenheit":
                            unidadDestino = Temperaturas.UnidadTemperatura.FAHRENHEIT;
                            break;
                        case "Fahrenheit a Celsius":
                            unidadOrigen = Temperaturas.UnidadTemperatura.FAHRENHEIT;
                            break;
                        case "Fahrenheit a Kelvin":
                            unidadDestino = Temperaturas.UnidadTemperatura.KELVIN;
                            break;
                    }

                    Temperaturas conversor = new Temperaturas(valor, unidadOrigen);
                    conversor.setUnidadDestino(unidadDestino);
                    conversor.convert();

                    JOptionPane.showMessageDialog(
                            null,
                            conversor.getResultString(),
                            "Resultado de la conversión",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Error: Ingresa un valor numérico válido.",
                        "Error de entrada",
                        JOptionPane.ERROR_MESSAGE
                );
            }
            
            int option = JOptionPane.showConfirmDialog(
                    null,
                    "¿Quieres continuar con el programa?",
                    "Continuar",
                    JOptionPane.YES_NO_OPTION
            );

            if (option == JOptionPane.YES_OPTION) {
                realizarConversionTemperaturas();
            }
        }
    }
}

