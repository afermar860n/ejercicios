import java.util.Scanner;
public class Calculadora {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();

        entrada.close();

        double resultadoSuma = a + b;
        double resultadoResta = a - b;
        double resultadoMulti = a * b;
        double resultadoDiv = a / b;

        System.out.println("suma de a + b = "+ resultadoSuma);
        System.out.println("resta de a - b = "+ resultadoResta);
        System.out.println("multiplicacion de a * b = "+ resultadoMulti);
        System.out.println("division de a / b = "+ resultadoDiv);
        System.out.println("Hasta luego Pitagoras.");

    }
}
