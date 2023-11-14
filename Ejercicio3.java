public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.print("La carta es el: ");
        int palos = (int)(Math.random()*4+1);
        int carta =0;
        switch (palos) {
            case 1:
                carta = (int)(Math.random()*13+1);
                if (carta==10) {
                    System.out.println("" + "Sota"+ " de Basto");
                }else if (carta==11) {
                    System.out.println("" + "Caballo"+ " de Basto");
                }else if (carta==12) {
                    System.out.println("" + "Rey"+ " de Basto");
                }else if (carta==1) {
                    System.out.println("" + "As"+ " de Basto");
                }
                System.out.println(carta+ " de Basto");
            break;
            case 2:
                carta = (int)(Math.random()*13+1);
                if (carta==10) {
                    System.out.println("" + "Sota" + " de Copa");
                }else if (carta==11) {
                    System.out.println("" + "Caballo" + " de Copa");
                }else if (carta==12) {
                    System.out.println("" + "Rey" + " de Copa");
                }else if (carta==1) {
                    System.out.println("" + "As"+ " de Copa");
                }
                System.out.println(carta+ " de Copa");
            break;
            case 3:
                carta = (int)(Math.random()*13+1);
                if (carta==10) {
                    System.out.println("" + "Sota" + " de Oro");
                }else if (carta==11) {
                    System.out.println("" + "Caballo"+ " de Oro");
                }else if (carta==12) {
                    System.out.println("" + "Rey"+ " de Oro");
                }else if (carta==1) {
                    System.out.println("" + "As"+ " de Oro");
                }
                System.out.println(carta+ " de Oro");
            break;
            case 4:
                carta = (int)(Math.random()*13+1);
                if (carta==10) {
                    System.out.println("" + "Sota"+ " de Espada");
                }else if (carta==11) {
                    System.out.println("" + "Caballo"+ " de Espada");
                }else if (carta==12) {
                    System.out.println("" + "Rey"+ " de Espada");
                }else if (carta==1) {
                    System.out.println("" + "As"+ " de Espada");
                }
                System.out.println(carta+ " de Espada");
            break;

            default:
                break;
        }
    }
}
