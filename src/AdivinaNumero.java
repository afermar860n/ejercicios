import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

        int num1 , num2;
        num1 = (int) (Math.random()*100+1);

        int contador = 1;

      do {
          System.out.print("Acierta el numero (intento" + contador + ");");
          num2 = s.nextInt();

          if (num1 > num2){
              System.out.print("el numero es mayor \n");
          }
          else if (num1 < num2){
              System.out.print("el numero es menor \n" );
          }
          else{
              System.out.print("¡Acertaste! el numero era " + num1);
          }
          contador++;
          if (contador > 10)
              System.out.print("Lo siento! el numero era " + num1);



      }while (num2 != num1 && contador <= 10);

      s.close();
    }
}
