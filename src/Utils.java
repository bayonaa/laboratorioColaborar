import java.util.Scanner;

public class Utils {
    static Scanner sc = new Scanner(System.in);

    public static double validaDouble() {
        while(!sc.hasNextDouble()) {
            System.out.println("Por favor, introduce un número válido");
            sc.nextLine();
        }
        return sc.nextDouble();
    }

    public static int validaInt() {
        while(!sc.hasNextInt()) {
            System.out.println("Por favor, introduce un número válido");
            sc.nextLine();
        }
        return sc.nextInt();
    }

    public static char validaChar() {
        while (!sc.hasNext()) {
            System.out.println("Por favor, introduce un carácter válido");
            sc.nextLine();
        }
        char result = sc.next().charAt(0);
        sc.nextLine();
        return result;
    }

    public static String validaString() {
        while (!sc.hasNext()) {
            System.out.println("Por favor, introduce una cadena de texto válida");
            sc.nextLine();
        }
        return sc.nextLine();
    }
}