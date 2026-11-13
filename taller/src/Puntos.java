import java.util.Scanner;

public class Puntos {
    void punto1(){
        String texto1 = "hola";
        String texto2 = "mundo";

        String resultado = texto1 + " " + texto2;

        System.out.print(resultado);
    }
    void punto2(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("ingrese tu  nombre :)");
        String nombre = scanner.nextLine();
        System.out.println("hola" + nombre );

    }
    void punto3(){
Scanner scanner = new Scanner(System.in);

System.out.print("ingrese un numero");
double numero = scanner.nextDouble();

double cuadrado = numero + numero;
System.out.print("El cuadrado de "+ numero +"es: + cuadrado");
    }
    void punto4() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        double suma = numero1 + numero2;
        System.out.print("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
    }
    void punto5() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = numero1 / numero2;
        double residuo = numero1 % numero2;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Residuo: " + residuo);
    }
    void punto6() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número decimal: ");
        double numero = scanner.nextDouble();

        int parteEntera = (int) numero;
        double parteDecimal = numero - parteEntera;

        System.out.println("Parte entera: " + parteEntera);
        System.out.println("Parte decimal: " + parteDecimal);
    }
    double calcularPromedio(double n1, double n2, double n3, double n4, double n5) {
        double notaFinal = (n1 * 0.15) + (n2 * 0.20) + (n3 * 0.15) + (n4 * 0.30) + (n5 * 0.20);
        return notaFinal;
    }

    void punto7() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la nota 1 (15%): ");
        double n1 = scanner.nextDouble();

        System.out.print("Ingrese la nota 2 (20%): ");
        double n2 = scanner.nextDouble();

        System.out.print("Ingrese la nota 3 (15%): ");
        double n3 = scanner.nextDouble();

        System.out.print("Ingrese la nota 4 (30%): ");
        double n4 = scanner.nextDouble();

        System.out.print("Ingrese la nota 5 (20%): ");
        double n5 = scanner.nextDouble();

        double resultadoFinal = calcularPromedio(n1, n2, n3, n4, n5);
        System.out.println("La nota final es: " + resultadoFinal);
    }
    double calcularIVA(double precioBruto) {
        double precioConIva = precioBruto * 1.19;
        return precioConIva;
    }

    void punto8() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio bruto de la venta: ");
        double precioBruto = scanner.nextDouble();

        double precioConIva = calcularIVA(precioBruto);
        double valorIva = precioConIva - precioBruto;

        System.out.println("Valor original (precio bruto): " + precioBruto);
        System.out.println("Valor del IVA (19%): " + valorIva);
        System.out.println("Valor de la venta con IVA incluido: " + precioConIva);
    }
    void punto9() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();

        double pi = 3.1416;
        double perimetro = 2 * pi * radio;
        double area = pi * (radio * radio);

        System.out.println("El perímetro del círculo es: " + perimetro);
        System.out.println("El área del círculo es: " + area);
    }
    void punto10() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud de un lado del hexágono: ");
        double lado = scanner.nextDouble();

        double raizDeTres = Math.sqrt(3);
        double ladoAlCuadrado = lado * lado;

        double area = (3 * raizDeTres * ladoAlCuadrado) / 2;

        System.out.println("El área del hexágono regular es: " + area);
    }
    void punto11() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos números desea ingresar? ");
        int n = scanner.nextInt();

        double suma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            double numero = scanner.nextDouble();
            suma = suma + numero;
        }

        double promedio = suma / n;

        System.out.println("El promedio de los " + n + " números es: " + promedio);
    }
    void punto12() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de x1: ");
        double x1 = scanner.nextDouble();

        System.out.print("Ingrese el valor de y1: ");
        double y1 = scanner.nextDouble();

        System.out.print("Ingrese el valor de x2: ");
        double x2 = scanner.nextDouble();

        System.out.print("Ingrese el valor de y2: ");
        double y2 = scanner.nextDouble();

        double diferenciaX = x2 - x1;
        double diferenciaY = y2 - y1;

        double cuadradoX = diferenciaX * diferenciaX;
        double cuadradoY = diferenciaY * diferenciaY;

        double sumaCuadrados = cuadradoX + cuadradoY;
        double distancia = Math.sqrt(sumaCuadrados);

        System.out.println("La distancia entre los dos puntos es: " + distancia);
    }
    void punto13() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un dígito: ");
        int n = scanner.nextInt();

        int nn = (n * 10) + n;
        int nnn = (nn * 10) + n;

        int suma = n + nn + nnn;

        System.out.println("Primer número (n): " + n);
        System.out.println("Segundo número (nn): " + nn);
        System.out.println("Tercer número (nnn): " + nnn);
        System.out.println("La suma de los tres números es: " + suma);
    }
    void punto14() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de segundos: ");
        int totalSegundos = scanner.nextInt();

        int horas = totalSegundos / 3600;
        int restoSegundos = totalSegundos % 3600;
        int minutos = restoSegundos / 60;
        int segundos = restoSegundos % 60;

        System.out.println("Resultado -> " + horas + ":" + minutos + ":" + segundos);
    }
    //parte 2
    void punto15() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        int residuo = numero % 2;

        if (residuo == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
    }
    void punto16() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        double numero = scanner.nextDouble();

        if (numero > 0) {
            System.out.println("El número " + numero + " es positivo.");
        } else if (numero < 0) {
            System.out.println("El número " + numero + " es negativo.");
        } else {
            System.out.println("El número es cero (neutro).");
        }
    }
    void punto17() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio bruto de la venta: ");
        double precioBruto = scanner.nextDouble();

        double precioConDescuento = precioBruto;

        if (precioBruto > 150000) {
            double valorDescuento = precioBruto * 0.05;
            precioConDescuento = precioBruto - valorDescuento;
        }

        double precioConIva = calcularIVA(precioConDescuento);
        double valorIva = precioConIva - precioConDescuento;

        System.out.println("Precio bruto inicial: " + precioBruto);
        System.out.println("Precio a calcular (con descuento si aplica): " + precioConDescuento);
        System.out.println("Valor del IVA (19%): " + valorIva);
        System.out.println("Valor total de la venta con IVA incluido: " + precioConIva);
    }
    void punto18() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la nota 1 (15%): ");
        double n1 = scanner.nextDouble();

        System.out.print("Ingrese la nota 2 (20%): ");
        double n2 = scanner.nextDouble();

        System.out.print("Ingrese la nota 3 (15%): ");
        double n3 = scanner.nextDouble();

        System.out.print("Ingrese la nota 4 (30%): ");
        double n4 = scanner.nextDouble();

        System.out.print("Ingrese la nota 5 (20%): ");
        double n5 = scanner.nextDouble();

        double notaFinal = calcularPromedio(n1, n2, n3, n4, n5);

        System.out.println("La nota final es: " + notaFinal);

        if (notaFinal < 2.0) {
            System.out.println("No puede habilitar.");
        } else if (notaFinal < 3.0) {
            System.out.println("Reprobó.");
        } else {
            System.out.println("Aprobó.");
            if (notaFinal > 4.5) {
                System.out.println("¡Felicitaciones por su excelente desempeño!");
            }
        }
    }
    void resolverEcuacionCuadratica(double a, double b, double c) {
        double discriminante = (b * b) - (4 * a * c);

        if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

            System.out.println("La ecuación tiene dos soluciones reales distintas:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminante == 0) {
            double x = -b / (2 * a);

            System.out.println("La ecuación tiene una solución real repetida:");
            System.out.println("x = " + x);
        } else {
            System.out.println("La ecuación no tiene soluciones reales (sus raíces son complejas).");
        }
    }

    void punto19() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Ingrese el valor de c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Error: El valor de 'a' no puede ser cero en una ecuación cuadrática.");
        } else {
            resolverEcuacionCuadratica(a, b, c);
        }
    }
    void punto20() {
        Scanner scanner = new Scanner(System.in);

        String usuarioCorrecto = "carlos";
        String contrasenaCorrecta = "1234";

        System.out.print("Ingrese su usuario: ");
        String usuarioIngresado = scanner.nextLine();

        System.out.print("Ingrese su contraseña: ");
        String contrasenaIngresada = scanner.nextLine();

        if (usuarioIngresado.equals(usuarioCorrecto) && contrasenaIngresada.equals(contrasenaCorrecta)) {
            System.out.println("Acceso concedido. ¡Bienvenido, " + usuarioIngresado + "!");
        } else {
            System.out.println("Acceso denegado. Usuario o contraseña incorrectos.");
        }
    }
    void punto21() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entre 0 y 10: ");
        int numero = scanner.nextInt();

        switch (numero) {
            case 0:
                System.out.println("CERO");
                break;
            case 1:
                System.out.println("UNO");
                break;
            case 2:
                System.out.println("DOS");
                break;
            case 3:
                System.out.println("TRES");
                break;
            case 4:
                System.out.println("CUATRO");
                break;
            case 5:
                System.out.println("CINCO");
                break;
            case 6:
                System.out.println("SEIS");
                break;
            case 7:
                System.out.println("SIETE");
                break;
            case 8:
                System.out.println("OCHO");
                break;
            case 9:
                System.out.println("NUEVE");
                break;
            case 10:
                System.out.println("DIEZ");
                break;
            default:
                System.out.println("El número está fuera del rango permitido (0 a 10).");
                break;
        }
    }
    void punto22() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número menor a 100.000: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Por favor, ingrese un número positivo.");
        } else if (numero >= 100000) {
            System.out.println("El número excede el límite permitido (debe ser menor a 100.000).");
        } else {
            int contador = 0;
            int temporal = numero;

            if (temporal == 0) {
                contador = 1;
            } else {
                while (temporal > 0) {
                    temporal = temporal / 10;
                    contador++;
                }
            }

            System.out.println("El número " + numero + " tiene " + contador + " dígitos.");
        }
    }
    void punto23() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double n1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double n2 = scanner.nextDouble();

        System.out.print("Ingrese el tercer número: ");
        double n3 = scanner.nextDouble();

        if (n1 < n2 && n2 < n3) {
            System.out.println("Los números " + n1 + ", " + n2 + ", " + n3 + " están incrementando.");
        } else if (n1 > n2 && n2 > n3) {
            System.out.println("Los números " + n1 + ", " + n2 + ", " + n3 + " están disminuyendo.");
        } else {
            System.out.println("Los números " + n1 + ", " + n2 + ", " + n3 + " ni se incrementan ni disminuyen.");
        }
    }
    void punto24() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número del día de la semana (entre 1 y 7): ");
        int dia = scanner.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("El número está fuera del rango permitido (debe ser entre 1 y 7).");
                break;
        }
    }
    String invertirTexto(String textoOriginal) {
        String textoInvertido = "";

        for (int i = textoOriginal.length() - 1; i >= 0; i--) {
            textoInvertido = textoInvertido + textoOriginal.charAt(i);
        }

        return textoInvertido;
    }

    void punto25() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un texto largo: ");
        String texto = scanner.nextLine();

        String resultado = invertirTexto(texto);

        System.out.println("Texto invertido: " + resultado);
    }
    void punto26() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un texto largo: ");
        String texto = scanner.nextLine();

        String resultado = "";
        boolean convertirMayuscula = true;

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);

            if (caracter == ' ') {
                convertirMayuscula = true;
                resultado = resultado + caracter;
            } else {
                if (convertirMayuscula) {
                    resultado = resultado + Character.toUpperCase(caracter);
                    convertirMayuscula = false;
                } else {
                    resultado = resultado + Character.toLowerCase(caracter);
                }
            }
        }

        System.out.println("Texto con la primera letra en mayúscula: " + resultado);
    }
    void punto27() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un texto largo: ");
        String texto = scanner.nextLine();

        String textoLimpio = texto.trim();

        if (textoLimpio.isEmpty()) {
            System.out.println("El texto está vacío.");
        } else {
            String[] palabras = textoLimpio.split("\\s+");

            if (palabras.length < 2) {
                System.out.println("El texto no tiene suficientes palabras para determinar una penúltima palabra.");
            } else {
                String penultimaPalabra = palabras[palabras.length - 2];
                System.out.println("La penúltima palabra es: " + penultimaPalabra);
            }
        }
    }
    void punto28() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer texto (a buscar): ");
        String texto1 = scanner.nextLine();

        System.out.print("Ingrese el segundo texto (principal): ");
        String texto2 = scanner.nextLine();

        boolean contiene = texto2.contains(texto1);

        if (contiene) {
            System.out.println("El segundo texto SÍ contiene el primer texto.");
        } else {
            System.out.println("El segundo texto NO contiene el primer texto.");
        }
    }
    boolean esPalindromo(String palabra) {
        String original = palabra.toLowerCase();
        String invertida = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            invertida = invertida + original.charAt(i);
        }

        return original.equals(invertida);
    }


    void punto29() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();

        boolean resultado = esPalindromo(palabra);

        if (resultado) {
            System.out.println("La palabra SÍ es un palíndromo.");
        } else {
            System.out.println("La palabra NO es un palíndromo.");
        }
    }
    double calcularAreaPoligonoRegular(double perimetro, double apotema) {
        double area = (perimetro * apotema) / 2;
        return area;
    }

    void punto30() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el perímetro del polígono: ");
        double perimetro = scanner.nextDouble();

        System.out.print("Ingrese la apotema del polígono: ");
        double apotema = scanner.nextDouble();

        double areaTotal = calcularAreaPoligonoRegular(perimetro, apotema);

        System.out.println("El área del polígono regular es: " + areaTotal);
    }
    //parte 4
    void punto31() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
    void punto32() {
        int contador = 0;
        int numero = 1;

        while (contador < 10) {
            System.out.println(numero);
            numero = numero + 2;
            contador++;
        }
    }
    void punto33() {
        int contador = 0;
        int numero = 2;

        while (contador < 10) {
            System.out.println(numero);
            numero = numero + 2;
            contador++;
        }
    }
    void punto34() {
        Scanner scanner = new Scanner(System.in);
        int numero = -1;

        while (numero <= 0) {
            System.out.print("Ingrese un número entero positivo: ");
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                if (numero <= 0) {
                    System.out.println("El número debe ser mayor a cero. Intente de nuevo.");
                }
            } else {
                System.out.println("Valor no permitido. Debe ingresar un número entero.");
                scanner.next();
            }
        }

        System.out.println("El número entero positivo ingresado es: " + numero);
    }
    void punto35() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número decimal positivo: ");
        int decimal = scanner.nextInt();

        if (decimal == 0) {
            System.out.println("El número en binario es: 0");
        } else {
            String binario = "";
            int numeroAuxiliar = decimal;

            while (numeroAuxiliar > 0) {
                int residuo = numeroAuxiliar % 2;
                binario = residuo + binario;
                numeroAuxiliar = numeroAuxiliar / 2;
            }

            System.out.println("El número " + decimal + " en binario es: " + binario);
        }
    }
    void punto36() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número binario (solo ceros y unos): ");
        String binario = scanner.nextLine();

        int decimal = 0;
        int potencia = 0;

        for (int i = binario.length() - 1; i >= 0; i--) {
            char caracter = binario.charAt(i);

            if (caracter == '1') {
                decimal = decimal + (int) Math.pow(2, potencia);
            } else if (caracter != '0') {
                System.out.println("Advertencia: El carácter '" + caracter + "' no es válido en binario.");
            }

            potencia++;
        }

        System.out.println("El número binario " + binario + " en decimal es: " + decimal);
    }
    void punto37() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    void punto38() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();

        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
    void punto39() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();

        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (filas - i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //problema final ._.
    void punto40() {
        Scanner scanner = new Scanner(System.in);

        final double CAPACIDAD_MAXIMA = 18000.0;
        final double PESO_MAXIMO_BULTO = 500.0;

        System.out.print("Ingrese la tasa de cambio actual (valor de 1 dólar en pesos): ");
        double tasaDolar = scanner.nextDouble();

        int totalBultos = 0;
        double pesoAcumulado = 0;
        double pesoMasPesado = 0;
        double pesoMasLiviano = 0;
        double ingresoTotalPesos = 0;

        boolean continuarRecepcion = true;

        while (continuarRecepcion) {
            System.out.print("\nIngrese el peso del bulto en Kg (o digite 0 para finalizar el vuelo): ");
            double pesoBulto = scanner.nextDouble();

            if (pesoBulto == 0) {
                continuarRecepcion = false;
            } else if (pesoBulto < 0) {
                System.out.println("Error: El peso no puede ser negativo.");
            } else if (pesoBulto > PESO_MAXIMO_BULTO) {
                System.out.println("Bulto rechazado: Excede el límite permitido de 500 Kg por bulto.");
            } else if ((pesoAcumulado + pesoBulto) > CAPACIDAD_MAXIMA) {
                System.out.println("Bulto rechazado: Excede la capacidad restante del avión (" + (CAPACIDAD_MAXIMA - pesoAcumulado) + " Kg disponibles).");
            } else {
                totalBultos++;
                pesoAcumulado = pesoAcumulado + pesoBulto;

                if (totalBultos == 1) {
                    pesoMasPesado = pesoBulto;
                    pesoMasLiviano = pesoBulto;
                } else {
                    if (pesoBulto > pesoMasPesado) {
                        pesoMasPesado = pesoBulto;
                    }
                    if (pesoBulto < pesoMasLiviano) {
                        pesoMasLiviano = pesoBulto;
                    }
                }

                double costoBulto = 0;
                if (pesoBulto > 25 && pesoBulto <= 300) {
                    costoBulto = pesoBulto * 1500;
                } else if (pesoBulto > 300 && pesoBulto <= 500) {
                    costoBulto = pesoBulto * 2500;
                }

                ingresoTotalPesos = ingresoTotalPesos + costoBulto;
                System.out.println("Bulto #" + totalBultos + " aceptado. Costo: $" + costoBulto + " COP | Carga actual: " + pesoAcumulado + " / 18000 Kg.");
            }
        }

        System.out.println("\n--- RESUMEN DEL VUELO BOEING 747 ---");
        if (totalBultos > 0) {
            double pesoPromedio = pesoAcumulado / totalBultos;
            double ingresoTotalDolares = ingresoTotalPesos / tasaDolar;

            System.out.println("a. Número total de bultos ingresados: " + totalBultos);
            System.out.println("b. Peso del bulto más pesado: " + pesoMasPesado + " Kg");
            System.out.println("   Peso del bulto más liviano: " + pesoMasLiviano + " Kg");
            System.out.println("c. Peso promedio de los bultos: " + String.format("%.2f", pesoPromedio) + " Kg");
            System.out.println("d. Ingreso total en pesos: $" + String.format("%.2f", ingresoTotalPesos) + " COP");
            System.out.println("   Ingreso total en dólares: $" + String.format("%.2f", ingresoTotalDolares) + " USD");
        } else {
            System.out.println("No se ingresaron bultos válidos para este vuelo.");
        }
    }

}


