public class Ejercicio6 {
    public static void main(String[] args) {
        int n = (int)(Math.random()*100);
        System.out.print("Intenta adivinar el numero: ");
        int contador = 4;
        
        for (int i = 0; i <5; i++) {
            int n1 = Integer.parseInt(System.console().readLine());
            if (n>n1) {
                System.out.println("El numero secreto es mayor");
                System.out.println("Te quedan "+ contador + " intentos") ;
            }else if (n<n1) {
                System.out.println("El numero secreto es menor");
                System.out.println("Te quedan "+ contador + " intentos") ;
            }
            
            if (n==n1) {
                System.out.println("Has acertado el numero , Enhorabuena");
                break;
            }
            contador--;
        }
            
        
            }
        }
    

