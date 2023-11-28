import java.util.Scanner;

// Esto es un comentario de ejemplo para probar a tener un repositorio colaborativo.

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
        sc.close();
    }
   //menu
   public static void menu(){
        int opcion;
        do {
            do {
                System.out.println("********** MENÚ **********");
                for (int i = 1; i <= 16; i++) {
                    System.out.println(i + ". Ejercicio " + i);
                }
                System.out.println("17. Salir");
                System.out.print("Seleccione un ejercicio (1-17): ");
                opcion = Utils.validaInt();

                if (opcion < 1 || opcion > 17) {
                    System.out.println("Ejercicio inválido. Por favor, seleccione un ejercicio del 1 al 17.");
                    System.out.println();
                }

                switch (opcion) {
                    case 1 -> {
                        System.out.println("Realizando el ejercicio 1");
                        System.out.println();
                        ejercicio1();
                    }
                    case 2 -> {
                        System.out.println("Realizando el ejercicio 2");
                        System.out.println();
                        ejercicio2();
                    }
                    case 3 -> {
                        System.out.println("Realizando el ejercicio 3");
                        System.out.println();
                        ejercicio3();
                    }
                    case 4 -> {
                        System.out.println("Realizando el ejercicio 4");
                        System.out.println();
                        ejercicio4();
                    }
                    case 5 -> {
                        System.out.println("Realizando el ejercicio 5");
                        System.out.println();
                        ejercicio5();
                    }
                    case 6 -> {
                        System.out.println("Realizando el ejercicio 6");
                        System.out.println();
                        ejercicio6();
                    }
                    case 7 -> {
                        System.out.println("Realizando el ejercicio 7");
                        System.out.println();
                        ejercicio7();
                    }
                    case 8 -> {
                        System.out.println("Realizando el ejercicio 8");
                        System.out.println();
                        ejercicio8();
                    }
                    case 9 -> {
                        System.out.println("Realizando el ejercicio 9");
                        System.out.println();
                        ejercicio9();
                    }
                    case 10 -> {
                        System.out.println("Realizando el ejercicio 10");
                        System.out.println();
                        ejercicio10();
                    }
                    case 11 -> {
                        System.out.println("Realizando el ejercicio 11");
                        System.out.println();
                        ejercicio11();
                    }
                    case 12 -> {
                        System.out.println("Realizando el ejercicio 12");
                        System.out.println();
                        ejercicio12();
                    }
                    case 13 -> {
                        System.out.println("Realizando el ejercicio 13");
                        System.out.println();
                        ejercicio13();
                    }
                    case 14 -> {
                        System.out.println("Realizando el ejercicio 14");
                        System.out.println();
                        ejercicio14();
                    }
                    case 15 -> {
                        System.out.println("Realizando el ejercicio 15");
                        System.out.println();
                        ejercicio15();
                    }
                    case 16 -> {
                        System.out.println("Realizando el ejercicio 16");
                        System.out.println();
                        ejercicio16();
                    }
                    case 17 -> System.out.println("Saliendo del programa...");
                }
            } while (true);
        } while (opcion != 17);
    }

    //ejercicio1
    public static void ejercicio1(){
        System.out.println("Introduce el primer valor.");
        System.out.print("> ");
        double n1 = Utils.validaDouble();
        System.out.println();
        System.out.println("Introduce el segundo valor.");
        System.out.print("> ");

        double n2 = Utils.validaDouble();

        double resultado = multiplica(n1, n2);

        System.out.println();
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
    public static double multiplica(double a, double b){
        return a * b;
    }

    //ejercicio2
    public static void ejercicio2(){
        System.out.println("Introduce tu edad.");
        System.out.print("> ");
        int edad = Utils.validaInt();
        System.out.println();

        boolean resultado = esMayorEdad(edad);

        if (resultado){
            System.out.println("Eres mayor de edad.");
        }else {
            System.out.println("Eres menor de edad.");
        }
    }
    public static boolean esMayorEdad(int a) {
        boolean edad = false;
        if (a >= 18) {
            edad = true;
        }
        return edad;
    }//a >= 18

    //ejercicio3
    public static void ejercicio3(){
        System.out.println("Introduce el primer valor.");
        System.out.print("> ");
        int n1 = Utils.validaInt();
        System.out.println();
        System.out.println("Introduce el segundo valor.");
        System.out.print("> ");
        int n2 = Utils.validaInt();
        System.out.println();

        int resultado = minimo(n1, n2);

        System.out.println("El número menor es: " + resultado);
    }
    public static int minimo(int a, int b){
        int minimo;
        if (a < b) {
            minimo = a;
        } else {
            minimo = b;
        }
        return minimo;
    }//return (a < b) ? a : b;

    //ejercicio4
    public static void ejercicio4(){
        System.out.println("Introduce un número.");
        System.out.print("> ");
        int n1 = Utils.validaInt();
        System.out.println();

        int resultado = dimeSigno(n1);
        System.out.println("""
                Si el resultado es -1 el número es negativo.
                Si el resultado es 0 el número es 0.
                Si el resultado es 1 el número es positivo.
                """);
        System.out.println("El resultado es: " + resultado);
    }
    public static int dimeSigno(int a){
        int signo;
        if (a < 0) {
            signo = -1;
        } else if (a > 0){
            signo = 1;
        }else {
            signo = 0;
        }
        return signo;
    }//return (a < 0) ? -1 : (a > 0) ? 1 : 0;

    //ejercicio5
    public static void ejercicio5(){
        System.out.println("Introduce una distancia en millas.");
        System.out.print("> ");
        int n1 = Utils.validaInt();
        System.out.println();

        double resultado = millas_a_kilometros(n1);

        System.out.println("La distancia en kilometros es: " + resultado + " kilometros");
    }
    public static double millas_a_kilometros(int millas){
        return millas * 1.60934;
    }

    //ejercicio6
    public static void ejercicio6(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce el precio del articulo.");
            System.out.print("> ");
            double precioArt = Utils.validaDouble();

            double precioFinal = precioConIVA(precioArt);

            System.out.println("El precio con el 21% del articulo es " + precioFinal + "€");
            System.out.println();
        }
    }
    public static double precioConIVA(double precio){
        return precio * 1.21;
    }

    //ejercicio7
    public static void ejercicio7(){
        System.out.println("Introduce el ancho del rectangulo.");
        System.out.print("> ");
        double ancho = Utils.validaDouble();
        System.out.println();
        System.out.println("Introduce el alto del rectangulo.");
        System.out.print("> ");
        double alto = Utils.validaDouble();
        System.out.println();

        double resultadoPerimetro = perimetroRectangulo(ancho, alto);

        double resultadoArea = areaRectangulo(ancho, alto);

        System.out.println("El perimetro del rectangulo es: " + resultadoPerimetro);
        System.out.println("El area del rectangulo es: " + resultadoArea);
    }
    public static double perimetroRectangulo(double ancho, double alto){
        return 2 * (ancho + alto);
    }
    public static double areaRectangulo(double ancho, double alto){
        return ancho * alto;
    }

    //ejercicio8
    public static void ejercicio8(){
        System.out.println("Introduce un número tope.");
        System.out.print("> ");
        int n = Utils.validaInt();
        System.out.println();

        int suma = suma1aN(n), producto = producto1aN(n);
        double intermedio = intermedio1aN(n);

        System.out.println("Sumatorio de 1 a " + n + ": " + suma);
        System.out.println("Productorio de 1 a " + n + ": " + producto);
        System.out.println("Valor intermedio entre 1 y " + n + ": " + intermedio);
    }
    public static int suma1aN(int n){
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }return suma;
    }
    public static int producto1aN(int n){
        int producto = 1;
        for (int i = 1; i <= n; i++) {
            producto *= i;
        }return producto;
    }
    public static double intermedio1aN(int n){
        return (1 + n) / 2.0;
    }

    //ejercicio9
    public static void ejercicio9() {
        System.out.println("Introduce el primer valor.");
        System.out.print("> ");
        int valor1 = Utils.validaInt();

        System.out.println("Introduce el segundo valor.");
        System.out.print("> ");
        int valor2 = Utils.validaInt();;

        System.out.println("Introduce el tercer valor.");
        System.out.print("> ");
        int valor3 = Utils.validaInt();

        System.out.println("El valor más elevado es: " + valorElevado(valorElevado(valor1, valor2), valor3));
    }
    public static int valorElevado(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    //ejercicio10
    public static void ejercicio10(){
        System.out.println("Introduce el dia.");
        System.out.print("> ");
        int dia = Utils.validaInt();
        System.out.println();
        System.out.println("Introduce el mes.");
        System.out.print("> ");
        int mes = Utils.validaInt();
        System.out.println();
        System.out.println("Introduce el año.");
        System.out.print("> ");
        int anyo = Utils.validaInt();
        System.out.println();

        boolean vaidado = validaFecha(dia, mes, anyo);

        if (vaidado){
            System.out.println("la fecha " + dia + "/" + mes + "/" + anyo + " es valida.");
        }else {
            System.out.println("la fecha " + dia + "/" + mes + "/" + anyo + " no es valida.");
        }
    }
    public static boolean validaFecha(int d, int m, int a){
        boolean validar = false;
        if (d >= 1 && d <= 30) {
            if (m >= 1 && m <= 12) {
                if (a >= 1) {
                    validar = true;
                }
            }
        }
        return validar;
    }

    //ejercicio11
    public static void ejercicio11(){
        System.out.println("Introduce el un número para ver su tabla de multiplicar.");
        System.out.print("> ");
        int n1 = Utils.validaInt();
        System.out.println();
        System.out.println(tablaMultiplicar(n1));

    }
    public static String tablaMultiplicar(int a) {
        StringBuilder tabla = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            tabla.append(a).append(" x ").append(i).append(" = ").append(a * i).append("\n");
        }
        return tabla.toString();
    }

    //ejercicio12
    public static void ejercicio12(){
        System.out.println("Introduce una distancia en kilometros.");
        System.out.print("> ");
        int n1 = Utils.validaInt();
        System.out.println();

        double resultado = kilometros_a_millas(n1);

        System.out.println("La distancia en millas es: " + resultado + " millas");
    }
    public static double kilometros_a_millas(int kilometros){
        return kilometros * 0.62137;
    }

    //ejercicio13
    public static void ejercicio13() {
        System.out.println("Introduce el precio sin descuento.");
        System.out.print("> ");
        double precioSinDescuento = Utils.validaDouble();

        System.out.println("Introduce el precio con descuento.");
        System.out.print("> ");
        double precioConDescuento = Utils.validaDouble();

        double descuento = calcularDescuento(precioSinDescuento, precioConDescuento);

        System.out.println("El porcentaje de descuento aplicado es: " + descuento + "%");
    }
    public static double calcularDescuento(double precioSinDescuento, double precioConDescuento) {
        return ((precioSinDescuento - precioConDescuento) / precioSinDescuento) * 100;
    }

    //ejercicio14
    public static void ejercicio14() {
        System.out.println("Introduce el número de filas de la piramide.");
        System.out.print("> ");
        int n1 = Utils.validaInt();
        System.out.println("Introduce el caráracter para rellenar la piramide.");
        System.out.print("> ");
        char caracter = Utils.validaChar();

        System.out.println(piramide(n1, caracter));
    }
    public static String piramide(int a, char b){
        StringBuilder triangulo = new StringBuilder();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a - i; j++) {
                triangulo.append(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                triangulo.append(b);
            }
            triangulo.append('\n');
        }
        return triangulo.toString();
    }

    //ejercicio15
    public static void ejercicio15() {

        System.out.println("La suma de todo el array es: " + sumaArray());
        System.out.println("La media de todo el array es: " + mediaArray());
    }
    public static int sumaArray() {
        int[] array = new int[100];
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            suma += array[i];
        }
        return suma;
    }
    public static double mediaArray() {
        return (double) sumaArray() / 100;
    }

    //ejercicio16
    public static void ejercicio16() {
        System.out.println("Introduce el tamaño del array.");
        System.out.print("> ");
        int size = Utils.validaInt();

        System.out.println(rellenarArray(size));
    }
    public static String rellenarArray(int a) {
        int[] array = new int[a];
        StringBuilder arrayRelleno = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            arrayRelleno.append(array[i] = (int) (Math.random() * a)).append(" ");
        }
        return arrayRelleno.toString();
    }
}