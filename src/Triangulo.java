public class Triangulo {
    public static void main(String[] a)
    {
        final int NUMLINEAS = 6;
        final char BLANCO = ' ';
        final char ASTERISCO = '*';

        System.out.println(" ");

 // bucle externo: dibuja cada línea

        for (int fila = 1; fila <= NUMLINEAS; fila++)
        {
            System.out.print("\t");

 //primer bucle interno: escribe espacios

            for (int blancos = NUMLINEAS - fila; blancos > 0; blancos--)
                System.out.print(BLANCO);

            for (int cuenta_as = 1; cuenta_as < 2 * fila; cuenta_as++)
                System.out.print(ASTERISCO);

            System.out.println(" ");

        } // fin del bucle externo
    }
}

