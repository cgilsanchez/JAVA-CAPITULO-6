public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.print("La carta es el: ");
        int palos = (int)(Math.random()*4+1);
        int carta =0;
        switch (palos) {
            case 1:
                carta = (int)(Math.random()*13+1);
                if (carta==10) {
                    System.out.println("" + "J"+ " de treboles");
                }else if (carta==11) {
                    System.out.println("" + "Q"+ " de treboles");
                }else if (carta==12) {
                    System.out.println("" + "k"+ " de treboles");
                }
                System.out.println(carta+ " de treboles");
            break;
            case 2:
                carta = (int)(Math.random()*13+1);
                if (carta==10) {
                    System.out.println("" + "J" + " de picas");
                }else if (carta==11) {
                    System.out.println("" + "Q" + " de picas");
                }else if (carta==12) {
                    System.out.println("" + "k" + " de picas");
                }
                System.out.println(carta+ " de picas");
            break;
            case 3:
                carta = (int)(Math.random()*13+1);
                if (carta==10) {
                    System.out.println("" + "J" + " de corazones");
                }else if (carta==11) {
                    System.out.println("" + "Q"+ " de corazones");
                }else if (carta==12) {
                    System.out.println("" + "k"+ " de corazones");
                }
                System.out.println(carta+ " de corazones");
            break;
            case 4:
                carta = (int)(Math.random()*13+1);
                if (carta==10) {
                    System.out.println("" + "J"+ " de diamantes");
                }else if (carta==11) {
                    System.out.println("" + "Q"+ " de diamantes");
                }else if (carta==12) {
                    System.out.println("" + "k"+ " de diamantes");
                }
                System.out.println(carta+ " de diamantes");
            break;

            default:
                break;
        }
    }
}
