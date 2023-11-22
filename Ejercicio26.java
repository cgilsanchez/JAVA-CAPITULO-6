public class Ejercicio26 {
    public static void main(String[] args) {
        System.out.print("Introduzca la anchura de la tableta :");
        int anchura = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca la altura de la tableta : ");
        int altura = Integer.parseInt(System.console().readLine());
    
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
