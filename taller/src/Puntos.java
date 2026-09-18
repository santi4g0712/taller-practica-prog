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

        System.out.print("ingrese tu hermoso nombre :)");
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
}
