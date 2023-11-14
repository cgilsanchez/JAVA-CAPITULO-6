public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Los 20 numeros aleatorios entre 0-10 son: ");
        for (int i = 0; i < 20; i++) {
            int numero = (int)(Math.random()*11);
            System.out.print(numero + "  ");
        }
    }
}
