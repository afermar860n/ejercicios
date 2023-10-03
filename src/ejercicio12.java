import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ancho del local: ");
        double ancho = entrada.nextDouble();

        System.out.println("Largo del local: ");
        double largo = entrada.nextDouble();

        System.out.println("Dimensión baldosa(m2): ");
        double dimensionBaldosa = entrada.nextDouble();

        System.out.println("Nº Baldosas: ");
        double numeroBaldosas = entrada.nextDouble();

        entrada.close();

        double superficieLocal = ancho * largo;

        double totalBaldosa = dimensionBaldosa * numeroBaldosas;

        System.out.println((totalBaldosa >= superficieLocal) ? "verdadero" : "falso");
    }
}
