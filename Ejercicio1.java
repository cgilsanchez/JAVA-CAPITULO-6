public class Ejercicio1{
    public static void main(String[] args) {
        int dado1 = (int)(Math.random()*7+1);
        int dado2 = (int)(Math.random()*7+1);
        int dado3 = (int)(Math.random()*7+1);
        int suma = 0;
        for (int i = 0; i < 1; i++) {
            suma = dado1 + dado2 + dado3;
            System.out.println(dado1 +" "+ dado2 + " " + dado3);
            
        }
        System.out.println("La suma de los dados es de: " + suma);
        
    }
}