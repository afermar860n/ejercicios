import  java.util.Scanner;
public class Factorial2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int numero;
        do{

        System.out.print("ingresa un numero para calcular su factorial: ");
        numero = s.nextInt();

        long factorial =1;

        if (numero < 0) {

                System.out.print("El factorial no esta definido para numeros negativos");
            }else{
            for (int i = 1; i <= numero; i++) {
                factorial = factorial * i;
            }
            System.out.println("El factorial de " + numero + " es " + factorial);
        }

        } while (numero != -1);
    }
}
