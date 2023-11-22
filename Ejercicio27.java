public class Ejercicio27 {
    public static void main(String[] args) {
        System.out.print("Turno del jugador(introduzca piedra , papel o tijera ): ");
        String jugador = System.console().readLine();
        String ordenator = " ";
        
        if (jugador.equals("piedra")|| jugador.equals("papel")|| jugador.equals("tijera")) {
            
            int ordenador=(int) (Math.random()*4)+1;
            
        switch (ordenador) {
            case 1:
                ordenator = "piedra";
                break;
            case 2:
                ordenator = "papel";
                break;
        
                case 3:
                ordenator = "tijera";
                break;
            default:
                break;
        }
        }else{
        System.out.println("Introduce bien los datos");
        }
        System.out.println("Turno del ordenador : "+ ordenator);
        if(jugador.equals(ordenator)){
            System.out.println("Empate");
        }else{
            int ganador = 2;
            switch (jugador) {
                case "piedra":
                    if (ordenator.equals("tijera")) {
                        ganador = 1;
                    }
                    break;
                    case "papel":
                    if (ordenator.equals("piedra")) {
                        ganador = 1;
                    }
                    break;
                    case "tijera":
                    if (ordenator.equals("papel")) {
                        ganador = 1;
                    }
                    break;
                default:
                    break;
            }
            if (ganador == 1) {
                System.out.println("Gana el jugador");
            }else{
                System.out.println("Gana el ordenador");
            }
        }
    }
}
