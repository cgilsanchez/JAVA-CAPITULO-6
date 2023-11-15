public class Ejercicio13 {
    public static void main(String[] args) {
        int n = 0;
        int n1 = 1;
        while (n!=n1) {
            n = (int)(Math.random()*6+1);
            n1 = (int)(Math.random()*6+1);
            System.out.println("Primer dado : "+ n);
            System.out.println("Segundo dado : "+ n1);
            System.out.println();
        }
    }
}
