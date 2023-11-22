public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Los 50 numeros entre el 100 y 199 son :");
        int suma = 0;
        int mayor = 0;
        int menor = 0;
        for (int i = 0; i < 50; i++) {
            int n = (int)(Math.random()*100+100);
            System.out.print(n +"  ");
            suma = suma + n;
            if (n < mayor) {
                menor = n;
            }
            
            if (n > mayor) {
                mayor = n;
            }
        }
        System.out.println(0);
        System.out.println("El numero mas grande es: "+ mayor);
        System.out.println("El numero mas pequeño es: "+ menor);
        System.out.println("La media de estos numeros es de: " + suma/50);

    }
}
