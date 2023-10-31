import java.util.Scanner;

public class Swich {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int opcion = e.nextInt();

    switch (opcion) {
        case 0:
        case 1:
        case 2:
            System.out.println("Menor que 3!");
            break;
        case 3:
            System.out.println("Igual a 3!");
            break;
        default:
            System.out.println("Mayor que 3!");

    }
    }
}

