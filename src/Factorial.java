public class Factorial {
    public static void main(String[] arg)
    {
        final int Numeros = 10;
        for (int i = 1; i <= Numeros; i++) {
            long fact;

            int m;

            fact = 1;

            for (m = i ; m > 1; m--)
                fact *= m;
            System.out.println("x " + i + "! = " + fact);
        }
    }
}
