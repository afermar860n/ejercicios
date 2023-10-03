import java.util.Scanner;

public class EJERCICIO11 {
    public static void main(String[] args){

        Scanner entrada= new Scanner(System.in);
        System.out.println("Tipo de Vehículo: ");

        char tipoV= entrada.next().charAt(0);

        System.out.println(tipoV);
        System.out.println("Velocida cazado: ");

        int velocidad=entrada.nextInt();

        entrada.close();

/*      String solucion=(tipoV.equals("T") && velocidad>120)?("VERDADERO"):
                        (tipoV.equals("C") && velocidad>100)? ("VERDADERO"):
                        (tipoV.equals("M") && velocidad>50)?("VERDADERO"):("FALSO");*/

        String solucion=(tipoV=='T' && velocidad>120)?("VERDADERO"):
                (tipoV=='C' && velocidad>100)? ("VERDADERO"):
                        (tipoV=='M' && velocidad>50)?("VERDADERO"):("FALSO");

        System.out.println(solucion);
    }
}
