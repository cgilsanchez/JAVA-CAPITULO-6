public class Ejercicio11 {
    public static void main(String[] args) {
        int n = 0;
        int suspenso = 0;
        int suficiente = 0;
        int bien = 0;
        int notable = 0;
        int sobresaliente = 0;
        for (int i = 0; i < 20; i++) {
            n =(int) (Math.random()*11);
            if (n<5) {
                System.out.println("Suspenso");
                suspenso++;
            }else if (n==5) {
                System.out.println("Suficiente");
                suficiente++;
            }else if (n==6) {
                System.out.println("Bien");
                bien++;
            }else if (n>6 && n<9) {
                System.out.println("Notable");
                notable++;
            }else if (n>8) {
                System.out.println("Sobresaliente");
                sobresaliente++;
            }
        }
        System.out.println();
        System.out.println();
        
        System.out.println("Suspensos: " + suspenso);
        System.out.println("Suficientes: " + suficiente);
        System.out.println("Bien: " + bien);
        System.out.println("Notable: " + notable);
        System.out.println("Sobresaliente: " + sobresaliente);
    }
}
