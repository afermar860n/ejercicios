import  java.util.Scanner;
public class swich2 {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int opcion = e.nextInt();

        switch (opcion)
        {
            case 0:
                System.out.println("Cero!");
                break;
            case 1:
                System.out.println("Uno!");
                break;
            case 2:
                System.out.println("Dos!");
                break;
            default:
                System.out.println("Fuera de rango!");
        }

    }
}
