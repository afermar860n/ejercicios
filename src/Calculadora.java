import java.util.Scanner;
public class Calculadora {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();


        entrada.close();

        double resultadoSuma = suma(a, b);
        double resultadoResta = resta(a, b);
        double resultadoMulti = Multi(a, b);
        double resultadoDiv = Div(a , b);

        System.out.println("suma de a + b = "+ resultadoSuma);
        System.out.println("resta de a - b = "+ resultadoResta);
        System.out.println("multiplicacion de a * b = "+ resultadoMulti);
        System.out.println("division de a / b = "+ resultadoDiv);
        System.out.println("Hasta luego Pitagoras.");

    }
    public static double suma(double a, double b){
        return  a + b;

    }
    public static double resta(double a, double b){
        return  a - b;

    }
    public static double Multi(double a, double b){
        return  a * b;

    }
    public static double Div(double a, double b){
        return  a / b;

    }

}
