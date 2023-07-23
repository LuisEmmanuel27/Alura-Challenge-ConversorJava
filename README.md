# Alura-Challenge-ConversorJava

# Conversor de Divisas y Temperaturas

El Conversor de Divisas y Temperaturas es un programa Java que permite realizar conversiones entre diferentes monedas y unidades de temperatura. A través de una interfaz gráfica simple y amigable, el usuario puede seleccionar el tipo de conversión que desea realizar y proporcionar los valores necesarios para obtener el resultado de la conversión.

## Funcionamiento

El programa consta de dos tipos de conversión: Divisas y Temperaturas.

### Conversión de Divisas

Al seleccionar la opción "Divisas", el usuario puede ingresar un valor numérico en pesos mexicanos (MXN) y elegir una de las siguientes opciones de conversión:
- Peso mexicano a dólares estadounidenses (USD)
- Peso mexicano a euros (EUR)
- Peso mexicano a libras esterlinas (GBP)
- Peso mexicano a yen japonés (JPY)
- Peso mexicano a won surcoreano (KRW)

El programa utiliza una clase `Monedas` para realizar las conversiones de divisas, donde cada opción de conversión corresponde a un método específico. Si el usuario selecciona una conversión inversa, por ejemplo, de dólares a pesos mexicanos, se utiliza un método especial para realizar la operación inversa.

### Conversión de Temperaturas

Si elige la opción "Temperaturas", el usuario puede ingresar un valor numérico de temperatura en Celsius (°C) y seleccionar uno de los siguientes tipos de conversión:
- Celsius a Kelvin (K)
- Celsius a Fahrenheit (°F)
- Kelvin a Celsius (°C)
- Kelvin a Fahrenheit (°F)
- Fahrenheit a Celsius (°C)
- Fahrenheit a Kelvin (K)

El programa utiliza una clase `Temperaturas` para gestionar las conversiones de temperatura. Se emplean enumeraciones (enums) para definir los diferentes tipos de temperatura, lo que evita conflictos y ambigüedades en las conversiones.

## Manejo de Errores

Para garantizar el correcto funcionamiento del programa y evitar que se produzcan excepciones o errores inesperados, se han implementado algunas medidas de manejo de errores importantes:

1. **Validación de Entrada**: Cuando el usuario ingresa un valor numérico en el cuadro de diálogo, el programa valida que el valor sea numérico. Si se introduce un valor no válido, como una cadena de texto o un valor en blanco, se muestra un cuadro de diálogo de error para informar al usuario y pedir un valor válido.

2. **Selección de Opciones**: En las opciones de conversión, se valida que el usuario seleccione una opción válida. Si no se selecciona ninguna opción, el programa no realiza ninguna acción y simplemente muestra nuevamente el cuadro de diálogo de selección.

3. **Recursión Limitada**: En el caso de la conversión de divisas y temperaturas, se ha implementado la recursión para permitir al usuario realizar varias conversiones consecutivas. Sin embargo, se ha establecido un límite para evitar el desbordamiento de la pila de llamadas y garantizar la estabilidad del programa.

## Conclusiones

El Conversor de Divisas y Temperaturas es una herramienta sencilla pero eficiente para realizar conversiones entre diferentes monedas y unidades de temperatura. Su interfaz gráfica amigable facilita su uso para usuarios de diferentes niveles de habilidad. Además, gracias a las medidas de manejo de errores implementadas, se asegura un funcionamiento robusto y evita que el programa se rompa o muestre resultados incorrectos ante situaciones imprevistas. El uso de enumeraciones en la clase de Temperaturas ayuda a tener un código más legible, mantenible y libre de ambigüedades en las conversiones de temperaturas.

El programa es una herramienta útil para usuarios que necesitan realizar conversiones rápidas y precisas entre divisas y temperaturas en un entorno gráfico intuitivo.
