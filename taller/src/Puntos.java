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
}
