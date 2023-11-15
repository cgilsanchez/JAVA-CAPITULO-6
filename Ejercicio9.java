public class Ejercicio9 {
    public static void main(String[] args) {
        int n = 0;
        int contador = 0;
        while (n!=24) {
            n= (int)(Math.random()*101);
                if (n%2==0) {
                    System.out.print(n + " ");
                }
            contador++;
        }
        System.out.println();
        System.out.println("Se han generado "+ contador + " numeros");
    }
}
